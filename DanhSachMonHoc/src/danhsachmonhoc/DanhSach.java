/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachmonhoc;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<MonHoc> list = new ArrayList<>();

    public DanhSach() {
    }

    public void add(MonHoc x) {
        list.add(x);
    }
    
    public void show() {
        Collections.sort(list);
        for (MonHoc x : list) {
            System.out.println(x);
        }
    }
}
