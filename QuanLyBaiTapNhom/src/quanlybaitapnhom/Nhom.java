/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Nhom {
    List<SinhVien> list = new ArrayList<>();
    private int sttNhom;
    private String baiTapLon;

    public Nhom() {
    }

    public Nhom(int sttNhom) {
        this.sttNhom = sttNhom;
    }

    public String getBaiTapLon() {
        return baiTapLon;
    }

    public void setBaiTapLon(String baiTapLon) {
        this.baiTapLon = baiTapLon;
    }
    

    public int getSttNhom() {
        return sttNhom;
    }

    public void setSttNhom(int sttNhom) {
        this.sttNhom = sttNhom;
    }
    

    public void add(SinhVien x) {
        list.add(x);
    }
    
    public void show() {
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}
