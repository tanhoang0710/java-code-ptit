/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonbanquanao;

/**
 *
 * @author DELL
 */
public class HoaDon implements Comparable<HoaDon>{
    private String maHoaDon;
    private int sl;
    private static int index = 0;
    private double soTienPhaiTra;
    
    public HoaDon() {
    }

    public HoaDon(String maHoaDon, int sl) {
        this.maHoaDon = maHoaDon + String.format("-%03d", ++index);
        this.sl = sl;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public String getMaLoai(){
        Character c1 = maHoaDon.charAt(0);
        Character c2 = maHoaDon.charAt(1);
        return c1.toString() + c2.toString();
    }
    
    public int getLoai(){
        Character c = maHoaDon.charAt(2);
        return Integer.parseInt(c.toString());
    }
    
    public void show() {
        System.out.print(maHoaDon);
    }

    public void setSoTienPhaiTra(double soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public double getSoTienPhaiTra() {
        return soTienPhaiTra;
    }
    
    

    @Override
    public int compareTo(HoaDon o) {
        return Double.compare(o.getSoTienPhaiTra(), this.getSoTienPhaiTra());
    }
    
    
}
