/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapkho;

/**
 *
 * @author DELL
 */
public class MatHang {
    private String ma, ten;
    private int sl, donGia;

    public MatHang() {
    }

    public MatHang(int index, String ten, int sl, int donGia) {
        this.ma = chuanHoa(ten) + String.format("%02d", index);
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }
    
    private String chuanHoa(String ten) {
        String[] t = ten.split(" ");
        String res = "";
        for (int i = 0; i < t.length - 1; i++) {
            res += ((Character)(t[i].charAt(0))).toString().toUpperCase();
        }
        return res;
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + sl + " "+ donGia);
    }
}
