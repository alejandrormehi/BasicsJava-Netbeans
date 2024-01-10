/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque1;

import javax.swing.JOptionPane;

/**
 *
 * @author newge
 */
public class ejer01_cuadradoDeNumero {
    
    public static void main(String[] args) {
        
    
    String input = JOptionPane.showInputDialog("Introduce un numero: ");
    
    try{
    int inValor = Integer.parseInt(input);
            int resultado = inValor*inValor;
            
            System.out.println("El valor introducido es: " + input + " , y el cuadrado de dicho numero es: " + resultado);

} catch(NumberFormatException e) {
            System.out.println("ERROR");
}
    
    
}
}