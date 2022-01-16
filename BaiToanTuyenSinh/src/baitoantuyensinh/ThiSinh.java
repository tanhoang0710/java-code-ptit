/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoantuyensinh;


/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maTS, ten;
    private double diemToan, diemLy, diemHoa;
    private String khuVuc;
    private double diemUuTien;

    public ThiSinh() {
    }

    public ThiSinh(String maTS, String ten, double diemToan, double diemLy, double diemHoa) {
        this.maTS = maTS;
        this.ten = chuanHoaTen(ten);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    public String chuanHoaTen(String hoTen) {
        String tmp[] = hoTen.trim().split("\\s+");
        String res = "";
        for (String x : tmp) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return (res.trim());
    }
    
    private String format(double x) {
        if (x == (int)x) return String.format("%.0f",x);
        else return String.format("%.1f",x);
    }
    
    public void showResult(double diemChuan) {
        khuVuc = maTS.substring(0, 3);
        String status;
        double tongDiem;
        if(khuVuc.equalsIgnoreCase("KV1"))
            diemUuTien = 0.5;
        else if(khuVuc.equalsIgnoreCase("KV2"))
            diemUuTien = 1;
        else if(khuVuc.equalsIgnoreCase("KV3"))
            diemUuTien = 2.5;
        tongDiem = diemHoa + diemLy + diemToan * 2 + diemUuTien;
        if(tongDiem >= diemChuan)
            status = "TRUNG TUYEN";
        else 
            status = "TRUOT";
        System.out.println(maTS + " " + ten + " " + format(diemUuTien) + " " + format(tongDiem) + " " + status);
    }
    
    public double getTongDiem() {
        khuVuc = maTS.substring(0, 3);
        String status;
        double tongDiem;
        if(khuVuc.equalsIgnoreCase("KV1"))
            diemUuTien = 0.5;
        else if(khuVuc.equalsIgnoreCase("KV2"))
            diemUuTien = 1;
        else if(khuVuc.equalsIgnoreCase("KV3"))
            diemUuTien = 2.5;
        tongDiem = diemHoa + diemLy + diemToan * 2 + diemUuTien;
        return tongDiem;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getTongDiem() > o.getTongDiem()) return -1;
        else if(this.getTongDiem() < o.getTongDiem()) return 1;
        else return 0;
    }
}
