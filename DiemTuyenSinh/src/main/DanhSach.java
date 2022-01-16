/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private ArrayList<ThiSinh> ds = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(ThiSinh x) {
        ds.add(x);
    }
    
    public void show(){
        Collections.sort(ds);
        for (ThiSinh d : ds) {
            d.show();
        }
    }
}
