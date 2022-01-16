/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuanhoaxauhotentrongfile;

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
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("DATA.in"));
        String line = "";
        while (!((line = br.readLine()).equals("END"))) {
            line = line.trim().toLowerCase();
            String tmp[] = line.split("\\s+");
            String res = "";
            for (String x : tmp) {
                res += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
            }
            System.out.println(res.trim());
        }
    }
    
}
