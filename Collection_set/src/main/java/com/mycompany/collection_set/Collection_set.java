/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collection_set;

/**
 *
 * @author Ulima
 */
import java.io.*;   
import java.util.*; 

public class Collection_set {
    public static void main(String args[])   
    {   
        Set<Integer> data = new LinkedHashSet<>();   
        data.add(11);
        data.add(31);   
        data.add(41);   
        data.add(51);   
        data.add(61);
        data.add(71); 
        
        System.out.println("Set: " + data);  
        
        System.out.println("Does the Set contains '91'? " + data.contains(91));   
        System.out.println("Does the Set contains 'Your Name'? " + data.contains("21"));  
        System.out.println("Does the Set contains '51? " + data.contains(51));  
        
        System.out.println("\nIs data empty?: "+ data.isEmpty());    
    }  
}

