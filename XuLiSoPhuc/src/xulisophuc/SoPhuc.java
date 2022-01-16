/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulisophuc;

/**
 *
 * @author DELL
 */
public class SoPhuc {
    private int phanThuc, phanAo;

    public SoPhuc() {
    }

    public SoPhuc(int phanThuc, int phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    
    public SoPhuc cong(SoPhuc x){
        int pt = this.phanThuc + x.phanThuc;
        int pa = this.phanAo + x.phanAo;
        return new SoPhuc(pt, pa);
    }
    
    public SoPhuc nhan(SoPhuc x){
        //( a + b i ) ( c + d i ) = ( a c − b d ) + ( a d + b c ) i
        int pt = this.phanThuc * x.phanThuc - this.phanAo * x.phanAo;
        int pa = this.phanThuc * x.phanAo + this.phanAo * x.phanThuc;
        return new SoPhuc(pt, pa);
    }
    
    public void show(){
        if(phanAo < 0) {
            phanAo = - phanAo;
            System.out.print(phanThuc + " - " + phanAo + "i");
        }else {
            System.out.print(phanThuc + " + " + phanAo + "i");
        }
    }
}
