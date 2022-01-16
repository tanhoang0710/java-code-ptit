/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonbanquanao;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSachSanPham {
    private List<LoaiSanPham> list = new ArrayList<>();

    public DanhSachSanPham() {
    }
    
    public void add(LoaiSanPham x) {
        list.add(x);
    }

    public List<LoaiSanPham> getList() {
        return list;
    }
    
    
}
