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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ildon
 */
public class Dizionario {   
    private static BufferedReader br = null;
    private static String line;
    private static FileReader fr;        
    private static ArrayList <String> list = new ArrayList<String>();       
    private void Dizionario(BufferedReader br,String line, FileReader fr, ArrayList <String> list ) {
    	this.br = br;
    	this.fr = fr;
    	this.line = line;
    	this.list = list;
    }
    public ArrayList<String> CreaDizionario(){
        try {           
            br = new BufferedReader(new FileReader("it_IT.dic"));            
            while((line = br.readLine()) != null  ){
                if (line.startsWith("/")) continue;
                int c =line.indexOf('/');               
                if (c<0){
                list.add(line);             
                }
                else{
		 list.add(line.substring(0, c));
                
                }         
            }          
        } catch (IOException ex) {
            ex.printStackTrace();
        }
		return list;   
    }
    public static void main(String[] args) {
    	Dizionario d = new Dizionario();
    	ArrayList<String> lista = d.CreaDizionario();
    	System.out.println(lista);
    }

	
}


