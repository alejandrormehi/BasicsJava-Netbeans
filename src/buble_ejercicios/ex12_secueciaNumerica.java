/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buble_ejercicios;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class ex12_secueciaNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
         int num = 10;
         
        for (int i = 1; i <= 5; i++) {

            for (int j = num; j >=0; j--) {
                System.out.print(j);
            }
            System.out.println();
            num--;
        }
    }
}
