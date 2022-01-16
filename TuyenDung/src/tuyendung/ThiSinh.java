/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuyendung;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, diem1, diem2;

    public ThiSinh() {
    }

    public ThiSinh(int index, String ten, String diem1, String diem2) {
        this.ma = "TS" + String.format("%02d", index);
        this.ten = ten;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public double getDiem(String diem) {
        double diemMon = 0;
        if(Double.parseDouble(diem) > 10){
            String tmp = diem.substring(0, 1) + "." + diem.substring(1);
            diemMon = Double.parseDouble(tmp);
        }else {
            diemMon = Double.parseDouble(diem);
        }
        return diemMon;
    }
    
    public double getDiemTB() {
        double diemTB = (getDiem(diem1) + getDiem(diem2)) / 2;
        return diemTB;
    }
    
    private String getLoai() {
        if(getDiemTB() > 9.5){
            return "XUAT SAC";
        }else if(getDiemTB() >= 8){
            return "DAT";
        }else if(getDiemTB() > 5){
            return "CAN NHAC";
        }else return "TRUOT";
    }
    
    public void show(){
        System.out.printf(ma + " " + ten + " %.2f %s\n", getDiemTB(), getLoai());
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getDiemTB() > o.getDiemTB()) return -1;
        else if(this.getDiemTB() < o.getDiemTB()) return 1;
        else return 0;
    }
    
    
}
