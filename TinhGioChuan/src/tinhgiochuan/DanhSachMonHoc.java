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
public class DanhSachMonHoc {
    private List<MonHoc> list = new ArrayList<>();

    public DanhSachMonHoc() {
    }
    
    public void add(MonHoc x){
        list.add(x);
    }

    public List<MonHoc> getList() {
        return list;
    }
    
    
}
