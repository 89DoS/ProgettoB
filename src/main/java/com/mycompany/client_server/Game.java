/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client_server;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ildon
 */

// class per la gestione dei dadi 
//effettuo il lancio,viene estratta una faccia per ogni dado e i dadi vengono disposti in modo casuale 

public class Game {
    private enum Dado {
        PRIMO(1, "B", "A", "O", "O", "Qu", "A"),
        SECONDO(2, "U", "T", "E", "S", "L", "P"),
        TERZO(3, "I", "G", "E", "N", "V", "T"),
        QUARTO(4, "O", "U", "L", "I", "E", "R"),
        QUINTO(5, "A", "C", "E", "S", "L", "R"),
        SESTO(6, "R", "A", "T", "I", "B", "L"),
        SETTIMO(7, "S", "M", "I", "R", "O", "A"),
        OTTAVO(8, "I", "S", "E", "E", "F", "H"),
        NONO(9, "S", "O", "T", "E", "N", "D"),
        DECIMO(10, "A", "I", "C", "O", "F", "R"),
        UNDICESIMO(11, "V", "N", "Z", "D", "A", "E"),
        DODICESIMO(12, "I", "E", "A", "T", "A", "O"),
        TREDICESIMO(13, "O", "T", "U", "C", "E", "N"),
        QUATTORDICESIMO(14, "N", "O", "L", "G", "U", "E"),
        QUINDICESIMO(15, "D", "C", "M", "P", "A", "E"),
        SEDICESIMO(16, "E", "R", "I", "N", "S", "H");

        private int id;
        private String[] facce;

        private Dado(int id, String... facce) {
            this.id = id;
            this.facce = facce;
        }

        public String lancia() {
            return facce[randomInt(0, facce.length)];
        }

        public int getId() {
            return id;
        }

        public String toString() {
            return String.join(", ", facce);
        }
    }

    public static int randomInt(int minValue, int maxValue) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextInt(minValue, Math.max(minValue, maxValue));
    }

    public Dado randomDado(Dado[] dadi) {
        return dadi[randomInt(0, dadi.length)];
    }

    public String[] randomRiga(List<Dado> dadi) {
        String[] riga = new String[dadi.size()];
        for (int i = 0; i < riga.length; i++) {
            riga[i] = dadi.get(i).lancia() ;//+ "(" + dadi.get(i).getId() + ")"
        }
        return riga;
    }

    public String[][] randomGame() {
        List<Dado> dadi = Arrays.asList(Dado.values());
        int numRighe = (int) Math.sqrt(dadi.size());
        String[][] game = new String[numRighe][numRighe];
        Collections.shuffle(dadi);
        for (int i = 0; i < numRighe; i++) {
            game[i] = randomRiga(dadi.subList(numRighe * i, numRighe * (i + 1)));
        }
        return game;
    }

    public static void main(String[] args) {
        Game g = new Game();
        String[][] game = g.randomGame();
        for (String[] riga : game) {
            for (String colonna : riga) {
                System.out.print(colonna + " ");
            }
            System.out.println();
        }
    }

    
}
