/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluong;

import java.util.*;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<NhanVien> list = new ArrayList<>();
    private List<PhongBan> pb = new ArrayList<>();

    public DanhSach() {
    }
    
    public void addNV(NhanVien x) {
        list.add(x);
    }
    
    public void addPB(PhongBan x){
        pb.add(x);
    }
    
    public void show(String ma){
        String ten = "";
        for (PhongBan pb : pb) {
            if(pb.getMa().equalsIgnoreCase(ma))
                ten = pb.getTen();
        }
        System.out.println("Bang luong phong " + ten + ":");
        for (NhanVien x : list) {
            if(x.getMaPhong().equalsIgnoreCase(ma)){
                for (PhongBan pb : pb) {
                    if(x.getMaPhong().equalsIgnoreCase(pb.getMa())){
                        x.show();
                    }
                }
            }
            
        }
    }
    
    public void show(){
        for (NhanVien x : list) {
            for (PhongBan pb : pb) {
                if(x.getMaPhong().equalsIgnoreCase(pb.getMa())){
                    x.show(pb.getTen());
                }
            }
        }
    }
}
