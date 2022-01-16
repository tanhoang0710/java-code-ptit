/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadontiennuoc;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten;
    private int csc, csm;

    public KhachHang() {
    }

    public KhachHang(int index, String ten, int csc, int csm) {
        this.ma = "KH" + String.format("%02d", index);
        this.ten = ten;
        this.csc = csc;
        this.csm = csm;
    }
    
    public int getTien() {
        int diff = csm - csc;
        int tien = 0;
        if(diff <= 50) {
            tien = diff * 100;
        }else if( diff <= 100 ){
            tien = 50 * 100 + (diff - 50) * 150;
        }else {
            tien = 50 * 100 + 50 * 150 + (diff - 100) * 200;
        }
        return tien;
    }
    
    public double getPhuPhi() {
        int diff = csm - csc;
        if(diff > 100) {
            return 0.05;
        } else if( diff > 50) {
            return 0.03;
        }else{
            return 0.02;
        }
    }
    
    public int getTong() {
        double tong = getTien() * (1 + getPhuPhi());
        return (int)(Math.round(tong));
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + getTong());
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.getTong() > o.getTong()) return -1;
        else if(this.getTong() < o.getTong()) return 1;
        else return 0;
    }
}
