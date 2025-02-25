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
public class triangulo {
    
 public static void main(String[] args) {    
 
      Scanner teclado = new Scanner(System.in); 
      
      System.out.println("Digite o valor do primeiro lado: ");
       double d1 = teclado.nextDouble();
       
       System.out.println("Digite o valor do segundo lado: ");
       double d2 = teclado.nextDouble();
       
       System.out.println("Digite o valor do terceiro lado: ");
       double d3 = teclado.nextDouble();
       
       
       
       
       if ((d1 == d2) && (d1 == d3) &&  (d3 ==d2)){
         System.out.println("Equilatero");
       } else if((d1 == d2) && (d1 != d3) &&  (d3 != d2)){
      System.out.println("Isoceles");
       } else if((d1 != d2) && (d1 == d3) &&  (d3 != d2)){
      System.out.println("Isoceles");
       } else if((d1 != d2) && (d1 != d3) &&  (d3 == d2)){
      System.out.println("Isoceles");
       } else if((d1 != d2) && (d1 != d3) &&  (d3 != d2)){
      System.out.println("Escaleno");
      
             
  }   
 }  
}
 
// cont + R