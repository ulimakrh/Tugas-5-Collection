/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collection_map;

/**
 *
 * @author Ulima
 */
import java.util.HashMap;
import java.util.Map;

public class Collection_map {   
    public static void main(String[] args) {
        Map<String, String> RainbowColor = new HashMap<>();
        
        RainbowColor.put("First", "Red");
        RainbowColor.put("Second", "Orange");
        RainbowColor.put("Third", "Yellow");
        RainbowColor.put("Fourth", "Green");
        RainbowColor.put("Fifth", "Blue");
  
        display(RainbowColor);
        System.out.println(RainbowColor.get("Third"));
    }
    
    static void display(Map<String, String> RainbowColor){
        for(HashMap.Entry<String, String> rainbow : RainbowColor.entrySet()){
            System.out.println("Order : " + rainbow.getKey() + "\tColor : " + rainbow.getValue());
        }
    }
    
}
