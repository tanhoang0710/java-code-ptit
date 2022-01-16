/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSachSinhVienSapXep {
    List<SinhVien> list = new ArrayList<>();
    List<Nhom> n = new ArrayList<>();

    public DanhSachSinhVienSapXep() {
    }
    
    public Nhom getNhom(int stt) {
        return n.get(stt - 1);
    }
    
    public void addNhom(Nhom x) {
        n.add(x);
    }
    
    public void add(SinhVien x) {
        list.add(x);
    }
    
    public void show() {
        Collections.sort(list);
        for (SinhVien x : list) {
            System.out.println(x + " " + getNhom(x.getSttNhom()).getBaiTapLon());
        }
    }
}
