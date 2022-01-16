/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachkhachhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, gioiTinh, diaChi;
    private String ngaySinh;

    public KhachHang() {
    }

    public KhachHang(int index, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.ma = "KH" + String.format("%03d", index);
        this.ten = chuanHoaTen(ten);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.diaChi = diaChi;
    }
    
    public String chuanHoaTen(String s) {
        s = s.trim().toLowerCase();
        String tmp[] = s.split("\\s+");
        String res = "";
        for (String x : tmp) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }
        return res.trim();
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + gioiTinh + " " + diaChi + " " + ngaySinh);
    }
    
    public String chuanHoaNgaySinh(String s) {
        String tmp[] = s.split("/");
        String res = "";
        String x = "";
        if(tmp[0].length() < 2 && Integer.parseInt(tmp[0]) < 10) {
            x = "0" + tmp[0];
        }else {
            x = tmp[0];
        }
        String y = "";
        if(tmp[1].length() < 2 && Integer.parseInt(tmp[1]) < 10) {
            y = "0" + tmp[1];
        }else {
            y = tmp[1];
        }
        res += x + "/" + y;
        for (int i = 2; i < tmp.length; i++) {
            res += "/" + tmp[i];
        }
        return res;
    } 

    public String getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public int compareTo(KhachHang o) {
        Date d1 = new Date(this.getNgaySinh());
        Date d2 = new Date(o.getNgaySinh());
        return Long.compare(d1.getTime(), d2.getTime());
    }
}
