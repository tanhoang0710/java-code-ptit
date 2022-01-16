/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietkesinhvientheolop;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    List<SinhVien> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(SinhVien x) {
        list.add(x);
    }
    
    
    public void loc(String nganh) {
        System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
        for (SinhVien x : list) {
            if(x.getNganh().equalsIgnoreCase(nganh)) {
                x.showProfile();
            }
        }
    }
    
}
