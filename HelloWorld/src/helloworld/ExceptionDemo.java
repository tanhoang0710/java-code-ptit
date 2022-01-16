/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class ExceptionDemo {
    public static void main(String[] args) {
//        int a, b;
//        a = 10;
//        b = 2;
//        // neu co loi thi bo qua phan o try
//        // va thuc hien o catch
//        // neu ko loi thi thuc hien o try
//        try {
//            int c = a / b;
//            System.out.println(b);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        System.out.println("Van de 1");
//        System.out.println("Van de 2");
//        System.out.println("Van de 3");

        // unchecked exception
        String so = "123";
//        int n = Integer.parseInt(so);

        
        // Checked exception
        String sd = "12/04/2021";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
//        try{
//            Date date = f.parse(sd);
//            System.out.println(date);
//        }catch(ParseException e) {
//            System.out.println(e);
//        }
        
        

        // 1 try co the co nhieu catch, tai 1 thoi diem chi chay 1 catch
        try {
            int n = Integer.parseInt(so);
            System.out.println(n);
            Date date = f.parse(sd);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("luon luon thuc hien du sai o catch nao hoac ko sai o catch nao");
        }
        
        System.out.println("----------------------");
        
        SinhVienException sv = null;
//        try {
//            sv = new SinhVienException(10, "aaa");
//        } catch (KhongRongException e) {
//            System.out.println(e);
//        } catch (DuongException e) {
//            System.out.println(e);
//        }
        int ma = 0;
        String ten = "";
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            // ma
            while (true) {                
                
                try {
                    System.out.println("ma: ");
                    ma = Integer.parseInt(b.readLine());
                    if(ma <= 0) throw new DuongException("Ma la so duong");
                    break;
                } catch (NumberFormatException e) {
                    System.err.println(e);
                } catch (DuongException e) {
                    System.err.println(e);
                } 
                
            }
            
            while (true) {                
                try {
                    System.out.println("ten: ");
                    ten = b.readLine();
                    
                    if(ten.isEmpty()) throw new KhongRongException("Ten ko de trong");
                    break;
                } catch (KhongRongException e) {
                    System.err.println(e);
                }
            }
            
        } catch (IOException e) {
            System.err.println(e);
        }
        sv = new SinhVienException(ma, ten);
        System.out.println(sv);
    }
}
