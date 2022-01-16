/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timthukhoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<ThiSinh> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(ThiSinh x){
        list.add(x);
    }
    
    private void sapXep(){
        Collections.sort(list);
    }
    
    public void show(){
        sapXep();
        int i = 0;
        while(list.get(i + 1).getTongDiem() == list.get(i).getTongDiem()){
            i++;
        }
        for(int j = 0; j <= i; j++){
            list.get(j).show();
        }
    }
}
