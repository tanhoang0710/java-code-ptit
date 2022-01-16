/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenhatgianhat;

import java.util.*;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<Nguoi> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(Nguoi x) {
        list.add(x);
    }
    
    public void sapXep() {
        Collections.sort(list);
    }
    
    public void show(){
        sapXep();
        list.get(0).show();
        list.get(list.size() - 1).show();
        
//        for (Nguoi x : list) {
//            x.show();
//        }
    }
}
