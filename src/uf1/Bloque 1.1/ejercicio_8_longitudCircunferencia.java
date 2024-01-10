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
public class ejercicio_8_longitudCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double PI = 3.141592;
        double radio = sc.nextDouble();
        
        double areaCirculo = (2*PI)*radio;
        
        System.out.println(areaCirculo);
    }
}
