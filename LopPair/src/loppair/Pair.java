/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loppair;

/**
 *
 * @author DELL
 */
public class Pair <T, S>{
    private int a, b;
    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
 
    private boolean isPrime(int x) {
        if(x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) return false;
        }
        return true;
    }
 
    public boolean isPrime() {
        return isPrime(a) && isPrime(b);
    }
 
    public String toString() {
        return a + " " + b;
    }
 
}
