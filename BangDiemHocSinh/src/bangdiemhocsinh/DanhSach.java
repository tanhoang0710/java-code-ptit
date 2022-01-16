/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemhocsinh;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class DanhSach {
    List<HocSinh> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(HocSinh x) {
        list.add(x);
    }
    
    public void show() {
        for (HocSinh x : list) {
            x.ketQua();
        }
    }
}
