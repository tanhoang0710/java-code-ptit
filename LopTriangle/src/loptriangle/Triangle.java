/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loptriangle;

/**
 *
 * @author DELL
 */
public class Triangle {
    private Point p1, p2, p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public boolean valid() {
        double canh1 = p1.distance(p2);
        double canh2 = p1.distance(p3);
        double canh3 = p2.distance(p3);
        if ( canh1 + canh2 > canh3 && canh3 + canh2 > canh1 && canh3 + canh1 > canh2 ) return true;
        else return false;
    }
    
    
    public String getPerimeter() {
        double canh1 = p1.distance(p2);
        double canh2 = p1.distance(p3);
        double canh3 = p2.distance(p3);
        double res = canh1 + canh2 + canh3;
        return String.format("%.3f", res);
    }
}
