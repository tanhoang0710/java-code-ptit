/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DanhSach {
    private List<SinhVien> list = new ArrayList<>();
    private List<ThongTinDiemDanh> tt = new ArrayList<>();

    public DanhSach() {
    }
    
    public void addSV(SinhVien x){
        list.add(x);
    }
    
    public void addTT(ThongTinDiemDanh x) {
        tt.add(x);
    }
    
    public void show(String lop) {
        for (SinhVien sv : list) {
            if(sv.getLop().equalsIgnoreCase(lop)){
                for (ThongTinDiemDanh x : tt) {
                    if(x.getMa().equalsIgnoreCase(sv.getMa())){
                        sv.show(x.getLichSu());
                    }
                }
            }
        }
    }
}
