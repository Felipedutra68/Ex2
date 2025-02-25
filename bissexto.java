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
public class bissexto {
    
 public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Digite o ano: ");
       double n1 = teclado.nextDouble();
     
     boolean bi = ((n1%4==0) &&  (n1%100!=0) || (n1%400==0));
     boolean normal = (n1%100==0);
     
    System.out.println("O ano eh bissexto:"+bi); 
    System.out.println("O ano eh normal:"+normal); 
     
  
    
 }   
}
