/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangkenhapkho;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<LoHang> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(LoHang x) {
        list.add(x);
    }
    
    public void show() {
        // cho ma vao map neu da co thi tang value len 1
        Map<String, Integer> m = new HashMap<>();
        
        for (LoHang x : list) {
            m.put(x.getMa(), 0);
        }
        // ko sap xep
        for (LoHang x : list) {
            if(m.containsKey(x.getMa())) {
                m.put(x.getMa(), m.get(x.getMa()) + 1);
                x.setMa(x.getMa().toUpperCase() + String.format("%02d", m.get(x.getMa())));
                // x.show();
            }
        }
        // co sap xep
        Collections.sort(list);
        for (LoHang x : list) {
            x.show();
        }
    }
}
