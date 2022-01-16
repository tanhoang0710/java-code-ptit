/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyHieu, ten, donGia, phi;

    public LoaiPhong() {
    }

    public LoaiPhong(String s) {
        String tmp[] = s.split(" ");
        this.kyHieu = tmp[0];
        this.ten = tmp[1];
        this.donGia = tmp[2];
        this.phi = tmp[3];
    }
    
    public void show() {
        System.out.println(kyHieu + " " + ten + " " + donGia + " " + phi);
    }

    @Override
    public String toString() {
        return kyHieu + " " + ten + " " + donGia + " " + phi; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getTen() {
        return ten;
    }
    
    @Override
    public int compareTo(LoaiPhong o) {
        return this.getTen().compareToIgnoreCase(o.getTen());
    }
}
