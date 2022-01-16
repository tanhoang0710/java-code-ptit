/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author DELL
 */
public class QuanLiDiem {
    private List<SinhVien> dssv = new ArrayList<>();
    private List<MonHoc> dsmh = new ArrayList<>();
    private List<BangDiem> dsd = new ArrayList<>();

    public QuanLiDiem() {
    }
    
    public void addsv(SinhVien x){
        dssv.add(x);
    }
    
    public void addmh(MonHoc x){
        dsmh.add(x);
    }
    
    public void adddiem(BangDiem x){
        dsd.add(x);
    }
    
    private String diem(double d) {
        String ans="";
        if(d == (int)d) {
            ans+=String.valueOf((int)d);
        }else {
            ans+=String.valueOf(d);
        }
        return ans;
    }
    
//    public void inBangDiemTheoMon(String maMH){
//        Collections.sort(dsd);
//        String tenMH = "";
//        for (MonHoc x : dsmh) {
//            if(x.getMa().equalsIgnoreCase(maMH)){
//                tenMH += x.getTen();
//                break;
//            }
//        }
//        System.out.println("BANG DIEM MON " + tenMH + ":");
//        for (BangDiem x : dsd) {
//            if(x.getMh().getMa().equals(maMH)){
//                for (SinhVien y : dssv) {
//                    if(x.getSv().getMa().equalsIgnoreCase(y.getMa())){
//                        System.out.println(y.getMa() + " " + y.getHoTen() + " " + y.getLop() + " " + diem(x.getDiem()));
//                    }
//                }
//            }
//        }
//    }
    
    
    public String getTenMonHoc(String maMH) {
        for (MonHoc x : dsmh) {
            if(x.getMa().equalsIgnoreCase(maMH)){
                return x.getTen();
            }
        }
        return "";
    }
    
    public void inBangDiemTheoLop(String maLop) {
        Collections.sort(dsd);
        System.out.println("BANG DIEM lop " + maLop + ":");
        for (BangDiem x : dsd) {
            for (SinhVien y : dssv) {
                if(x.getSv().getMa().equalsIgnoreCase(y.getMa()) && y.getLop().equalsIgnoreCase(maLop)){
                    System.out.println(y.getMa() + " " + y.getHoTen() + " " + x.getMh().getMa() + " " + getTenMonHoc(x.getMh().getMa()) + " " + diem(x.getDiem()));
                }
            }
        }
    }
}
