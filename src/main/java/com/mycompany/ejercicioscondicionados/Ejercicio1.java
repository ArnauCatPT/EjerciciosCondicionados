/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionados;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio1 {
    //Dada la nota de un alumno en porcentaje, decir que ha sacado.
    public static void mostrarNota(float nota){
               
        if(nota >= 80 && nota <= 100){
            System.out.println("Tienes un excelente");
        }
        else if (nota >= 70 && nota < 80){
            System.out.println("Tienes un notable");
        }else if (nota >= 60 && nota < 70){
            System.out.println("Tienes un bien");
        }else if (nota > 50 && nota < 60 ){
            System.out.println("Tienes un suficiente");
        }else if (nota >0 && nota <50){
            System.out.println("Tienes un insuficiente");
        }else{
                System.out.println("el porcentaje es incorrecto");
         }
    }
        

}
