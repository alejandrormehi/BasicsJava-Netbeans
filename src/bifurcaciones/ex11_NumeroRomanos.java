/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bifurcaciones;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class ex11_NumeroRomanos {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Introduce un numero natural entre 1 y 3999 :");
            
            int numero = sc.nextInt();
            
            String resultado = "";
            
            while(numero>=1000){
                resultado+= "M";
                numero -=1000;
            }
            if (numero >= 900){
                resultado += "CM";
                numero -=900;
            }
            
            if (numero >= 500){
                resultado += "CM";
                numero -= 500;
            }
            if (numero >= 400){
                resultado += "CM";
                numero -=400;
            }
            while(numero>=100){
                resultado+= "C";
                numero -=100;
            }
            if (numero >= 90){
                resultado += "XC";
                numero -=90;
            }
            
            if (numero >= 50){
                resultado += "L";
                numero -= 50;
            }
            if (numero >= 40){
                resultado += "XL";
                numero -=40;
            }
            while(numero>=10){
                resultado+= "x";
                numero -=10;
            }
            if (numero >= 9){
                resultado += "IX";
                numero -=9;
            }
            
            if (numero >= 5){
                resultado += "V";
                numero -= 5;
            }
            if (numero >= 4){
                resultado += "IV";
                numero -=4;
            }
            while (numero >=1){
                resultado += "I";
                numero -= 1;
            }
            System.out.println("El numero en romanos es: " + resultado);
        }
}
