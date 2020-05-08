/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client_server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ildon
 */
public class Dizionario {
    
    public static void main (String[]args){
    
    BufferedReader br = null;
    String line;
    FileReader fr;        
    ArrayList <String> list = new ArrayList<String>();      

    
        try {           
            br = new BufferedReader(new FileReader("it_IT.dic"));
            
            while((line = br.readLine()) != null  ){
                if (line.startsWith("/")) continue;
                String[] result;
		 list.add(line.substring(0, line.indexOf('/')));
                
                
                
            
            }
            System.out.println(list);
           
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

