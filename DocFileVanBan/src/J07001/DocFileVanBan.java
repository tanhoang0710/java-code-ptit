/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DocFileVanBan {
    
    
    public static void main(String[] args) {
        String fileName = "DATA.in";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {                
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
//        try {
//            Scanner sc  = new Scanner(new File("DATA.in"));
//            while (sc.hasNextLine()) {                
//                System.out.println(sc.nextLine());
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
