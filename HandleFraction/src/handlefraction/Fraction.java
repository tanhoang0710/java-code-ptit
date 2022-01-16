/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlefraction;

public class Fraction {
    private long tuSo;
    private long mauSo;
    
    public Fraction(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }


    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
    private long gcd(long a, long b){
        long tmp1 = Math.abs(a), tmp2 = Math.abs(b);
        while(tmp2 > 0) {
            long tmp = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = tmp;
        }
        return tmp1;
    }
    
    public void rutGon() {
        long x = gcd(tuSo, mauSo);
        tuSo /= x;
        mauSo /= x;
        if(tuSo < 0 && mauSo < 0){
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }
    
    public Fraction tinhTong(Fraction x){
        long ms = this.mauSo * x.mauSo;
        long ts = this.tuSo * x.mauSo + this.mauSo * x.tuSo;
        Fraction res = new Fraction(ts, ms);
        res.rutGon();
        return res;
    }
    
    public static Fraction nhan(Fraction x, Fraction y) {
        long ts = x.tuSo * y.tuSo;
        long ms = x.mauSo * y.mauSo;
        Fraction res = new Fraction(ts, ms);
        res.rutGon();
        return res;
    }
    
    public static Fraction nhan(Fraction x, Fraction y, Fraction z) {
        long ts = x.tuSo * y.tuSo * z.tuSo;
        long ms = x.mauSo * y.mauSo * z.mauSo;
        Fraction res = new Fraction(ts, ms);
        res.rutGon();
        return res;
    }
    
    public void viet() {
        System.out.println(tuSo + "/" + mauSo);
    }
}
