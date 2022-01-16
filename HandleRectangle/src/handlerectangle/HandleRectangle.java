/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlerectangle;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HandleRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rec = new Rectangle(scanner.nextDouble(), scanner.nextDouble(), scanner.next());
        if (rec.getWidth() <= 0 || rec.getHeight() <= 0){
            System.out.println("INVALID");
        }else {
            rec.showProfile();
        }
    }
    
}
