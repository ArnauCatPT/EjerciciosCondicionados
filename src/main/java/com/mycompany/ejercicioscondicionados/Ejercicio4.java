/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionados;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio4 {
    /*Escribir un programa que dada la entrada en número de un mes nos
        indique su nombre*/
    public static void mostrarMes(int numMes){
        
       if (numMes == 1) System.out.println("Es Enero");
       else if (numMes == 2) System.out.println("Es Febrero");
       else if (numMes == 3) System.out.println("Es Marzo");
       else if (numMes == 4) System.out.println("Es Abril");
       else if (numMes == 5) System.out.println("Es Mayo");
       else if (numMes == 6) System.out.println("Es Juniu");
       else if (numMes == 7) System.out.println("Es Julio");
       else if (numMes == 8) System.out.println("Es Agosto");
       else if (numMes == 9) System.out.println("Es Septiembre");
       else if (numMes == 10) System.out.println("Es Octubre");
       else if (numMes == 11) System.out.println("Es Noviembre");
       else if (numMes == 12) System.out.println("Es Diciembre");
       else System.out.println("El numero de mes no existe");

    } 
    
    public static void mostrarMesSwitch(int numMes){
        
       switch (numMes){
           case 1: System.out.println("Es Enero");
                   break;
           case 2: System.out.println("Es Febrero");
                   break;
           case 3: System.out.println("Es Marzo");
                   break;
           case 4: System.out.println("Es Abril");
                   break;
           case 5: System.out.println("Es Mayo");
                   break;           
           case 6: System.out.println("Es Juniu");
                   break;           
           case 7: System.out.println("Es Julio");
                   break;
           case 8: System.out.println("Es Agosto");
                   break;
           case 9: System.out.println("Es Septiembre");
                   break;
           case 10: System.out.println("Es Octubre");
                    break;
           case 11: System.out.println("Es Noviembre");
                    break;
           case 12: System.out.println("Es Diciembre");
                    break;
           default: System.out.println("El numero de mes no existe");
       }

    } 
}
