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
public class QLBTN {
    List<SinhVien> dssv = new ArrayList<>();
    List<BaiTap> dsbt = new ArrayList<>();
    List<Nhom> dsn = new ArrayList<>();

    public QLBTN() {
    }
    
    public void addSV(SinhVien x){
        dssv.add(x);
    }
    
    public void addBT(BaiTap x){
        dsbt.add(x);
    }
    
    public void addN(Nhom x){
        dsn.add(x);
    }
    
    public void show() {
        Collections.sort(dssv);
        for (SinhVien y : dssv) {
            for (Nhom x : dsn) {
                for (BaiTap z : dsbt) {
                    if(x.getSv().getMa().equalsIgnoreCase(y.getMa()) && x.getBt().getMa().equals(z.getMa())){
                        System.out.println(y.getMa() + " " + y.getHoten() + " " + y.getSdt() + " " + z.getMa() + " " + z.getTen());
                        
                    }
                }
            }
        }
    }
}
