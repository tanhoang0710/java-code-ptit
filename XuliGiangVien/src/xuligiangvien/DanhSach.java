/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuligiangvien;

import java.util.*;

/**
 *
 * @author DELL
 */
public class DanhSach {
    List<GiangVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(GiangVien x) {
        list.add(x);
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show() {
        for (GiangVien x : list) {
            x.show();
        }
    }
    
    public void loc(String boMon) {
        String[] tmp = boMon.split(" ");
        String res = "";
        for (String x : tmp) {
            Character c = x.charAt(0);
            res += c.toString().toUpperCase();
        }
        System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
        for (GiangVien x : list) {
            if(x.getBoMon().equalsIgnoreCase(boMon)){
                x.show();
            }
        }
    }
    
    public void locTenGanDung(String s) {
        System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
        for (GiangVien x : list) {
            if(x.getHoTen().contains(s.toLowerCase())) {
                x.show();
            }
        }
    }
}
