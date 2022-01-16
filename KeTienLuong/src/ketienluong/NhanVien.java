/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketienluong;

/**
 *
 * @author DELL
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten, chucVu;
    private int soNgayCong, luongNgay;

    public NhanVien() {
    }

    public NhanVien(int index, String ten, int luongNgay, int soNgayCong, String chucVu) {
        this.ma = "NV" + String.format("%02d", index);
        this.ten = ten;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
        this.luongNgay = luongNgay;
    }
    
    private int getLuongThang() {
        return luongNgay * soNgayCong;
    }
    
    private int getBonus() {
        if(soNgayCong >= 25) 
            return (int)(0.2 * getLuongThang());
        else if(soNgayCong >= 22)
            return (int)(0.1 * getLuongThang());
        else return 0;
    }
    
    private int getPhuCap() {
        if(chucVu.equalsIgnoreCase("GD"))
            return 250000;
        else if(chucVu.equalsIgnoreCase("PGD"))
            return 200000;
        else if(chucVu.equalsIgnoreCase("TP"))
            return 180000;
        else if(chucVu.equalsIgnoreCase("NV"))
            return 150000;
        else return 0;
    }
    
    public int getThucLinh() {
        return (getBonus() + getLuongThang() + getPhuCap());
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + getLuongThang() + " " + getBonus() + " " + getPhuCap() + " " + getThucLinh());
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.getThucLinh() > o.getThucLinh()) return -1;
        else if(this.getThucLinh() < o.getThucLinh()) return 1;
        else return 0;
    }
}
