/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlibanhang;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSachHoaDon {
    private List<HoaDon> list = new ArrayList<>();
    private DanhSachKhachHang dskh;
    private DanhSachMatHang dsmh;

    public DanhSachHoaDon() {
    }
    
    public void add(HoaDon x){
        list.add(x);
    }
    
    public void addDSKH(DanhSachKhachHang ds){
        dskh = ds;
    }
    
    public void addDSMH(DanhSachMatHang ds){
        dsmh = ds;
    }
    
    private void TTKH(String s) {
        for (int i = 0; i < dskh.getList().size(); i++) {
            KhachHang kh = dskh.getList().get(i);
            if(kh.getMa().equalsIgnoreCase(s)){
                System.out.print(kh.getTen() + " " + kh.getDiaChi() + " ");
                break;
            }
        }
    }
    
    private void TTMH(String s, int sl){
        // Quan li ban hang 2
//        for (int i = 0; i < dsmh.getList().size(); i++) {
//            MatHang mh = dsmh.getList().get(i);
//            if(mh.getMa().equalsIgnoreCase(s)) {
//                System.out.print(mh.getTen() + " " + sl + " " + (Integer.parseInt(mh.getGiaBan()) * sl) + " " + (Integer.parseInt(mh.getGiaBan()) * sl - Integer.parseInt(mh.getGiaMua()) * sl));
//                break;
//            }
//        }
        for (int i = 0; i < dsmh.getList().size(); i++) {
            MatHang mh = dsmh.getList().get(i);
            if(mh.getMa().equalsIgnoreCase(s)) {
                System.out.print(mh.getTen() + " " + mh.getDonViTinh() + " " + mh.getGiaMua()+ " " + mh.getGiaBan() + " " + sl + " " + (Integer.parseInt(mh.getGiaBan()) * sl));
                break;
            }
        }
    } 
    
    private int getLoiNhuan(String s, int sl) {
        for (int i = 0; i < dsmh.getList().size(); i++) {
            MatHang mh = dsmh.getList().get(i);
            if(mh.getMa().equalsIgnoreCase(s)) {
                return Integer.parseInt(mh.getGiaBan()) * sl - Integer.parseInt(mh.getGiaMua()) * sl;
            }
        }
        return 0;
    }
    
    public void show() {
        // Quan li ban hang - 2
//        for (HoaDon x : list) {
//            x.setLoiNhuan(getLoiNhuan(x.getMaMH(), x.getSoLuong()));
//        }
//        
//        Collections.sort(list);
//        for (HoaDon x : list) {
//            x.show();
//            TTKH(x.getMaKH());
//            TTMH(x.getMaMH(), x.getSoLuong());
//            System.out.println();
//        }
           // Quan li ban hang - 1
        for (HoaDon x : list) {
            x.show();
            TTKH(x.getMaKH());
            TTMH(x.getMaMH(), x.getSoLuong());
            System.out.println();
        }
//        for (int i = 0; i < dskh.getList().size(); i++) {
//            dskh.getList().get(i).show();
//        }
    }
}
