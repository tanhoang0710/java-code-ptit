/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    private ArrayList<SinhVien> ds = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(SinhVien x) {
        ds.add(x);
    }
    
    public void show() {
        Collections.sort(ds);
        for (SinhVien d : ds) {
            d.show();
        }
    }
}
