/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lophocphan;

import java.util.*;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<Lop> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(Lop x) {
        list.add(x);
    }
    
    public void show(String s) {
        System.out.println("Danh sach cho giang vien " + s + ":");
        Collections.sort(list);
        for (Lop x : list) {
            if(x.getTenGV().equalsIgnoreCase(s)){
                x.show();
            }
        }
    }
}
