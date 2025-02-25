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
public class intervalo {
    
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Digite um numero: ");
       double n1 = teclado.nextDouble();
     
     boolean r = (n1 > 100 && n1 < 200);
     
    System.out.println("O numero esta entre 100 e 200?"+r);
     
    }
}
