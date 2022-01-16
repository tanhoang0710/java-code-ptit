/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanhngiepsinhvien;

import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<DoanhNghiep> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(DoanhNghiep x){
        list.add(x);
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show() {
        for (DoanhNghiep x : list) {
            x.show();
        }
    }
    
    public void loc(int a, int b){
        sapXep();
        System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b +  " SINH VIEN:");
        for (DoanhNghiep x : list) {
            if(x.getSoSV() >= a && x.getSoSV() <= b){
                x.show();
            }
        }
    }
}
