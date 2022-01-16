/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
public class Candidate {
    private String name;
    private String dob;
    private float score1;
    private float score2;
    private float score3;
    private float totalScore;

    public Candidate(String name, String dob, float score1, float score2, float score3) {
        this.name = name;
        this.dob = dob;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }
    
    public float getTotalScore() {
        return score1 + score2 + score3;
    }
    
    public void showProfile() {
        totalScore = score1 + score2 + score3;
        System.out.printf(name + " " + dob + " %.1f", totalScore);
    }
    
}
