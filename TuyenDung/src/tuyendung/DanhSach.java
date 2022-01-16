/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuyendung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<ThiSinh> list = new ArrayList<>();

    public DanhSach() {
    }

    public void add(ThiSinh x) {
        list.add(x);
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show(){
        for (ThiSinh x : list) {
            x.show();
        }
    }
    
}
