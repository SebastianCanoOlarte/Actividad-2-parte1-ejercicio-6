/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero6;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero6 {

    public static void main(String[] args) {
        int a,b,c,mayor;
        Scanner input = new Scanner(System.in);
        System.out.println("recuerde que los numeros no pueden ser iguales");
        System.out.println("escriba el numero a");
        a = input.nextInt();
        System.out.println("escriba el numero b");
        b = input.nextInt();
        System.out.println("escriba el numero c");
        c = input.nextInt();
        if (a>b && a>c){
            mayor = a;
        }
        else if (b>a && b>c){
            mayor = b;
        }
        else{
            mayor = c;     
        }
        System.out.println("el valor mayor entre "+a+", "+b+" y "+c+" es "+mayor);
    }
}
