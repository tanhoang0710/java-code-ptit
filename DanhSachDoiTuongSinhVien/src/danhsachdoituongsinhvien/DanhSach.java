/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachdoituongsinhvien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach{
    List<SinhVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(SinhVien x) {
        list.add(x);
    }

    public void sapXep() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).getGpa() < list.get(j).getGpa()){
                    SinhVien t = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, t);
                }
            }
        }
    }
    
    public void show() {
        for (SinhVien x : list) {
            x.showProfile();
        }
    }
}
