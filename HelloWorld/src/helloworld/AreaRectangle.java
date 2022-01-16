/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AreaRectangle {
    public static void main(String[] args) {
        int width;
        int length;
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        length = sc.nextInt();
        if(width <= 0 || length <= 0){
            System.out.println(0);
        }else {
            int chuvi = (width + length) * 2;
            int dientich = width * length;
            System.out.println(chuvi + " " + dientich);
        }
    }
}
