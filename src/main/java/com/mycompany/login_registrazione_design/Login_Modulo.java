
package com.mycompany.login_registrazione_design;

import java.awt.Color;
import java.awt.Image;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ildon
 */
public class Login_Modulo extends javax.swing.JFrame {

  
    public Login_Modulo() {
        initComponents();
        
        
        
        //centrare il modulo
        this.setLocationRelativeTo(null);
        
        //creo il bordo verde per il pannello del titolo
       
        Border jpanel_titolo_bordo = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.decode("#276F08"));
        jPanel_titolo.setBorder(jpanel_titolo_bordo);
        
        String user = "utente2.png";
        ImageIcon iconaU = new ImageIcon(user);
        utente.setIcon(iconaU);
        String pass = "password.png";
        ImageIcon iconaP =new ImageIcon(pass);
        password.setIcon(iconaP);
        String logo = "index1.PNG";
        ImageIcon iconaL = new ImageIcon(logo);
        Image image = iconaL.getImage(); // transform it 
        Image newimg = image.getScaledInstance(56, 59,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        iconaL = new ImageIcon(newimg);  // transform it back
        
        Logo2.setIcon(iconaL);
        
        
        
        
    
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        utente = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jLabel_Create_Account = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_minimizza = new javax.swing.JLabel();
        jLabel_chiudi = new javax.swing.JLabel();
        jPanel_titolo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Logo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        utente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_Username.setText("username");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jPasswordField_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_Password.setText("password");
        jPasswordField_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusLost(evt);
            }
        });
        jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PasswordActionPerformed(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(0, 75, 56));
        jButton_Login.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setText("Login");
        jButton_Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseExited(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabel_Create_Account.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Create_Account.setForeground(new java.awt.Color(0, 102, 0));
        jLabel_Create_Account.setText(">>Non hai un account? Creane uno!");
        jLabel_Create_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Create_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText(">>Password dimenticata? creane una nuova!");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(utente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Username)
                            .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_Create_Account)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(121, 121, 121))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Username)
                    .addComponent(utente, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Create_Account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel_minimizza.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_minimizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimizza.setText("-");
        jLabel_minimizza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_minimizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimizza.setMinimumSize(new java.awt.Dimension(8, 22));
        jLabel_minimizza.setPreferredSize(new java.awt.Dimension(22, 22));
        jLabel_minimizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizzaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizzaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_minimizzaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_minimizzaMouseReleased(evt);
            }
        });

        jLabel_chiudi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_chiudi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_chiudi.setText("x");
        jLabel_chiudi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_chiudi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_chiudi.setPreferredSize(new java.awt.Dimension(22, 22));
        jLabel_chiudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_chiudiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_chiudiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_chiudiMouseReleased(evt);
            }
        });

        jPanel_titolo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Login");

        javax.swing.GroupLayout jPanel_titoloLayout = new javax.swing.GroupLayout(jPanel_titolo);
        jPanel_titolo.setLayout(jPanel_titoloLayout);
        jPanel_titoloLayout.setHorizontalGroup(
            jPanel_titoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titoloLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel_titoloLayout.setVerticalGroup(
            jPanel_titoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titoloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("il paroliere");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_titolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel_minimizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_chiudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_titolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_minimizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_chiudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizzaMouseEntered
       
    }//GEN-LAST:event_jLabel_minimizzaMouseEntered

    private void jLabel_minimizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizzaMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizzaMouseClicked

    private void jLabel_minimizzaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizzaMousePressed
        jLabel_minimizza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_jLabel_minimizzaMousePressed

    private void jLabel_minimizzaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizzaMouseReleased
        jLabel_minimizza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.EtchedBorder.RAISED));
    }//GEN-LAST:event_jLabel_minimizzaMouseReleased

    private void jLabel_chiudiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_chiudiMousePressed
        jLabel_chiudi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_jLabel_chiudiMousePressed

    private void jLabel_chiudiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_chiudiMouseReleased
        jLabel_chiudi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.EtchedBorder.RAISED));
    }//GEN-LAST:event_jLabel_chiudiMouseReleased

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PasswordActionPerformed

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
       
        // cancella testo di default
        if(jTextField_Username.getText().trim().toLowerCase().equals("username")){
            jTextField_Username.setText("");
            jTextField_Username.setForeground(Color.black);
        }
         utente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        //se il testo è vuoto o uguale a username allora setta username
        if(jTextField_Username.getText().trim().equals("") || jTextField_Username.getText().trim().toLowerCase().equals("username")){
            jTextField_Username.setText("username");
            jTextField_Username.setForeground(new Color(153,153,153));
        }
         utente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jPasswordField_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusGained
        String pass = String.valueOf(jPasswordField_Password.getPassword());
        
         if(pass.trim().toLowerCase().equals("password")){
            jPasswordField_Password.setText("");
            jPasswordField_Password.setForeground(Color.black);
        }
         password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        
    }//GEN-LAST:event_jPasswordField_PasswordFocusGained

    private void jPasswordField_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusLost
         String pass = String.valueOf(jPasswordField_Password.getPassword());     
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password")){
            jPasswordField_Password.setText("password");
            jPasswordField_Password.setForeground(new Color(153,153,153));
        }
         password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
    }//GEN-LAST:event_jPasswordField_PasswordFocusLost

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        
        PreparedStatement st;
        PreparedStatement st1;
        ResultSet rs;
        ResultSet rs1;
        //ottieni username e password
        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField_Password.getPassword());
        
        //crea una select query per verificare se l'utente esiste
        String query ="SELECT * FROM playerip WHERE username = ? AND password = ? ";
        String query1 ="SELECT * FROM playerip WHERE stato = '0'";
        
        if(username.trim().equals("username")){
            JOptionPane.showMessageDialog(null, "Inserire username", "Username vuoto", 2);
        }else if(password.trim().equals("password")){
           JOptionPane.showMessageDialog(null, "Inserire password", "Password vuoto", 2); 
        }
        else{
            
           
        
        try {
            st = Connessione_db.getConnection().prepareStatement(query);
            st1 = Connessione_db.getConnection().prepareStatement(query1);
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            rs1 = st1.executeQuery();
             
            
             if(rs.next()){
                 if(rs1.next()){
                Verifica_email form1 = new Verifica_email();
                form1.setVisible(true);
                form1.pack();
                form1.setLocationRelativeTo(null);
                //chiudi il modulo di login
                this.dispose();
                }
               
                
                //visualizza un nuovo modulo
                
                 else{     Paroliere_Form form = new Paroliere_Form();
                
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                //chiudi il modulo di login
                this.dispose();
                 }
                
            }
            else{
                //messaggio di errore
                JOptionPane.showMessageDialog(null, "username / password non validi","errore di login",2);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Login_Modulo.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
        
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoginMouseEntered

    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoginMouseExited

    private void jLabel_chiudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_chiudiMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_chiudiMouseClicked

    private void jLabel_Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseEntered
        Border label_border =BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#276F08"));
        jLabel_Create_Account.setBorder(label_border);
    }//GEN-LAST:event_jLabel_Create_AccountMouseEntered

    private void jLabel_Create_AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseExited
       jLabel_Create_Account.setBorder(null);
    }//GEN-LAST:event_jLabel_Create_AccountMouseExited

    private void jLabel_Create_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseClicked
        
        Registrazione_modulo rf = new Registrazione_modulo();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ResetPass rp = new ResetPass();
        rp.setVisible(true);
        rp.pack();
        rp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       Border label_border =BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#276F08"));
        jLabel2.setBorder(label_border);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setBorder(null);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    
    public static void main(String args[]) {
       
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Modulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo2;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Create_Account;
    private javax.swing.JLabel jLabel_chiudi;
    private javax.swing.JLabel jLabel_minimizza;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_titolo;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JLabel password;
    private javax.swing.JLabel utente;
    // End of variables declaration//GEN-END:variables
}
