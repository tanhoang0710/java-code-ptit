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
public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten;
    private double diem;
    private String danToc;
    private int khuVuc;

    public ThiSinh() {
    }

    public ThiSinh(int index, String ten, double diem, String danToc, int khuVuc) {
        this.ma = "TS" + String.format("%02d", index);
        this.ten = chuanHoaTen(ten);
        this.diem = diem;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
    }
    
    public String chuanHoaTen(String hoTen) {
        String tmp[] = hoTen.trim().split("\\s+");
        String res = "";
        for (String x : tmp) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return (res.trim());
    }

    public String getDanToc() {
        return danToc;
    }

    public int getKhuVuc() {
        return khuVuc;
    }
    
    public double getDiemUuTien() {
        double diem = 0;
        if(this.getDanToc().equalsIgnoreCase("Kinh")) diem += 0;
            if(!this.getDanToc().equalsIgnoreCase("Kinh")) diem += 1.5;
        if(this.getKhuVuc() == 1) diem += 1.5;
        if(this.getKhuVuc() == 2) diem += 1;
        if(this.getKhuVuc() == 3) diem += 0;
        return diem;
    }

    public double getDiem() {
        return diem;
    }
    
    public double getTongDiem() {
        return this.getDiem() + this.getDiemUuTien();
    }
    
    public String getTrangThai() {
        if(this.getTongDiem() >= 20.5) return "Do";
        return "Truot";
    }
    
    public void show() {
        System.out.printf(ma + " " + ten + " %.1f %s\n", getTongDiem(), getTrangThai());
    }

    public String getMa() {
        return ma;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getTongDiem() > o.getTongDiem()) return -1;
        else if(this.getTongDiem() < o.getTongDiem()) return 1;
        else return this.getMa().compareToIgnoreCase(o.getMa());
    }
}
