/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loptriangle;

import java.util.Scanner;

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
    
    public double distance(Point secondPoint) {
        double dx = (x - secondPoint.x) * (x - secondPoint.x);
        double dy = (y - secondPoint.y) * (y - secondPoint.y);
        return Math.sqrt(dx + dy);
    }
    
    public double distance(Point p1, Point p2) {
        double dx = (p1.x - p2.x) * (p1.x - p2.x);
        double dy = (p1.y - p2.y) * (p1.y - p2.y);
        return Math.sqrt(dx + dy);
    }
    
    public  static Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
