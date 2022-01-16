/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author DELL
 */
public class SinhVienException {
    private int ma;
    private String ten;
    private int diem;

    public SinhVienException() {
    }

    public SinhVienException(int ma, String ten) {
//            throws KhongRongException, DuongException {
//        if(ten.isEmpty()) throw new KhongRongException("Ten ko dc rong");
//        if(ma <= 0) throw new DuongException("Ma la so duong");
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ma + "\t" + ten;
    }
}
