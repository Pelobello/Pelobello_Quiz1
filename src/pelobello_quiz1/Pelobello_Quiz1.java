/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelobello_quiz1;

import java.util.Arrays;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.arrays.ArrayData;


public class Pelobello_Quiz1 {
    
    
    
    public static void main(String[] args) {
        arrays();
        System.out.println("");
        enterArray();
        
        
  
    }
    public static void enterArray(){
//        number 2
        int []array;
        Scanner scan = new  Scanner(System.in);
        System.out.println("Enter how many index you want to store: ");
        int input = scan.nextInt();
        
        for (int i = 0; i < input; i++) {
            System.out.print("enter here: ");
            int k = scan.nextInt();
            int []arr = new int[k];
            printarray(arr);
           
            
             
              
        }   
        
        
        
    }
    public static void printarray(int [] n){
        System.out.println(n.length);
    }
    
    public static void arrays(){
//        number 1
        int [] arr ={82,44,96,7,13,56,74,14,98,36};
           for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] +" ");
        }
    }
    
}
