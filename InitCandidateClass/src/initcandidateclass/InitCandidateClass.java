/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initcandidateclass;

import data.Candidate;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class InitCandidateClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, dob;
        float score1, score2, score3;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        dob = sc.nextLine();
        score1 = sc.nextFloat();
        score2 = sc.nextFloat();
        score3 = sc.nextFloat();
        Candidate c = new Candidate(name, dob, score1, score2, score3);
        
        c.showProfile();
        
    }
    
}
