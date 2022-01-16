/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvitamgiac;

/**
 *
 * @author DELL
 */
public class TamGiac {
    private Point p1, p2, p3;

    public TamGiac() {
    }

    public TamGiac(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    private boolean check1() {
        double canh1 = p1.distance(p2);
        double canh2 = p1.distance(p3);
        double canh3 = p2.distance(p3);
        if ( canh1 + canh2 > canh3 && canh3 + canh2 > canh1 && canh3 + canh1 > canh2 ) return true;
        else return false;
    }
    
    public void chuVi() {
        double canh1 = p1.distance(p2);
        double canh2 = p1.distance(p3);
        double canh3 = p2.distance(p3);
        if(check1()){
            System.out.printf("%.3f\n", canh1 + canh2 + canh3);
        }else {
            System.out.println("INVALID");
        }
    }
    
    public void dienTich() {
        double canh1 = p1.distance(p2);
        double canh2 = p1.distance(p3);
        double canh3 = p2.distance(p3);
        if(check1()){
            double area = Math.sqrt((canh1 + canh2 + canh3) * (canh1 + canh2 - canh3) * (canh2 + canh3 - canh1) * (canh1 - canh2 + canh3)) / 4;
            System.out.printf("%.2f\n", area);
        }else {
            System.out.println("INVALID");
        }
    }
    
    public void dienTichDuongTronNgoaiTiep(){
        double canh1 = p1.distance(p2);
        double canh2 = p1.distance(p3);
        double canh3 = p2.distance(p3);
        if(check1()){
            double area = Math.sqrt((canh1 + canh2 + canh3) * (canh1 + canh2 - canh3) * (canh2 + canh3 - canh1) * (canh1 - canh2 + canh3)) / 4;
            double res = (canh1 * canh2 * canh3) / (4 * area);
            System.out.printf("%.3f\n", res * res * Math.PI);
        }else {
            System.out.println("INVALID");
        }
    }
}
