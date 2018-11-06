/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Leona
 */
public class Db {
    public static ArrayList<Question> getTest(){
        ArrayList<Question> test = new ArrayList<>();
        
        int x;
        String[] q = new String[10];
        String[][] y = new String[10][3];
        String a1 = "";
        String a2 = "";
        String a3 = "";
        
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
            x=valor;
            
            a1 = y[i][0];
            a2 = y[i][1];
            a3 = y[i][2];
            
            switch (x) {
                case 1:
                    test.add(new Question(q[i],
                            a1, new String[]{a1, a2, a3}));
                    break;
                case 2:
                    test.add(new Question(q[i],
                            a1, new String[]{a1, a3, a2}));
                    break;
                case 3:
                    test.add(new Question(q[i],
                            a1, new String[]{a2, a1, a3}));
                    break;
                case 4:
                    test.add(new Question(q[i],
                            a1, new String[]{a2, a3, a1}));
                    break;
                case 5:
                    test.add(new Question(q[i],
                            a1, new String[]{a3, a1, a2}));
                    break;
                case 6:
                    test.add(new Question(q[i],
                            a1, new String[]{a3, a2, a1}));
                    break;
                default:
                    break;
            }
        }
        Collections.shuffle(test);
        return test;
    }
    
    private static ArrayList<Test> Testes = new ArrayList<>();
    
    public static ArrayList<Test> getTestes(){
        if(Testes.isEmpty()){
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        Calendar d3 = Calendar.getInstance();
        Calendar d4 = Calendar.getInstance();
        Calendar d5 = Calendar.getInstance();
        Calendar d6 = Calendar.getInstance();
        Calendar d7 = Calendar.getInstance();
        Calendar d8 = Calendar.getInstance();
        Calendar d9 = Calendar.getInstance();
        Calendar d10 = Calendar.getInstance();
        
        d1.add(Calendar.DAY_OF_MONTH, 0);
        Testes.add(new Test("Vinicius", 75, d1));
        d2.add(Calendar.DAY_OF_MONTH, -1);
        Testes.add(new Test("Thiago", 65, d2));
        d3.add(Calendar.DAY_OF_MONTH, -1);
        Testes.add(new Test("Thiago", 60, d3));
        d4.add(Calendar.DAY_OF_MONTH, -2);
        Testes.add(new Test("Leonardo", 85, d4));
        d5.add(Calendar.DAY_OF_MONTH, -3);
        Testes.add(new Test("Vinicius", 90, d5));
        d6.add(Calendar.DAY_OF_MONTH, -3);
        Testes.add(new Test("Leonardo", 55, d6));
        d7.add(Calendar.DAY_OF_MONTH, -4);
        Testes.add(new Test("Vinicius", 45, d7));
        d8.add(Calendar.DAY_OF_MONTH, -4);
        Testes.add(new Test("Leonardo", 60, d8));
        d9.add(Calendar.DAY_OF_MONTH, -5);
        Testes.add(new Test("Thiago", 95, d9));
        d10.add(Calendar.DAY_OF_MONTH, -6);
        Testes.add(new Test("Vinicius", 55, d10));
        }
        return Testes;
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
