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
    private List<SinhVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(SinhVien x){
        list.add(x);
    }
    
    public void show(){
        Collections.sort(list);
        for (SinhVien x : list) {
            x.show();
        }
    }
}
