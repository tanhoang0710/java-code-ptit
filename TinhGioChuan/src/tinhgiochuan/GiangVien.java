/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;

import java.util.*;

/**
 *
 * @author DELL
 */
public class GiangVien {
    private String ma, ten;
    private double tongGio;

    public GiangVien() {
    }

    public GiangVien(String ma, double tongGio) {
        this.ma = ma;
        this.tongGio = tongGio;
    }

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getTongGio() {
        return tongGio;
    }
    
    
    
    public void show() {
        System.out.println(ma + " " + tongGio);
    }
}
