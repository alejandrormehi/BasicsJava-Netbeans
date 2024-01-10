/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bifurcaciones;
import javax.swing.JOptionPane;
/**
 *
 * @author newge
 */
public class ex04_datosPersonales {
    public static void main(String[] args) {
        
        Object[] sexo = {"Macho alfa", "Femenino","Degenerado"};
        
        String name = JOptionPane.showInputDialog("Introduce tu nombre: ", JOptionPane.QUESTION_MESSAGE );
        String edad = JOptionPane.showInputDialog("Introduce tu edad: ", JOptionPane.QUESTION_MESSAGE );
        String direccion = JOptionPane.showInputDialog("Introduce tu direccion: ", JOptionPane.QUESTION_MESSAGE );
        String telefono = JOptionPane.showInputDialog("Introduce tu telefono: ", JOptionPane.QUESTION_MESSAGE );
        int askSexo = JOptionPane.showOptionDialog(null, "Selecciona tu sexo:", "Questionario",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, sexo, sexo[2]);
                   
        if(askSexo != -1){
            JOptionPane.showMessageDialog(null, "Así que tu eres " + name + " cuya edad es: " + edad + " Y vives en "+ direccion + " tienes como "
                    + "telefono: " + telefono + "Y te identificas sexualmente como un " + sexo[askSexo]);
        }
    }
}
