/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_assignment1;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Temperature {

 public static void main(String [] args)
    {        
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter kelsius value:");
    double kelsius = scan.nextDouble();
    double pharenheit;
    pharenheit = kelsius*2+20/kelsius;
    System.out.println(" Kelsius in Pharenheit is " + pharenheit);
    
        
    }
}
