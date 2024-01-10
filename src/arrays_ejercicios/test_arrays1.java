/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;

/**
 *
 * @author newge
 */
public class test_arrays1 {
    public static void main(String[] args) {
        
        int []valores = new int[20];
        
        for(int i=0; i<valores.length;i++){
            valores[i]=i+5;
        }
      /*  for(int i=0;i<valores.length;i++){
            System.out.println("valores["+i+"] = "+valores[i]);
        }*/
   /*   for(int val:valores){
          System.out.println(val+", ");
      }*/
   int [][]valors= new int[20][5];
   
   for(int i=0;i< valors.length;++i){
       for(int j=0; j<valors[0].length;++j){
           valors[i][j]= i+2*j+5;
       }
   }
   for(int[]fila:valors){
       for(int val:fila){
           System.out.println(val + ",");
       }
   }
        
    }
}
