/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dientichdagiac;

/**
 *
 * @author DELL
 */
public class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
