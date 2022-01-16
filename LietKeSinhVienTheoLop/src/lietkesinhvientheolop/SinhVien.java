/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietkesinhvientheolop;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getKhoa() {
        return lop.substring(1, 3);
    }
    
    public String getNganh() {
        String tmp =  ma.substring(3, 7);
        if(tmp.equalsIgnoreCase("DCKT")) {
            return "ke toan";
        }else if(tmp.equalsIgnoreCase("DCCN") && !getHe().equalsIgnoreCase("E")) {
            return "cong nghe thong tin";
        }else if(tmp.equalsIgnoreCase("DCAT") && !getHe().equalsIgnoreCase("E")) {
            return "an toan thong tin";
        }else if(tmp.equalsIgnoreCase("DCVT")) {
            return "vien thong";
        }
        else if(tmp.equalsIgnoreCase("DCDT")){
            return "dien tu";
        }
        return "0";
    }
    
    public String getHe() {
        return lop.substring(0, 1);
    }
    
    public void showProfile() {
        System.out.println(ma + " " + ten + " " + lop + " " + email);
    }
    
    
}
