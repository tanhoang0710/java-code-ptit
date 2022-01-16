/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenhatgianhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Nguoi implements Comparable<Nguoi>{
    private String ten;
    private Date ngaySinh;

    public Nguoi() {
    }

    public Nguoi(String ten, String ngaySinh) throws ParseException {
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }
    
    
    public void show() {
        System.out.println(ten);
    }

    @Override
    public int compareTo(Nguoi p){
        if(this.getNgaySinh().compareTo(p.getNgaySinh()) >0)  return -1;
        else if(this.getNgaySinh().compareTo(p.getNgaySinh()) <0) return 1;
        return 0;
    }
    
    
}
