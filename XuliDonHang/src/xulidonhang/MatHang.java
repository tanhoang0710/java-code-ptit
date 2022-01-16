/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulidonhang;

/**
 *
 * @author DELL
 */
public class MatHang implements Comparable<MatHang>{
    private String ten, ma;
    private int donGia, sl;

    public MatHang() {
    }

    public MatHang(String ten, String ma, int donGia, int sl) {
        this.ten = ten;
        this.ma = ma;
        this.donGia = donGia;
        this.sl = sl;
    }
    
    public String getStt() {
        return ma.substring(1, 4);
    }
    
    public String getMaLoai() {
        Character c = ma.charAt(ma.length() - 1);
        return c.toString();
    }
    
    public int getGiamGia() {
        if(getMaLoai().equals("2"))
            return (int)(0.3 * donGia * sl);
        else return (int)(0.5 * donGia * sl);
    }
    
    public int getThanhTien() {
        int tien = donGia * sl;
        return tien - getGiamGia();
    }
    
    public void show() {
        System.out.println(ten + " " + ma + " " + getStt() + " " + getGiamGia() + " " + getThanhTien());
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.getStt().compareTo(o.getStt()) > 0) return 1;
        else if(this.getStt().compareTo(o.getStt()) < 0) return -1;
        else return 0;
    }
}
