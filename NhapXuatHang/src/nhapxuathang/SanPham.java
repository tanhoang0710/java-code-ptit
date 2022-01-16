/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuathang;

/**
 *
 * @author DELL
 */
public class SanPham implements Comparable<SanPham>{
    private String ma;
    private int sLNhap;

    public SanPham() {
    }

    public SanPham(String ma, int sLNhap) {
        this.ma = ma;
        this.sLNhap = sLNhap;
    }

    public String getMa() {
        return ma;
    }
    
    public String getNhom() {
        return ((Character)(ma.charAt(0))).toString();
    }

    public int getsLNhap() {
        return sLNhap;
    }
    
    public int getslXuat() {
        double sLXuat = 0;
        String t = ((Character)(ma.charAt(0))).toString();
        if(t.equalsIgnoreCase("A")) {
            sLXuat = ((int) Math.round(sLNhap * 6 / 10.0));
        }else if(t.equalsIgnoreCase("B")){
            sLXuat = ((int) Math.round(sLNhap * 7 / 10.0));
        }
        return (int)sLXuat;
    }
    
    public int getDonGia() {
        int donGia = 0;
        String t = ((Character)(ma.charAt(ma.length() - 1))).toString();
        if(t.equalsIgnoreCase("Y")){
            donGia = 110000;
        }else if(t.equalsIgnoreCase("N")){
            donGia = 135000;
        }
        return donGia;
    }
    
    public int getTien() {
        return getslXuat() * getDonGia();
    }
    
    public int getThue() {
        int thue = 0;
        String t1 = ((Character)(ma.charAt(0))).toString();
        String t2 = ((Character)(ma.charAt(ma.length() - 1))).toString();
        if(t1.equalsIgnoreCase("A") && t2.equalsIgnoreCase("Y")) {
            thue = (int)(0.08 * getTien());
        }else if(t1.equalsIgnoreCase("A") && t2.equalsIgnoreCase("N")) {
            thue = (int)(0.11 * getTien());
        }else if(t1.equalsIgnoreCase("B") && t2.equalsIgnoreCase("Y")) {
            thue = (int)(0.17 * getTien());
        }else if(t1.equalsIgnoreCase("B") && t2.equalsIgnoreCase("N")) {
            thue = (int)(0.22* getTien());
        }
        return thue;
    }
    
    public void show() {
        System.out.println(ma + " " + sLNhap + " " +getslXuat() + " "+ getDonGia() + " " + getTien() + " " + getThue());
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.getThue() > o.getThue()) return -1;
        else if(this.getThue() < o.getThue()) return 1;
        else return 0;
    }
}
