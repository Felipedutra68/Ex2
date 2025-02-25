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
public class maior {
    
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
     
     System.out.println("Digite o primeiro: ");
       double n1 = teclado.nextDouble();
       
       System.out.println("Digite o segungo: ");
       double n2 = teclado.nextDouble();
     
      if (n1 > n2) {
         System.out.println("O primeiro numero eh maior");
       } else if (n2 > n1)
       System.out.println("O segundo numero eh maior");
           
     
     
    
 }
}
