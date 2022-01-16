/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dientichdagiac;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class KetQua {
    private List<Double> list = new ArrayList<>();

    public KetQua() {
    }
    
    public void add(double x){
        list.add(x);
    }
    
    public void show() {
        for (Double x : list) {
            System.out.printf("%.3f\n", x);
        }
    }
}
