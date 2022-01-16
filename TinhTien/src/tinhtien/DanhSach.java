/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtien;

import java.util.*;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<SanPham> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(SanPham x){
        list.add(x);
    }
    
    public void sapXep(){
        Collections.sort(list);
    }
        
    public void show(){
        for (SanPham x : list) {
            x.show();
        }
    }
}
