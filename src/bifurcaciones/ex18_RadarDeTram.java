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
public class ex18_RadarDeTram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la DISTANCIA");
        
        double  distancia = sc.nextInt();
        
        System.out.println("Introduce la VELOCIDAD MAXIMA");
        
        double velocidadMax = sc.nextInt();
        
        System.out.println("Introduce la el TIEMPO");
        
        double  tiempo = sc.nextInt();
        
        double velocidadMedia = (distancia/tiempo)*36;
        int valor = (int) (Math.floor(velocidadMedia/10.0)) ;
        String respuesta;
               
        if(valor<=velocidadMax){
            respuesta= "Esta DENTRO de los limites";
            
        }else if (valor>velocidadMax && valor <= velocidadMax+(velocidadMax*0.2)){
            respuesta = "MULTA";
            
        }else {
            respuesta = "MULTA y Puntos";
      
        }
         System.out.println("Velocidad media: " + valor + " => "+ respuesta) ;
    }
}
