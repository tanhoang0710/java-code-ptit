/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiaban;

/**
 *
 * @author DELL
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, dv;
    private int giaNhap, sl;

    public MatHang() {
    }

    public MatHang(int index, String ten, String dv, int giaNhap, int sl) {
        this.ma = "MH" + String.format("%02d", index);
        this.ten = ten;
        this.dv = dv;
        this.giaNhap = giaNhap;
        this.sl = sl;
    }
    
    public double getShipMoney() {
        double tien = giaNhap * sl * 0.05;
        return Math.round(tien * 1) / 1.0;
    }
    
    public double getThanhTien() {
        double tien = giaNhap * sl + getShipMoney();
        return Math.round(tien * 1) / 1.0;
    }
    
    public double getGiaBan() {
        return (getThanhTien() * 1.02);
    }
    
    public double getGiaBanSanPham() {
        double res = getGiaBan() / sl;
        return (Math.ceil(res / 100.0))*100;
    }
    
    public void show() {
        System.out.printf(ma + " " + ten + " " + dv + " %.0f %.0f %.0f\n", getShipMoney(), getThanhTien(), getGiaBanSanPham());
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.getGiaBanSanPham() > o.getGiaBanSanPham()) return -1;
        else if(this.getGiaBanSanPham() > o.getGiaBanSanPham()) return 1;
        else return 0;
    }
}
