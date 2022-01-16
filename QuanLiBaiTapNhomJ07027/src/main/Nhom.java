/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class Nhom {
    private SinhVien sv = new SinhVien();
    private BaiTap bt =  new BaiTap();

    public Nhom() {
    }
    
    public Nhom(String s, String n){
        this.sv.setMa(s);
        this.bt.setMa(n);
    }

    public SinhVien getSv() {
        return sv;
    }

    public BaiTap getBt() {
        return bt;
    }
    
    public void show() {
        System.out.println(sv.getMa());
        System.out.println(bt.getMa());
    }
}
