/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuyengiaovien;

/**
 *
 * @author DELL
 */
public class GiaoVien implements Comparable<GiaoVien>{
    private String ma, ten, maXetTuyen;
    private double diem1, diem2;

    public GiaoVien() {
    }

    public GiaoVien(int index, String ten, String maXetTuyen, double diem1, double diem2) {
        this.ma = "GV" + String.format("%02d", index);
        this.ten = ten;
        this.maXetTuyen = maXetTuyen;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    
    public String getMonHoc(){
        if(maXetTuyen.substring(0, 1).equalsIgnoreCase("A")){
            return "TOAN";
        }else if(maXetTuyen.substring(0, 1).equalsIgnoreCase("B")){
            return "LY";
        }else if(maXetTuyen.substring(0, 1).equalsIgnoreCase("C")){
            return "HOA";
        }
        return "";
    }
    
    public double getUuTien() {
        if(maXetTuyen.substring(1).equals("1")){
            return 2.0;
        }else if(maXetTuyen.substring(1).equals("2")){
            return 1.5;
        }else if(maXetTuyen.substring(1).equals("3")){
            return 1.0;
        }else if(maXetTuyen.substring(1).equals("4")){
            return 0.0;
        }
        return -1;
    }
    
    public double getTongDiem(){
        double tong = 0;
        tong = diem1 * 2 + diem2 + getUuTien();
        return tong;
    }
    
    public String getKetQua() {
        if(getTongDiem() >= 18) {
            return "TRUNG TUYEN";
        }else return "LOAI";
    }
    
    public void show() {
        System.out.printf(ma + " " + ten + " " + getMonHoc() + " %.1f %s\n", getTongDiem(), getKetQua());
    }

    @Override
    public int compareTo(GiaoVien o) {
        if(this.getTongDiem() > o.getTongDiem()) return -1;
        else if(this.getTongDiem() < o.getTongDiem()) return 1;
        else return 0;
    }
}
