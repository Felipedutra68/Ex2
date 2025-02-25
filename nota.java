/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author ADM
 */

public class nota {
    
  public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in); 
     
       System.out.println("Digite sua nota: ");
       double n1 = teclado.nextDouble();
       
       System.out.println("Digite sua requencia: ");
       double f1 = teclado.nextDouble();
     
    if ((n1 >= 60) && (f1 >= 75) ) {
      System.out.println("Voce passou");
  } else {
      System.out.println("Voce rodou");    
    
          
          
          }  
              
 }
}
