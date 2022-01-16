/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulinhanvien;

/**
 *
 * @author DELL
 */

import java.util.*;
public class DanhSach {
    private List<NhanVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(NhanVien x){
        list.add(x);
    }
    
    public void show() {
        for (NhanVien x : list) {
            x.show();
        }
    }
    
    public void loc(String chucVu) {
        for (NhanVien x : list) {
            if(x.getChucVu().equalsIgnoreCase(chucVu)){
                x.show();
            }
        }
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
}
