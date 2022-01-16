/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten;
    private double diemLT, diemTH, diemThi;

    public SinhVien() {
    }

    public SinhVien(int index, String ten, double diemLT, double diemTH, double diemThi) {
        this.ma = "SV" + String.format("%02d", index);;
        this.ten = chuanHoaTen(ten);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemThi = diemThi;
    }

    public String chuanHoaTen(String hoTen) {
        String tmp[] = hoTen.trim().split("\\s+");
        String res = "";
        for (String x : tmp) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return (res.trim());
    }
    
    public double tinhDiemTongKet() {
        return diemLT * 0.25 + diemTH * 0.35 + diemThi * 0.40;
    }
    
    public String getXepLoai() {
        if(tinhDiemTongKet() >= 8) return "GIOI";
        else if(tinhDiemTongKet() >= 6.5) return "KHA";
        else if(tinhDiemTongKet() >= 5) return "TRUNG BINH";
        return "KEM";
    }
    
    public void show() {
        System.out.printf(ma + " " + ten + " %.2f %s\n", tinhDiemTongKet(), getXepLoai());
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.tinhDiemTongKet(), this.tinhDiemTongKet());
    }
    
    
}
