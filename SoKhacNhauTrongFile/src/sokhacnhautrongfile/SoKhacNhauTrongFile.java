/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokhacnhautrongfile;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoKhacNhauTrongFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
//        int[] a = new int[100005];
//        String fileName = "DATA.IN";
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//            String line = "";
//            while((line = br.readLine()) != null) {
//                String[] tmp = line.split(" ");
//                for (String x : tmp) {
//                    int xx = Integer.parseInt(x);
//                    a[xx]++;
//                }
//            }
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        for (int i = 0; i < 100005; i++) {
//            if(a[i] > 0)
//                System.out.println(i + " " + a[i]);
//        }

            DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
            int a[] = new int[1000];
            for (int i = 0; i < 100000; i++) {
                a[in.readInt()]++;
            
        }
            
           for (int i = 0; i < 1000; i++) {
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
            
    }
    
}
