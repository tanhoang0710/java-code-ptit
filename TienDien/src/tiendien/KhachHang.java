/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, loaiKH;
    private int csc, csm;

    public KhachHang() {
    }

    public KhachHang(int index, String loaiKH, int csc, int csm) {
        this.ma = "KH" + String.format("%02d", index);
        this.loaiKH = loaiKH;
        this.csc = csc;
        this.csm = csm;
    }
    
    public int getHeSo() {
        if(loaiKH.equalsIgnoreCase("KD")){
            return 3;
        }else if(loaiKH.equalsIgnoreCase("NN")){
            return 5;
        }else if(loaiKH.equalsIgnoreCase("TT")){
            return 4;
        }else if(loaiKH.equalsIgnoreCase("CN")){
            return 2;
        }
        return 0;
    }
    
    public int getThanhTien() {
        int tien = (csm - csc) * getHeSo() * 550;
        return tien;
    }
    
    public int getPhuTroi() {
        int hieu = csm - csc;
        int tien = getThanhTien();
        if(hieu < 50)
            return 0;
        else if(hieu >= 50 && hieu <= 100)
            return (int)Math.round(tien * 35 / 100.0);
        else return tien;
    }
    
    public int getTong() {
        return getThanhTien() + getPhuTroi();
    }
    
    public void show() {
        System.out.println(ma + " " + getHeSo() + " " + getThanhTien() + " " + getPhuTroi() + " " + (getThanhTien() + getPhuTroi()));
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.getTong() > o.getTong()) return -1;
        else if(this.getTong() < o.getTong()) return 1;
        else return 0;
    }
}
