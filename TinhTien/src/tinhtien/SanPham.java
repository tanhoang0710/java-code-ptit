/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtien;

/**
 *
 * @author DELL
 */
public class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private long sl, donGia, chietKhau;

    public SanPham() {
    }

    public SanPham(String ma, String ten, long sl, long donGia, long chietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    
    
    public long tongTien(){
        return sl * donGia - chietKhau;
    }
    
    public void show(){
        System.out.println(ma + " " + ten + " " + sl + " " + donGia + " " + chietKhau + " " + tongTien());
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.tongTien() > o.tongTien()) return -1;
        else if(this.tongTien() < o.tongTien()) return 1;
        else return 0;
    }
}
