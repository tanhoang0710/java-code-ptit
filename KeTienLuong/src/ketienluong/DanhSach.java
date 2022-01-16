/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketienluong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<NhanVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(NhanVien x) {
        list.add(x);
    }
    
    public int getChiPhi() {
        int sum = 0;
        for (NhanVien x : list) {
            sum += x.getThucLinh();
        }
        return sum;
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show() {
        for (NhanVien x : list) {
            x.show();
        }
    }
}
