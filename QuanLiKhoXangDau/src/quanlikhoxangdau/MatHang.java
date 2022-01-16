/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlikhoxangdau;

/**
 *
 * @author DELL
 */
public class MatHang implements Comparable<MatHang>{
    private String ma;
    private int sl;

    public MatHang() {
    }

    public MatHang(String ma, int sl) {
        this.ma = ma;
        this.sl = sl;
    }
    
    private String getLoai() {
        return ma.substring(0, 1);
    }
    
    private String getHangSX() {
        String s =  ma.substring(3);
        if(s.equalsIgnoreCase("BP")){
            return "British Petro";
        }else if(s.equalsIgnoreCase("ES")){
            return "Esso";
        }else if(s.equalsIgnoreCase("SH")){
            return "Shell";
        }else if(s.equalsIgnoreCase("CA")){
            return "Castrol";
        }else if(s.equalsIgnoreCase("MO")){
            return "Mobil";
        }else if(s.equalsIgnoreCase("TN")){
            return "Trong Nuoc";
        }
        return "";
    }
    
    private double thue() {
        String a = ma.charAt(0) + "";
        if(a.equalsIgnoreCase("X")) {
            return 3.0/100;
        }
        if(a.equalsIgnoreCase("D")) {
            return 3.5/100;
        }
        if(a.equalsIgnoreCase("N")) {
            return 2.0/100;
        }
        return 0;
    }
    
    private double getThue(){
        String a= ma.substring(3);
        if(!a.equalsIgnoreCase("TN")) {
            double b = (sl * thue() * getDonGia());
            return b;
        }
        return 0;
    }
    
    private long getDonGia(){
        String a=ma.charAt(0)+"";
        if(a.equals("X")) {
                return 128000;
            }
        if(a.equals("D")) {
                return 11200;
            }
        if(a.equals("N")) {
                return 9700;
        }return 0;
    }
    
    private double getThanhTien() {
        return (getDonGia() * sl + getThue());
    }
    
    public void show() {
        System.out.printf(ma + " " + getHangSX() + " %d %.0f %.0f\n", getDonGia(), getThue(), getThanhTien());
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.getThanhTien() > o.getThanhTien()) return -1;
        else if((this.getThanhTien() > o.getThanhTien())) return 1;
        else return 0;
    }
}
