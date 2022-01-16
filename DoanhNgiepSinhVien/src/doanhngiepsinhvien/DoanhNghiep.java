/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanhngiepsinhvien;

/**
 *
 * @author DELL
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int soSV;

    public DoanhNghiep() {
    }

    public DoanhNghiep(String ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public int getSoSV() {
        return soSV;
    }

    public String getMa() {
        return ma;
    }
    public void show() {
        System.out.println(ma + " " + ten + " " + soSV);
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.getMa().compareToIgnoreCase(o.getMa()) > 0) return 1;
        else return -1;
    }
}
