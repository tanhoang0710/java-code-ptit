/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordset;

import java.util.*;

/**
 *
 * @author DELL
 */
public class WordSet {
    private String s;

    public WordSet(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
    

    @Override
    public String toString() {
        return s;
    }
    
    public WordSet union(WordSet s2) {
        String t1[] = this.getS().toLowerCase().split(" ");
        String t2[] = s2.getS().toLowerCase().split(" ");
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        
        for (String x : t1) {
            set1.add(x);
        }
        for (String x : t2) {
            set2.add(x);
        }
        set1.addAll(set2);
        List<String> l1 = new ArrayList<>();
        for (String x : set1) {
            l1.add(x);
        }
        l1.sort((o1, o2) -> {
            return o1.compareToIgnoreCase(o2); //To change body of generated lambdas, choose Tools | Templates.
        });
        String tmp = "";
        for (String x : l1) {
            tmp += x + " ";
        }
        return new WordSet(tmp.substring(0, tmp.length() - 1));
    }
    
    public WordSet intersection(WordSet s2) {
        String t1[] = this.getS().toLowerCase().split(" ");
        String t2[] = s2.getS().toLowerCase().split(" ");
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l = new ArrayList<>();
        for (String x : t1) {
            l1.add(x);
        }
        for (String x : t2) {
            l2.add(x);
        }
        for (String x : l1) {
            if(l2.contains(x)){
                l.add(x);
            }
        }
        l.sort((o1, o2) -> {
            return o1.compareToIgnoreCase(o2); //To change body of generated lambdas, choose Tools | Templates.
        });
        String tmp = "";
        for (String x : l) {
            tmp += x + " ";
        }
        return new WordSet(tmp.substring(0, tmp.length() - 1));
    }
}
