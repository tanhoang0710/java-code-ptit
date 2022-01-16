/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoantuyensinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<ThiSinh> list = new ArrayList<>();
    private int chiTieu;

    public DanhSach() {
    }
    
    public void setChiTieu(int chiTieu){
        this.chiTieu = chiTieu;
    }
    
    public int getChiTieu(){
        return chiTieu;
    }
    
    public void add(ThiSinh x) {
        list.add(x);
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public double getDiemChuan() {
        sapXep();
        int i = getChiTieu() - 1;
//        while (list.get(i + 1).getTongDiem() == list.get(i).getTongDiem()) {            
//            i += 1;
//        }
        return list.get(i).getTongDiem();
    }
    
    public void show() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showResult(getDiemChuan());
        }
    }
}
