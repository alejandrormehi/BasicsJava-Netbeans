/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class Ex02_CalculsVector {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valores [] = new int [10];
        
        for(int i=0 ; i<valores.length; i++){
            System.out.println("Introduce el valor de la posicion " + i);
            valores[i] = sc.nextInt();           
        }
        for(int i=0; i<valores.length; i++){
                System.out.println("El valor de la posicion " + i + " es: " + valores[i]);
            }
        
        /* Media aritmetica, mayor, menor y suma */
        double media = 0;
        int suma = 0;
        int maximo = valores[0];
        int minimo = valores[0];
        for(int i=0; i<valores.length; i++){
            
            /*Suma*/
            suma+=valores[i];
            /*Media*/
            media=(double)suma/valores.length;
            /*Maximo*/
            if(valores[i]>maximo){
                maximo=valores[i];
            }
            /*Minimo*/
            if(valores[i]<minimo){
                minimo=valores[i];
            }
            
        }
        System.out.println("La media aritmetica de los valores del vector es: "+media);
        System.out.println("El valor maximo de la array es: " + maximo);
        System.out.println("El valor minimo de la array es: " + minimo);
        System.out.println("La sumatoria de los elementod es : "+ suma);


    }
}
