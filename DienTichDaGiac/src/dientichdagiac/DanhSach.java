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
public class DanhSach {
    private List<Point> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(Point p){
        list.add(p);
    }
    
    public double getArea() {
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            sum1 += list.get(i).getX() * list.get(i + 1).getY();
            sum2 += list.get(i).getY() * list.get(i + 1).getX();
        }
        return Math.abs((sum1 - sum2) / 2.0);
    }
    
    public void showArea() {
        System.out.printf("%.3f\n", getArea());
    }
}
