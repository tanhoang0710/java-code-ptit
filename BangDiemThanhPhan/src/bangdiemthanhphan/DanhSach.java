/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemthanhphan;

import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<SinhVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(SinhVien x) {
        list.add(x);
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + " ");
            list.get(i).show();
        }
    }
}
