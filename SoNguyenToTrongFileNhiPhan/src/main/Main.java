/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/data.txt"));
        ArrayList<Integer> list = (ArrayList<Integer>)in.readObject();
        Map<Integer,Integer> m1 = new TreeMap<>();
        Map<Integer,Integer> m2 = new TreeMap<>();
        for(int i:list){
            if(m1.containsKey(i)){
                m1.put(i, m1.get(i)+1);
            }else{
                m1.put(i, 1);
            }
        }
        System.out.println(m1);
    }
}
