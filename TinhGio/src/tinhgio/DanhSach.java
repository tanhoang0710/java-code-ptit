/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgio;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DanhSach {
    List<GameThu> list = new ArrayList<>();

    public DanhSach() {
    }
    
    public void add(GameThu x) {
        list.add(x);
    }
    
    public void sapXep() throws ParseException{
        list.sort(Collections.reverseOrder());
    }
    
    public void show() throws ParseException {
        for (GameThu x : list) {
            x.show();
        }
    }
}
