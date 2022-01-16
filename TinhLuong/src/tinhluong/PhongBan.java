/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluong;

/**
 *
 * @author DELL
 */
public class PhongBan {
    private String ma, ten;

    public PhongBan() {
    }

    public PhongBan(String ma, String ten) {
        this.ma = ma;
        this.ten = ten.trim();
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    
    public void show() {
        System.out.println(ten);
    }
}
