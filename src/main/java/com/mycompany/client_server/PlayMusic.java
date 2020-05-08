/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client_server;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 *
 * @author ildon
 */

//class per la gestione del player audio
public class PlayMusic {
    void playMusic (String musicLocation){
        try{
            File musicPath = new File (musicLocation);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                //faccio andare in modalita loop la clip
                clip.loop(clip.LOOP_CONTINUOUSLY);
            }
            
            
            else {
                System.out.println("file audio non trovato");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
   
}
