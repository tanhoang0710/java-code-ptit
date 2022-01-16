/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timthukhoa;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, ngaySinh;
    private double diem1, diem2, diem3;

    public ThiSinh() {
    }

    public ThiSinh(int index, String ten, String ngaySinh, double diem1, double diem2, double diem3) {
        this.ma = String.format("%01d", index);
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    public double getTongDiem() {
        return diem1 + diem2 + diem3;
    }

    public String getMa() {
        return ma;
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + ngaySinh + " " + getTongDiem());
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getTongDiem() > o.getTongDiem()) return -1;
        else if(this.getTongDiem() < o.getTongDiem()) return 1;
        else return this.getMa().compareTo(o.getMa());
    }
}
