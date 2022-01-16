/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuathang;

/**
 *
 * @author DELL
 */
import java.util.*;

public class DanhSach {
    private List<SanPham> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(SanPham x) {
        list.add(x);
    }
    
    public void show(){
        for (SanPham x : list) {
            x.show();
        }
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void loc(String s) {
        sapXep();
        for (SanPham x : list) {
            if(x.getNhom().equalsIgnoreCase(s)){
                x.show();
            }
        }
    }
}
