/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachmathang;

/**
 *
 * @author DELL
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, nhom;
    private double giaMua, giaBan;

    public MatHang() {
    }

    public MatHang(int index, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = "MH" + String.format("%02d", index);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }
    
    
    
    public double getLoiNhuan() {
        return giaBan - giaMua;
    }
    
    public void show() {
        //System.out.printf(ma + " " + ten + " " + nhom + " %.0f %.0f %.0f\n", giaMua, giaBan, getLoiNhuan());
        System.out.printf(ma + " " + ten + " " + nhom + " %.2f\n", getLoiNhuan());
    }

    @Override
    public int compareTo(MatHang o) {
       if(this.getLoiNhuan() > o.getLoiNhuan()) return -1;
       else if(this.getLoiNhuan() < o.getLoiNhuan()) return 1;
       else return this.getMa().compareToIgnoreCase(o.getMa());
    }
}
