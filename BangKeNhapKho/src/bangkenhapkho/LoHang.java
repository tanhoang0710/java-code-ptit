/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangkenhapkho;

/**
 *
 * @author DELL
 */
public class LoHang implements Comparable<LoHang>{
    private String ten, ma;
    private int sl, donGia;

    public LoHang() {
    }

    public LoHang(String ten, int sl, int donGia) {
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
    }
    
    public double getTienGiam() {
        if(sl > 10) return 0.05 * this.getDonGia() * this.getSl();
        else if(sl >= 8) return 0.02 * this.getDonGia() * this.getSl();
        else if(sl >= 5) return 0.01 * this.getDonGia() * this.getSl();
        else return 0;
    }

    public int getSl() {
        return sl;
    }

    public int getDonGia() {
        return donGia;
    }
    
    public void show() {
        double thanhTien = sl * donGia - getTienGiam();
        System.out.println(ma + " " + ten + " " + (int)getTienGiam() + " " + (int)thanhTien);
    }
    
    public String getMa() {
        String tmp[] = ten.split(" ");
        Character c1 = tmp[0].charAt(0);
        Character c2 = tmp[1].charAt(0);
        return c1.toString() + c2.toString();
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Override
    public int compareTo(LoHang o) {
        if(this.getTienGiam() > o.getTienGiam()) return -1;
        else if(this.getTienGiam() < o.getTienGiam()) return 1;
        else return 0;
    }
}
