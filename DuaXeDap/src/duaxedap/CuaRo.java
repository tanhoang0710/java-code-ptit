/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duaxedap;

/**
 *
 * @author DELL
 */
public class CuaRo implements Comparable<CuaRo>{
    private static String gioBatDau = "6:00";
    private static int quangDuong = 120;
    private String hoTen, donVi;
    private String gioKetThuc;

    public CuaRo() {
    }

    public CuaRo(String hoTen, String donVi, String gioKetThuc) {
        this.hoTen = hoTen;
        this.donVi = donVi;
        this.gioKetThuc = gioKetThuc;
    }

    public String getGioKetThuc() {
        return gioKetThuc;
    }
    
    public int getVanToc() {
        String t1[] = gioKetThuc.split(":");
        String t2[] = gioBatDau.split(":");
        int h = Integer.valueOf(t1[0]) - Integer.valueOf(t2[0]);
        double m = (Integer.valueOf(t1[1]) - Integer.valueOf(t2[1])) / 60.0;
//        int time = h * 60 + m;
//        double timeHours = time / 60;
//        double timeMinute = time % 60;
        String s = h + m + "";
        double t = Double.parseDouble(s);
        int v = (int)(Math.round(quangDuong / t));
        return v;
    }
    
    private String getRutGon(String x){
        String[] t1 = x.split(" ");
        String s = "";
        for (String str : t1) {
            Character c = str.charAt(0);
            s += c.toString().toUpperCase();
        }
        return s;
    }
    
    public String getMa(){
        String s1 = getRutGon(hoTen);
        String s2 = getRutGon(donVi);
        return s2 + s1;
    }
    
    public void show() {
        System.out.println(getMa() + " " + hoTen + " " + donVi + " " + getVanToc() + " Km/h");
    }
    // SORT THEO GIO KET THUC, KO SORT THEO VAN TOC
    @Override
    public int compareTo(CuaRo o) {
        if(this.getGioKetThuc().compareTo(o.getGioKetThuc()) > 0) return 1;
        else return -1;
    }
}
