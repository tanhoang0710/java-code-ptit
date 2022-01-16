/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluong;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String ma, ten;
    private int luongCB, soNgayCong;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, int luongCB, int soNgayCong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
    }
    
    public String getNhom(){
        Character c = ma.charAt(0);
        return c.toString();
    }
    
    private int getNam() {
        // C06HC
        return Integer.parseInt(ma.substring(1,3));
    }
    
    private int getHeSo() {
        if(getNhom().equalsIgnoreCase("a")){
            if(getNam() >= 1 && getNam() <=3 ){
                return 10;
            }else if(getNam() >= 4 && getNam() <=8 ){
                return 12;
            }else if(getNam() >= 9 && getNam() <= 15 ){
                return 14;
            }else if(getNam() > 16 ){
                return 20;
            }
        }else if(getNhom().equalsIgnoreCase("b")){
            if(getNam() >= 1 && getNam() <=3 ){
                return 10;
            }else if(getNam() >= 4 && getNam() <=8 ){
                return 11;
            }else if(getNam() >= 9 && getNam() <= 15 ){
                return 13;
            }else if(getNam() > 16 ){
                return 16;
            }
        }else if(getNhom().equalsIgnoreCase("c")){
            if(getNam() >= 1 && getNam() <=3 ){
                return 9;
            }else if(getNam() >= 4 && getNam() <=8 ){
                return 10;
            }else if(getNam() >= 9 && getNam() <= 15 ){
                return 12;
            }else if(getNam() > 16 ){
                return 14;
            }
        }else if(getNhom().equalsIgnoreCase("d")){
            if(getNam() >= 1 && getNam() <=3 ){
                return 8;
            }else if(getNam() >= 4 && getNam() <=8 ){
                return 9;
            }else if(getNam() >= 9 && getNam() <= 15 ){
                return 11;
            }else if(getNam() > 16 ){
                return 13;
            }
        }
        return 1;
    }
    
    public int getTienLuong() {
        return luongCB * soNgayCong * getHeSo() * 1000;
    }
    
    public String getMaPhong() {
        return ma.substring(3);
    }
    
    public void show(String tenPhong) {
        System.out.println(ma + " " + ten + " " + tenPhong + " " + getTienLuong());
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + getTienLuong());
    }
}
