/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class BangDiem implements Comparable<BangDiem>{
    private SinhVien sv = new SinhVien();
    private MonHoc mh =  new MonHoc();
    private double diem;

    public BangDiem() {
    }

    public BangDiem(String maSV, String maMH, double diem) {
        this.sv.setMa(maSV);
        this.mh.setMa(maMH);
        this.diem = diem;
    }

    public SinhVien getSv() {
        return sv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public double getDiem() {
        return diem;
    }
    
    

//    @Override
//    public int compareTo(BangDiem o) {
//        return Double.compare(o.getDiem(), this.getDiem());
//    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.getMh().getMa().compareToIgnoreCase(o.getMh().getMa()) > 0) return 1;
        else if(this.getMh().getMa().compareToIgnoreCase(o.getMh().getMa()) < 0) return -1;
        else return this.getSv().getMa().compareToIgnoreCase(o.getSv().getMa());
    }
    
    
    
}
