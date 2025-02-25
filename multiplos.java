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
public class multiplos {
    
     public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
    
  System.out.println("Digite um numero:");
       double n1 = teclado.nextDouble();   
       
       
       if ((n1 %3 == 0 ) && (n1 % 7 == 0) ){
         System.out.println("O numero eh multiplo de 3 e 7");
       } else 
       System.out.println("O numero nao eh meltiplo de 3 e 7");    
       
       
       
    
     } 
}
