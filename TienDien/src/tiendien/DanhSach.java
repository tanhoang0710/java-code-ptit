/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

/**
 *
 * @author DELL
 */
import java.util.*;

public class DanhSach {
    private List<KhachHang> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(KhachHang x) {
        list.add(x);
    } 
    
    public void show(){
        for (KhachHang x : list) {
            x.show();
        }
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    
}
