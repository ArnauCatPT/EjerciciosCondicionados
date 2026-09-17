/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionados;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio6 {
    public static void mostrarDinero(int horas){
       /*
        Crear un programa que determine el dinero que recibirá un
trabajador por las horas extra que realiza en una empresa. Las
horas extra son las que sobrepasan las 40 horas semanales.
Cuando las horas extras no son más de 8, se pagan el doble,
cuando pasan de 8, las primeras 8 se pagan el doble y el resto el
triple.
        
                
        */ 
       
       
       int horasExtras = horas - 40;
       int auxhoras = 0;
       
       if (horas >= 0 && horas <= 40){
           System.out.println("No tiene horas extras");
       }else if(horas >40){
           if (horasExtras <=8){
               auxhoras = horasExtras;
               System.out.println("Las primeras "+auxhoras+" 8 horas se pagan el doble");
           }else{               
               auxhoras = horasExtras - 8;
               System.out.println("Las primeras 8 horas se pagan el doble");
               System.out.println("Las siguientes "+auxhoras+" horas se pagan el triple");
           }
       }

       
    }     
}
