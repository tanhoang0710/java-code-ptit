/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlibanhang;

import java.util.*;

/**
 *
 * @author DELL
 */
public class DanhSachKhachHang {
    private List<KhachHang> list = new ArrayList<>();

    public DanhSachKhachHang() {
    }
    
    public void add(KhachHang x) {
        list.add(x);
    }

    public List<KhachHang> getList() {
        return list;
    }
}
