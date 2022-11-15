/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collection_list;

/**
 *
 * @author Ulima
 */

import java.util.ArrayList;
import java.util.Collections;

public class Collection_list {
    private ArrayList<String> studentName = new ArrayList();
    
    public void addStudents(String studentName, int idx) {
        if(idx == 1)
            this.studentName.add(studentName);
        else 
            this.studentName.add(idx, studentName);
    }
    
    public void removeStudents(String studentName){
        this.studentName.remove(studentName);
    }
    
}
