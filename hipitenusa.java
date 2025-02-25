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
public class hipitenusa {
    
 public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
   
    System.out.println("Digite o primeiro cateto: ");
       double n1 = teclado.nextDouble();
       
    System.out.println("Digite o segundo cateto: ");
       double n2 = teclado.nextDouble();
    
       
    double sim = Math.sqrt(Math.pow(n1, 2) + Math.pow(n2, 2));
            
   
    
    System.out.println("A hipotenuse eh:" +sim);
    
       
 }  
}
