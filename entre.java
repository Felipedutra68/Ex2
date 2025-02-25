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
public class entre {
    
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
     
      System.out.println("Digite um numero: ");
       double n1 = teclado.nextDouble();
     
     boolean sim = ((n1 >= 10) && (n1 <= 20));
          
    System.out.println("Onumero esta entre 10 e 20?:"+sim); 
     
    
 } 
}
