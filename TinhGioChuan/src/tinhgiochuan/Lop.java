
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;

/**
 *
 * @author DELL
 */
public class Lop {
    private String maGV, maMH;
    private double soGioChuan;

    public Lop() {
    }

    public Lop(String maGV, String maMH, double soGioChuan) {
        this.maGV = maGV;
        this.maMH = maMH;
        this.soGioChuan = soGioChuan;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public double getSoGioChuan() {
        return soGioChuan;
    }

    public void setSoGioChuan(double soGioChuan) {
        this.soGioChuan = soGioChuan;
    }
    
    public void show() {
        System.out.println(maGV + " " + maMH + " " + soGioChuan);
    }
}
