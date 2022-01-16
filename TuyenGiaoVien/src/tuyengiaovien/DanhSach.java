/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuyengiaovien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<GiaoVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(GiaoVien x){
        list.add(x);
    }
    
    public void sapXep(){
        Collections.sort(list);
    }
    
    public void show(){
        for (GiaoVien x : list) {
            x.show();
        }
    }
}
