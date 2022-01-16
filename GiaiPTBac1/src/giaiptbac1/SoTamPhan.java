/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiptbac1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String n = sc.nextLine();
            boolean check = true;
            for(int i = 0; i < n.length(); i++){
                Character c = n.charAt(i);
                if(!c.toString().equals("0") && !c.toString().equals("1") && !c.toString().equals("2")){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
