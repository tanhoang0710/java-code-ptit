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
public class MuaHang {
    private List<SanPham> l1 = new ArrayList<>();
    private List<KhachHang> l2 = new ArrayList<>();

    public MuaHang() {
    }
    
    public void addSP(SanPham x) {
        l1.add(x);
    }
    
    public void addKH(KhachHang x) {
        l2.add(x);
    }
    
    public void show() {
        
        for (KhachHang x : l2) {
            for (SanPham y : l1) {
                if(x.getMaSP().equalsIgnoreCase(y.getMa())){
                    x.tinhNgayHetHan(y.getTgbh());
                }
            }
        }
        Collections.sort(l2);
        for (KhachHang x : l2) {
            for (SanPham y : l1) {
                if(x.getMaSP().equalsIgnoreCase(y.getMa())){
                    x.tinhNgayHetHan(y.getTgbh());
                    System.out.println(x.getMa() + " " + x.getHoTen() + " " + x.getDiaChi() + " " + x.getMaSP() + " " + x.getSl() * y.getGiaBan() + " " + x.getNgayHetHan());
                }
            }
        }
    }
}
