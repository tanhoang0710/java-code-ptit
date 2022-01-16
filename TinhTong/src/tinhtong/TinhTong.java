/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtong;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author DELL
 */
public class TinhTong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("DATA.in"));
            String line = "";
            while((line = br.readLine()) != null) {
                String tmp[] = line.split(" ");
                for (String x : tmp) {
                    if(!isNumeric(x))
                        list.add(x);
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
        list.sort((o1, o2) -> {
            return o1.compareToIgnoreCase(o2);
        });
        for (String x : list) {
            System.out.print(x + " ");
        }
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int n = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
