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
public class par {
    
  public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in); 
     
     System.out.println("Digite um numero: ");
       double n1 = teclado.nextDouble();
     
     boolean par = (n1 %2 ==0);
     boolean impar = (n1%2!=0);
     
    System.out.println("O numero eh par:"+par); 
    System.out.println("O numero eh impar:"+impar); 
     
    
    
 }  
}
