/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangxephang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show() {
        for (SinhVien x : list) {
            x.show();
        }
    }
}
