/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemhocsinh;

/**
 *
 * @author DELL
 */
public class HocSinh implements Comparable<HocSinh>{
    private String ten, ma;
    private double toan, tv, nn, vl, hh, sh, su, dia, gdcd, cn;

    public HocSinh() {
    }

    public HocSinh(int index, String ten, double toan, double tv, double nn, double vl, double hh, double sh, double su, double dia, double gdcd, double cn) {
        this.ma = "HS" + String.format("%02d", index);
        this.ten = ten;
        this.toan = toan;
        this.tv = tv;
        this.nn = nn;
        this.vl = vl;
        this.hh = hh;
        this.sh = sh;
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
        this.cn = cn;
    }
    
    public double diemTB() {
        double dtb = 0;
        dtb = ((toan + tv) * 2 + nn + vl + hh + sh + su + dia + gdcd + cn) / 12;
        return dtb;
    }
    
    public double getDiemTB() {
        return diemTB();
    }
    
    public int getMa() {
        return Integer.valueOf(ma.substring(ma.length() - 2));
    }
    
    public String xepLoai() {
        if(diemTB() >= 9){
            return "XUAT XAC";
        }else if(diemTB() >= 8){
            return "GIOI";
        }else if(diemTB() >= 7){
            return "KHA";
        }else if(diemTB() >= 5){
            return "TB";
        }else {
            return "YEU";
        }
    }
    
    public void ketQua() {
        
        System.out.printf(ma + " " + ten + " %.1f %s\n", Math.round(diemTB() * 10)/10.0, xepLoai());
    }

    @Override
    public int compareTo(HocSinh o) {
        if (this.diemTB() == o.diemTB())
            return this.ma.compareTo(o.ma);
        return o.diemTB() > this.diemTB() ? 1 : -1;
    }
}
