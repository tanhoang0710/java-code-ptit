/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlematrix;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Matrix {
    private long a[][] = new long[55][55];
    private long n, m;

    public Matrix() {
    }

    public Matrix(long n, long m) {
        this.n = n;
        this.m = m;
    }
    
    public void nextMatrix() {
        a = new long[(int)n][(int)m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = 0;
            }
        }
    }
    
    public void nextMatrix(Scanner sc) {
        a = new long[(int)n][(int)m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextLong();
            }
        }
    }
    
    public Matrix mul(Matrix x){
        Matrix res = new Matrix(n,x.m);
        res.nextMatrix();
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < x.m; j++) {
                for (int k = 0; k < m; k++) {
                    res.a[i][j] +=  this.a[i][k] * x.a[k][j];
                }
            }
        }
        return res;
    }
    
    public Matrix trans() {
        Matrix res = new Matrix(m,n);
        res.nextMatrix();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res.a[i][j] = this.a[j][i];
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s += a[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
