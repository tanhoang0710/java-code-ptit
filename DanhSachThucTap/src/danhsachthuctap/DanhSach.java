/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachthuctap;

/**
 *
 * @author DELL
 */
import java.util.*;

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
    
    public void loc(String doanhNghiep) {
        sapXep();
        for (SinhVien x : list) {
            if(x.getDoanhNghiep().equalsIgnoreCase(doanhNghiep)) {
                x.show();
            }
        }
    }
}
