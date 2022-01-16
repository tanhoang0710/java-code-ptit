/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulinhanvien;

/**
 *
 * @author DELL
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten, chucVu;
    private int luongCB, ngayCong;
    
    private int luongChinh, phuCap, conLai, thuNhap, tamUng; 

    public NhanVien() {
    }

    public NhanVien(int index, String ten, String chucVu, int luongCB, int ngayCong) {
        this.ma = "NV" + String.format("%02d", index);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
    }

    public String getChucVu() {
        return chucVu;
    }    

    public int getThuNhap() {
        luongChinh = luongCB * ngayCong;
        if(chucVu.equalsIgnoreCase("GD")){
            phuCap = 500;
        }else if(chucVu.equalsIgnoreCase("PGD")){
            phuCap = 400;
        }else if(chucVu.equalsIgnoreCase("TP")){
            phuCap = 300;
        }else if(chucVu.equalsIgnoreCase("KT")){
            phuCap = 250;
        }else {
            phuCap = 100;
        }
        return luongChinh + phuCap;
    }

    public String getMa() {
        return ma;
    }
    
    
    
    public void show() {
        luongChinh = luongCB * ngayCong;
        if(chucVu.equalsIgnoreCase("GD")){
            phuCap = 500;
        }else if(chucVu.equalsIgnoreCase("PGD")){
            phuCap = 400;
        }else if(chucVu.equalsIgnoreCase("TP")){
            phuCap = 300;
        }else if(chucVu.equalsIgnoreCase("KT")){
            phuCap = 250;
        }else {
            phuCap = 100;
        }
        this.thuNhap = luongChinh + phuCap;
        
        double tu = (phuCap + luongChinh) * 2 / 3.0;
        
        if(tu < 25000) {
            tamUng = (int)(Math.round(tu / 1000.0) * 1000);
        }else {
            tamUng = 25000;
        }
        conLai = luongChinh - tamUng + phuCap;
        System.out.println(ma + " " + ten + " " + phuCap + " " + luongChinh + " " + tamUng + " " + conLai);
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.getThuNhap() < o.getThuNhap()) return 1;
        else if(this.getThuNhap() > o.getThuNhap()) return -1;
        else return this.getMa().compareToIgnoreCase(o.getMa());
    }
    
    
}
