/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangxephang;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int baiLamDung, submit;

    public SinhVien() {
    }

    public SinhVien(String name, int baiLamDung, int submit) {
        this.name = name;
        this.baiLamDung = baiLamDung;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getBaiLamDung() {
        return baiLamDung;
    }

    public int getSubmit() {
        return submit;
    }
    
    public void show() {
        System.out.println(name + " " + baiLamDung + " " + submit);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.getBaiLamDung() > o.getBaiLamDung()) return -1;
        else if(this.getBaiLamDung() < o.getBaiLamDung()) return 1;
        else {
            if(this.getSubmit() > o.getSubmit()) return 1;
            else if(this.getSubmit() < o.getSubmit()) return -1;
            else return this.getName().compareToIgnoreCase(o.getName());
        }
    }
}
