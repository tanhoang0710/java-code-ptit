/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepsinhvientheolop;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop,email;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
    public void showProfile() {
        System.out.println(ma + " " + ten + " " + lop + " " + email);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.ma.compareTo(o.ma) > 0) return 1;
        else if(this.ma.compareTo(o.ma) < 0) return -1;
        else return 0;
    }
}
