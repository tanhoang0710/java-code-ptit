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
public class DanhSachMatHang {
    private List<MatHang>list = new ArrayList<>();

    public DanhSachMatHang() {
    }
    
    public void add(MatHang x){
        list.add(x);
    }

    public List<MatHang> getList() {
        return list;
    }
}
