/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class continue_tablaProducto3 {
    public static void main(String[] args) {
        
        int valor;
        
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Por favor, proporciona un valor : ");
            valor = sc.nextInt();
        }else{
            valor=Integer.parseInt(args[0]);
        }
        

        System.out.println("Tabla de multiplicar del numero " + valor);
        
        for(int i=1; i<=10; ++i){
            if (i==5) {
                continue;
            }
                            System.out.println(valor + " * " + i + "= " + valor*i);
        }
    }
}
