/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuligiangvien;

/**
 *
 * @author DELL
 */
public class GiangVien implements Comparable<GiangVien>{
    private String ma, hoTen, boMon, ten;

    public GiangVien() {
    }

    public GiangVien(int index, String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", index);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }
    
    private String getTen() {
        String[] tmp = hoTen.split(" ");
        return tmp[tmp.length - 1];
    }

    public String getMa() {
        return ma;
    }

    public String getBoMon() {
        return boMon;
    }

    public String getHoTen() {
        return hoTen.toLowerCase();
    }
    
    public String chuanHoaBoMon() {
        String[] tmp = boMon.split(" ");
        String res = "";
        for (String x : tmp) {
            Character c = x.charAt(0);
            res += c.toString().toUpperCase();
        }
        return res;
    }
    
    public void show() {
        System.out.println(ma + " " + hoTen + " " + chuanHoaBoMon());
    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.getTen().compareToIgnoreCase(o.getTen()) > 0) return 1;
        else if(this.getTen().compareToIgnoreCase(o.getTen()) < 0) return -1;
        else return this.getMa().compareToIgnoreCase(o.getMa());
    }
}
