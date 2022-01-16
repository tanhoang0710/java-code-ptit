/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07010;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class SinhVien{
    private String ma;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private float gpa;
    public SinhVien() {
    }

    public SinhVien(int index, String hoTen, String lop, String ngaySinh, float gpa) {
        this.ma = "B20DCCN" + String.format("%03d", index);
        this.hoTen = chuanHoa(hoTen);
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    
    private String chuanHoa(String hoTen) {
        hoTen = hoTen.trim().toUpperCase();
        String[] t = hoTen.split("\\s+");
        String res = "";
        for (String x : t) {
            res += x.charAt(0) + x.substring(1).toLowerCase() + " ";
        }
        res = res.trim();
        return res;
    }
    
    public void showProfile() {
        Date date = new Date(ngaySinh);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.printf(ma + " " + hoTen + " " + lop + " " + sdf.format(date) + " %.2f\n", gpa);
    }

    @Override
    public String toString() {
        Date date = new Date(ngaySinh);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String str = ma + " " + hoTen + " " + lop + " " + sdf.format(date) + " " + String.format("%.2f", gpa);
        return str;
    }

    public float getGpa() {
        return gpa;
    }
    
    
}
