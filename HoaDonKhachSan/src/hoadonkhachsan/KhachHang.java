/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonkhachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, phong, ngayNhan, ngayTra;
    private int tienPhatSinh;

    public KhachHang() {
    }

    public KhachHang(int index, String ten, String phong, String ngayNhan, String ngayTra, int tienPhatSinh) {
        this.ma = "KH" + String.format("%02d", index);
        this.ten = chuanHoaTen(ten);
        this.phong = phong;
        try {
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan);
            this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").format(d);
            Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);
            this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").format(d1);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        this.tienPhatSinh = tienPhatSinh;
    }
    
    public String chuanHoaTen(String hoTen) {
        String tmp[] = hoTen.trim().split("\\s+");
        String res = "";
        for (String x : tmp) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return (res.trim());
    }
    
    public String getTang() {
        return phong.substring(0,1);
    }
    
    public int getDonGiaTheoTang() {
        if(getTang().equals("1")){
            return 25;
        }else if(getTang().equals("2")){
            return 34;
        }else if(getTang().equals("3")){
            return 50;
        }else if(getTang().equals("4")){
            return 80;
        }
        return 0;
    }
    
    public long getSoNgayO() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = sdf.parse(ngayNhan);
        Date date2 = sdf.parse(ngayTra);
        
        long diff = date2.getTime() - date1.getTime();
        if(diff == 0) {
            return 1;
        }else {
            return (diff / (1000 * 60 * 60 * 24)) + 1;
        }
        
    }
    
    public long getTien() throws ParseException {
        return getDonGiaTheoTang() * getSoNgayO() + tienPhatSinh;
    }
    
    public void show() throws ParseException {
        System.out.println(ma + " " + ten + " " + phong + " " + getSoNgayO() + " " + getTien());
    }

    @Override
    public int compareTo(KhachHang o) {
        try {
            if(this.getTien() > o.getTien()) return -1;
            else if(this.getTien() < o.getTien()) return 1;
            else return 0;
        } catch (ParseException ex) {
            Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
