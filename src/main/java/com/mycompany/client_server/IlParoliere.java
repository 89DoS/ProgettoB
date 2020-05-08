/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.Painter;

/**
 *
 * @author ildon
 */
public class IlParoliere implements Runnable {
    private String ip = "192.168.1.33";
    private int port = 22222;
    private Scanner scanner = new Scanner(System.in);
    private JFrame frame;
    private final int WIDTH =506;
    private final int HEIGHT=527;
    private Thread thread;
    
    private Painter painter;
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
    
    private ServerSocket serversocket;
    
    
    public IlParoliere(){        
}
    public void run(){
        
    }
    @SuppressWarnings("unused")
    public static void main (String[]args){
        IlParoliere ilParoliere = new IlParoliere();
    }
    public class Painter{
        
    }
    
}
