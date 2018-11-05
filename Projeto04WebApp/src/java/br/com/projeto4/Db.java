/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto4;

import java.util.ArrayList;

/**
 *
 * @author Leona
 */
public class Db {
    public static ArrayList<Question> getTest(){
        ArrayList<Question> test = new ArrayList<>();
        
        String[] q = new String[10];
        int[] x = new int[10];
        String[][] y = new String[10][3];
        
        q[0] = "No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?";
        q[1] = "Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?";
        q[2] = "Quem narra o jogo FIFA 14 no idioma Português do Brasil?";
        q[3] = "Quantos deuses Kratos aniquila no decorrer de God Of War III?";
        q[4] = "No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?";
        q[5] = "Qual o nome da cidade em que se passa o Left 4 Dead 2?";
        q[6] = "Quem é Hanzo Hasashi no game Mortal Kombat?";
        q[7] = "Em que ano foi lançado o jogo Need For Speed Underground?";
        q[8] = "Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?";
        q[9] = "Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?";
        
        y[0][0] = "Um medalhão Maia";
        y[0][1] = "A maçã do Éden";
        y[0][2] = "Uma chave de ouro";
        
        y[1][0] = "Vergil";
        y[1][1] = "Kratos";
        y[1][2] = "Phillipe";
        
        y[2][0] = "Tiago Leifert";
        y[2][1] = "Kratos";
        y[2][2] = "Phillipe";
        
        y[3][0] = "Mais de cinco";
        y[3][1] = "Um";
        y[3][2] = "Quatro";
        
        y[4][0] = "Jogando de uma montanha";
        y[4][1] = "Com um tiro na cabeça";
        y[4][2] = "Envenenamento";
        
        y[5][0] = "New Jersey";
        y[5][1] = "New Orleands";
        y[5][2] = "San Francisco";
        
        y[6][0] = "Scorpion";
        y[6][1] = "Sub Zero";
        y[6][2] = "Smoke";
        
        y[7][0] = "2003";
        y[7][1] = "1999";
        y[7][2] = "2000";
        
        y[8][0] = "Para ressuscitar sua amada";
        y[8][1] = "Para acabar com o mundo";
        y[8][2] = "Para se tornar um deus";
        
        y[9][0] = "O martelo de Thor";
        y[9][1] = "Uma bota";
        y[9][2] = "Blade of Chaos";
        
        for(int i=0;i<10;i++){
            
            int valor = (int) (Math.random() * 7);
            x[i]=valor;
            
            if(x[i]==1){
                test.add(new Question(q[i], 
                y[i][0], new String[]{y[i][0], y[i][1], y[i][2]}));
            } else if(x[i]==2){
                test.add(new Question(q[i], 
                y[i][0], new String[]{y[i][0], y[i][2], y[i][1]}));
            } else if(x[i]==3){
                test.add(new Question(q[i], 
                y[i][0], new String[]{y[i][1], y[i][0], y[i][2]}));
            } else if(x[i]==4){
                test.add(new Question(q[i], 
                y[i][0], new String[]{y[i][1], y[i][2], y[i][0]}));
            } else if(x[i]==5){
                test.add(new Question(q[i], 
                y[i][0], new String[]{y[i][2], y[i][0], y[i][1]}));
            } else if(x[i]==6){
                test.add(new Question(q[i], 
                y[i][0], new String[]{y[i][2], y[i][1], y[i][0]}));
            }
        }
        return test;
    }
    
    private static final ArrayList<User> Users = new ArrayList<>();
    public static ArrayList<User> getUser(){
        Users.add(new User ("Leonardo"));
        Users.add(new User ("Thiago"));
        Users.add(new User ("Vinicius"));
        return Users;
    }
    public static boolean usersdoArrayList(String user) {
        for(User u: Db.getUser()){
            if (u.getUser().equals(user) == true){
                return u.getUser().contains(user);
            }
        }           
        return false;
    }
}
