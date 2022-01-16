/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlibanhang;

/**
 *
 * @author DELL
 */
public class HoaDon implements Comparable<HoaDon>{
    private String ma, maKH, maMH;
    private int soLuong, loiNhuan;
    private static int index;

    public HoaDon() {
    }

    public HoaDon(String maKH, String maMH, int soLuong) {
        this.ma = "HD" + String.format("%03d", ++index);
        this.maKH = maKH;
        this.maMH = maMH;
        this.soLuong = soLuong;
        this.loiNhuan = 0;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(int loiNhuan) {
        this.loiNhuan = loiNhuan;
    }
    
    
    
    public void show() {
        System.out.print(this.getMa() + " ");
    }

    @Override
    public int compareTo(HoaDon o) {
        if(this.getLoiNhuan() > o.getLoiNhuan()) return -1;
        else if(this.getLoiNhuan() < o.getLoiNhuan()) return 1;
        else return this.getMa().compareToIgnoreCase(o.getMa());
    }
}
