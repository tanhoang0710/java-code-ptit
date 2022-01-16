/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    List<Khach> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(Khach x){
        list.add(x);
    }
    
    public void show() throws ParseException {
        Collections.sort(list);
        for (Khach x : list) {
            x.show();
        }
    }
}
