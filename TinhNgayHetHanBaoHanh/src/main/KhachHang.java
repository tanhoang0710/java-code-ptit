/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, hoTen, diaChi, maSP;
    private int sl;
    private Date ngayMua, ngayHetHan;

    public KhachHang() {
    }

    public KhachHang(int index, String hoTen, String diaChi, String maSP, int sl, String ngayMua) {
        this.ma = "KH" + String.format("%02d", index);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.sl = sl;
        try {
            this.ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(ngayMua);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }

    public String getNgayHetHan() {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngayHetHan);
    }
    
    public Date getNgayHetHan1() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
    public void tinhNgayHetHan(int months) {
        Calendar c = Calendar.getInstance();
        c.setTime(ngayMua);
        c.add(Calendar.MONTH, months);
        Date res = c.getTime();
        setNgayHetHan(res);
    }

    public String getMa() {
        return ma;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSl() {
        return sl;
    }
    
        
    
    @Override
    public int compareTo(KhachHang o) {
        if(this.getNgayHetHan1().getTime() - o.getNgayHetHan1().getTime() > 0) return 1;
        else if(this.getNgayHetHan1().getTime() - o.getNgayHetHan1().getTime() < 0) return -1;
        else return this.getMa().compareToIgnoreCase(o.getMa());
    }
}
