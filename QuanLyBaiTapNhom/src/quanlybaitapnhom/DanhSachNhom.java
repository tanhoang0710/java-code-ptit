/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSachNhom {
    List<Nhom> list = new ArrayList<>();

    public DanhSachNhom() {
    }
    
    public Nhom getNhom(int stt) {
        return list.get(stt - 1);
    }
    
    public void add(Nhom x) {
        list.add(x);
    }
    
    public void show(int x){
        System.out.println("DANH SACH NHOM " + x + ":");
        list.get(x - 1).show();
        System.out.println("Bai tap dang ky: " + list.get(x - 1).getBaiTapLon());
    }
}
