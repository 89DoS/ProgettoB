/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login_registrazione_design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ildon
 */
public class Connessione_db {
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.33:5432/users_db", "postgres", "1951Mercury" );
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + Connessione_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return conn;
    }
    
}
