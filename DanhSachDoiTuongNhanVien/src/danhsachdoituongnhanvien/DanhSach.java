/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachdoituongnhanvien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    List<NhanVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(NhanVien x) {
        list.add(x);
    }
    
    public void show() {
        for (NhanVien x : list) {
            x.showProfile();
        }
    }
    
    public void sapXep() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).getNgaySinh().compareTo(list.get(j).getNgaySinh()) > 0){
                    NhanVien t = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, t);
                }
            }
        }
    }
}
