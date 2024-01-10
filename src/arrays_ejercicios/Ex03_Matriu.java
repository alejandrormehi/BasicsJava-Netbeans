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
public class Ex03_Matriu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int matriz[][] = new int[4][10];
        int valFila = 1;
        int val2Fila = 1;
        int val3Fila = 1;
        int val4Fila = 1;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==0){
                matriz[i][j]= valFila*2;
                valFila++;
                }else if(i==1){
                    matriz[i][j] = val2Fila*val2Fila;
                    val2Fila++;
                }else if(i==2){
                    matriz[i][j] = matriz[0][j]-matriz[1][j];
                    val3Fila++;
                }else if(i==3){
                    matriz[i][j] = matriz[0][j]+matriz[1][j]+matriz[2][j];
                    val4Fila++;
                }
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
