/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioscondicionados;

import java.util.Scanner;

/**
 *
 * @author UsuarioM
 */
public class EjerciciosCondicionados {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int op = 0;
        
        do{
            System.out.println("***************MENU****************");
            System.out.println("1.- Ejercicio 1");
            System.out.println("2.- Ejercicio 2");
            System.out.println("3.- Ejercicio 3");
            System.out.println("4.- Ejercicio 4");
            System.out.println("5.- Ejercicio 5");
            System.out.println("6.- Ejercicio 6");
            System.out.println("7.- Ejercicio 7");
            System.out.println("8.- Salir");
            op = sc.nextInt();
            
            switch (op){
                case 1: 
                    System.out.println("Introduce una nota en porcentage: ");
                    float notaPorcentada = sc.nextFloat();
                    //if de mayores sin elseif
                    Ejercicio1.mostrarNota(notaPorcentada);
                    break;
                case 2:
                    System.out.println("Introduce el primer numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    int num2 = sc.nextInt();
                    System.out.println("Introduce el tercer numero: ");
                    int num3 = sc.nextInt();
                    Ejercicio2.mostrarMayord3(num1, num2, num3);
                    break;
                case 3:
                    System.out.println("Introduce una letra: ");
                    String palabra = sc.next();
                    Ejercicio3.mostrarLetra(palabra);
                    break;
                case 4,7:
                    System.out.println("Introduce el numero de un mes: ");
                    int numMes = sc.nextInt();
                    if (op==4) {
                        Ejercicio4.mostrarMes(numMes);
                    }else{
                        Ejercicio4.mostrarMesSwitch(numMes);
                    }
                    break;
                case 5:
                    System.out.println("¿Colon descubrió América? ");
                    char corr1 = sc.next().charAt(0);

                    if(corr1 == 's' || corr1 == 'S')
                    {
                       System.out.println("¿La capital de Inglaterra es Cambridge?"); 
                       char corr2 = sc.next().charAt(0);
                       if(corr2 == 's' || corr2 == 'S')
                       {
                            System.out.println("¿El sol, es una estrella?");
                            char corr3 = sc.next().charAt(0);
                            if(corr3 == 's' || corr3 == 'S'){
                                System.out.println("Las 3 preguntas son correctas");
                            }else{
                                System.out.println("La tercera es incorrecta");
                            }
                        }else{
                           System.out.println("La segunda es incorrecta");
                       }
                    }else{
                        System.out.println("La primera es incorrecta");
                    }
                    break;
                case 6:
                    System.out.println("Ejercicio 6: ");
                    System.out.println("Horas trabajadas? ");
                    int horas = sc.nextInt();
                    Ejercicio6.mostrarDinero(horas);
                    break;                    
            }
        }while(op!=8);

        
}


}
