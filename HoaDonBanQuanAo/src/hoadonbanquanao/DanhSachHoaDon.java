/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonbanquanao;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSachHoaDon {
    private List<HoaDon> list1 = new ArrayList<>();
    private List<LoaiSanPham> list2= new ArrayList<>();
    
    public DanhSachHoaDon() {
    }
    
    public void addHoaDon(HoaDon x){
        list1.add(x);
    }
    
    public void addDSSP(List<LoaiSanPham> l) {
        list2 = l;
    }
    
    public void show() {
        
        for (HoaDon x : list1) {
            x.show();
            double thanhTien = 0;
            double tienGiam = 0;
            double tienPhaiTra = 0;
            String ten = "";
            for (LoaiSanPham y : list2) {
                if(x.getMaLoai().equalsIgnoreCase(y.getMaLoai())){
                    if(x.getLoai() == 1){
                        thanhTien = x.getSl() * y.getDonGia1();
                    }else if(x.getLoai() == 2){
                        thanhTien = x.getSl() * y.getDonGia2();
                    }
                    
                    if(x.getSl() >= 150){
                        tienGiam = thanhTien * 0.5;
                    }else if(x.getSl() >= 100){
                        tienGiam = thanhTien * 0.3;
                    }else if(x.getSl() >= 50) {
                        tienGiam = thanhTien * 0.15;
                    }else tienGiam = 0;
                    
                    tienPhaiTra = thanhTien - tienGiam;
                    ten = y.getTen();
                    break;
                }
            }
            // x.setSoTienPhaiTra(tienPhaiTra);
            System.out.printf(" %s %.0f %.0f\n", ten, tienGiam, tienPhaiTra);
        }
    }
    
    public void sapXep() {
        show();
        Collections.sort(list1);
        for (HoaDon x : list1) {
            x.show();
            double thanhTien = 0;
            double tienGiam = 0;
            double tienPhaiTra = 0;
            String ten = "";
            for (LoaiSanPham y : list2) {
                if(x.getMaLoai().equalsIgnoreCase(y.getMaLoai())){
                    if(x.getLoai() == 1){
                        thanhTien = x.getSl() * y.getDonGia1();
                    }else if(x.getLoai() == 2){
                        thanhTien = x.getSl() * y.getDonGia2();
                    }
                    
                    if(x.getSl() >= 150){
                        tienGiam = thanhTien * 0.5;
                    }else if(x.getSl() >= 100){
                        tienGiam = thanhTien * 0.3;
                    }else if(x.getSl() >= 50) {
                        tienGiam = thanhTien * 0.15;
                    }else tienGiam = 0;
                    
                    tienPhaiTra = thanhTien - tienGiam;
                    ten = y.getTen();
                    break;
                }
            }
            System.out.printf(" %s %.0f %.0f\n", ten, tienGiam, tienPhaiTra);
        }
    }
}
