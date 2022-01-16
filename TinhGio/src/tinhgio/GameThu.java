/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgio;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class GameThu implements Comparable<GameThu>{
    private String ma, ten;
    private Long gioVao, gioRa;

    public GameThu() {
    }

    public GameThu(String ma, String ten, String gioVao, String gioRa) {
        this.ma = ma;
        this.ten = ten;
        String[] a = gioVao.split(":");
        String[] b = gioRa.split(":");
        this.gioVao = Long.valueOf(a[0]) * 60 + Long.valueOf(a[1]);;
        this.gioRa = Long.valueOf(b[0]) * 60 + Long.valueOf(b[1]);
    }
    
    public String getTime() {
        long tmp1 = (this.gioRa-gioVao) / 60;
        long tmp2 = (this.gioRa-gioVao) % 60;
        return tmp1 + " gio " + tmp2 + " phut";
    }
    
    public void show(){
        System.out.println(ma + " " + ten + " " + getTime());
    }

    @Override
    public int compareTo(GameThu o) {
        Long x = this.gioRa - this.gioVao;
        return x.compareTo(o.gioRa - o.gioVao);
    }
}
