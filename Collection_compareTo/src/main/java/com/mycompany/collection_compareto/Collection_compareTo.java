/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collection_compareto;

/**
 *
 * @author Ulima
 */
public class Collection_compareTo {
   public static void main(String args[]){  
    String s1="hello";  
    String s2="hello";  
    String s3="meklo";  
    String s4="hemlo";  
    String s5="flag";  
    
    System.out.println(s1.compareTo(s2));//0 because both are equal  
    System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
    System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
    System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
    }
}  
