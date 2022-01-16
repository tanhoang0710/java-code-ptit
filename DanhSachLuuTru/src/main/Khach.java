/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Khach implements Comparable<Khach>{
    private String ma, ten, maPhong, ngayDen, ngayDi;

    public Khach() {
    }

    public Khach(int index, String ten, String maPhong, String ngayDen, String ngayDi) {
        this.ma = "KH" + String.format("%02d", index);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }
    
    public long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public void show() throws ParseException {
        Date d1 = getNgayDen();
        Date d2 = getNgayDi();
        System.out.println(ma + " " + ten + " " + maPhong + " " + getDifferenceDays(d1, d2));
    }

    public Date getNgayDen() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(ngayDen);
    }

    public Date getNgayDi() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(ngayDi);
    }

    @Override
    public int compareTo(Khach o) {
        try {
            return Long.compare(o.getDifferenceDays(o.getNgayDen(), o.getNgayDi()), this.getDifferenceDays(this.getNgayDen(), this.getNgayDi()));
        } catch (ParseException e) {
            System.out.println(e);
        }
        return 0;
    }
}
