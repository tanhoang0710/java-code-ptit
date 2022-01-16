/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonkhachsan;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<KhachHang> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(KhachHang x) {
        list.add(x);
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show() throws ParseException {
        for (KhachHang x : list) {
            x.show();
        }
    }
}
