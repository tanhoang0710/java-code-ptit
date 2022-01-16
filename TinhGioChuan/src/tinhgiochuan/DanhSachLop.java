/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;
import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author DELL
 */
public class DanhSachLop {
    private List<Lop> list = new ArrayList<>();
    private List<GiangVien> listGV;
    private List<MonHoc> listMH;

    public DanhSachLop() {
    }

    public void addDSGV(List<GiangVien> l){
        listGV = l;
    }
    
    public void addDSMH(List<MonHoc> l){
        listMH = l;
    }
    
    public void addLop(Lop l){
        list.add(l);
    }
    // tinh gio chuan cho tung thanh vien
//    public void show(String maGV){
//        for (GiangVien x : listGV) {
//            if(x.getMa().equalsIgnoreCase(maGV)){
//                System.out.println("Giang vien:" + x.getTen());
//                break;
//            }
//        }
//        
//        for (Lop x : list) {
//            for (MonHoc y : listMH) {
//                if(x.getMaGV().equalsIgnoreCase(maGV) && x.getMaMH().equalsIgnoreCase(y.getMa()))
//                    System.out.println(y.getTen().trim() + " " + x.getSoGioChuan());
//            }
//        }
//        List<GiangVien> l1 = new ArrayList<>();
//        List<String> s = new ArrayList<>();
//        for (Lop x : list) {
//            if(!s.contains(x.getMaGV())){
//                s.add(x.getMaGV());
//            }
//        }
//        
//        for (String x : s) {
//            double sum = 0;
//            for (Lop lop : list) {
//                if(lop.getMaGV().equalsIgnoreCase(x)){
//                    sum += lop.getSoGioChuan();
//                }
//            }
//            l1.add(new GiangVien(x, sum));
//        }
//        
//        for (GiangVien x : l1) {
//            for (GiangVien y : listGV) {
//                if(x.getMa().equalsIgnoreCase(y.getMa()) && x.getMa().equalsIgnoreCase(maGV)){
//                    System.out.printf("Tong: %.2f\n", x.getTongGio());
//                    break;
//                }
//            }
//        }
//        
//    }
    // bang tinh gio chuan
    public void show(){
        List<GiangVien> l1 = new ArrayList<>();
        List<String> s = new ArrayList<>();
        for (Lop x : list) {
            if(!s.contains(x.getMaGV())){
                s.add(x.getMaGV());
            }
        }
        
        for (String x : s) {
            double sum = 0;
            for (Lop lop : list) {
                if(lop.getMaGV().equalsIgnoreCase(x)){
                    sum += lop.getSoGioChuan();
                }
            }
            l1.add(new GiangVien(x, sum));
        }
        
        for (GiangVien x : l1) {
            for (GiangVien y : listGV) {
                if(x.getMa().equalsIgnoreCase(y.getMa())){
                    System.out.printf("%s %.2f\n", y.getTen().trim(), x.getTongGio());
                }
            }
        }
    }
}
