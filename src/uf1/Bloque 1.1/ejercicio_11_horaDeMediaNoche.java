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
public class ejercicio_11_horaDeMediaNoche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una hora, la que desees: ");
        int hora = sc.nextInt();
        System.out.println("Ahora escribe los minutos: ");
        int minuto = sc.nextInt();
        
        int horas = 24;
        int minutos = 3600;
        
        System.out.println("Han pasado desde media noche: " + hora%horas + " y " + minuto%minutos + " minutos" );
        
    }
    
}
