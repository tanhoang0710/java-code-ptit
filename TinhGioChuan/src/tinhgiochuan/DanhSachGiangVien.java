/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSachGiangVien {
    private List<GiangVien> list = new ArrayList<>();

    public DanhSachGiangVien() {
    }
    
    public void add(GiangVien x){
        list.add(x);
    }

    public List<GiangVien> getList() {
        return list;
    }
    
}
