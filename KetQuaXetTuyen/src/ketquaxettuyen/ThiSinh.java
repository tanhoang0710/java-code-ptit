/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketquaxettuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, ngaySinh;
    private double diem1, diem2;

    public ThiSinh() {
    }

    public ThiSinh(int index, String ten, String ngaySinh, double diem1, double diem2) {
        this.ma = "PH" + String.format("%02d", index);
        this.ten = chuanHoaTen(ten);
        try {
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
            this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").format(d);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    
    public String chuanHoaTen(String hoTen) {
        String tmp[] = hoTen.trim().split("\\s+");
        String res = "";
        for (String x : tmp) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return (res.trim());
    }
    
    private int getNamSinh() {
        return Integer.valueOf(ngaySinh.substring(6));
    }
    
    private int getTuoi() {
        return 2021 - getNamSinh();
    }

    public String getMa() {
        return ma;
    }
    
    public double getDiem() {
        double diemThuong = 0;
        if(diem1 >= 8 && diem2 >=8){
            diemThuong = 1;
        }else if(diem1 >= 7.5 && diem2 >= 7.5){
            diemThuong = 0.5;
        }else diemThuong = 0;
        double diemTB = 0;
        diemTB = (diem1 + diem2) / 2 + diemThuong;
        diemTB = Math.round(diemTB * 1) / 1.0;
        if(diemTB >= 10){
            diemTB = 10;
        }
        return diemTB;
    }
        
    public String xepLoai() {
        if(getDiem() == 9 || getDiem() == 10){
            return "Xuat sac";
        }else if(getDiem() == 8){
            return "Gioi";
        }else if(getDiem() == 7){
            return "Kha";
        }else if(getDiem() >= 5 && getDiem() <= 6){
            return "Trung binh";
        }else if(getDiem() < 5){
            return "Truot";
        }
        return "";
    }
    
    public void show() {
        System.out.printf(ma + " " + ten + " " + getTuoi() + " %.0f %s\n", getDiem(), xepLoai());
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getDiem() > o.getDiem()) return -1;
        else if(this.getDiem() < o.getDiem()) return 1;
        else return this.getMa().compareToIgnoreCase(o.getMa());
    }
}
