/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class BaiTap {
    private String ten;
    private String ma;

    public BaiTap() {
    }

    public BaiTap(String ten, int index) {
        this.ten = ten;
        this.ma = String.format("%01d", index);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    

    public String getTen() {
        return ten;
    }
    
    public void show() {
        System.out.println(this.getTen() + " " + this.getMa());
    }
}
