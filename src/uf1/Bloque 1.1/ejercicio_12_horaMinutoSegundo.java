/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author newge
 */
public class ejercicio_12_horaMinutoSegundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de segundos");
        int segundos = sc.nextInt();
        int dias = segundos / 86400;
        int horas = segundos/3600;
        int minutos = segundos/60;
        System.out.println("Los segundos introducidos corresponden son " + segundos+  " y corresponden a: " +
                dias + " dias " +
                horas +" horas " + " y " +
                minutos + " minutos");
    }
    
}
