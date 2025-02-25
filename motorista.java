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
public class motorista {
    
   public static void main(String[]args) {
    
       Scanner teclado2 = new Scanner(System.in);
       
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Digite a sua idade ");
       int n1 = teclado.nextInt();
       
       System.out.println("Voce tem carteira[sim[1]/nao[2]]: ");
       int c1 = teclado2.nextInt();
     
     
    boolean sim = ((n1 >= 18) && (c1==1));
     
     
    System.out.println("Voce pode comprar:"+sim); 
     

 }  
}
