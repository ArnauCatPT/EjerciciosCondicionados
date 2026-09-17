/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionados;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio2 {
    //Realizar un programa que determine el mayor de tres números.
    public static void mostrarMayord3(int num1, int num2, int num3){
               
        if (num1 > num2 && num1 > num3){
            System.out.println("El mayor el primer");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("El mayor el segundo numero");
        }else if (num3 > num1 && num3 > num1){
                System.out.println("El mayor el tercer numero");
        }else{
                System.out.println("Son iguales");
        }
    }
}

