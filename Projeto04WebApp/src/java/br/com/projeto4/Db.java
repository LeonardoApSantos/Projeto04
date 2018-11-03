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
        
        String a1 = "Um medalhão Maia";
        String a2 = "A maçã do Éden";
        String a3 = "Uma chave de ouro";
        
        String b1 = "Vergil";
        String b2 = "Kratos";
        String b3 = "Phillipe";
        
        String c1 = "Tiago Leifert";
        String c2 = "Kratos";
        String c3 = "Phillipe";
        
        String d1 = "Mais de cinco";
        String d2 = "Um";
        String d3 = "Quatro";
        
        String e1 = "Jogando de uma montanha";
        String e2 = "Com um tiro na cabeça";
        String e3 = "Envenenamento";
        
        String f1 = "New Jersey";
        String f2 = "New Orleands";
        String f3 = "San Francisco";
        
        String g1 = "Scorpion";
        String g2 = "Sub Zero";
        String g3 = "Smoke";
        
        String h1 = "2003";
        String h2 = "1999";
        String h3 = "2000";
        
        String i1 = "Para ressuscitar sua amada";
        String i2 = "Para acabar com o mundo";
        String i3 = "Para se tornar um deus";
        
        String j1 = "O martelo de Thor";
        String j2 = "Uma bota";
        String j3 = "Blade of Chaos";
                
        test.add(new Question("No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?", 
                a1, new String[]{a1, a2, a3}));
        test.add(new Question ("Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?", 
                b1, new String[]{b1, b2, b3}));
        test.add(new Question ("Quem narra o jogo FIFA 14 no idioma Português do Brasil?", 
                c1, new String[]{c1, c2, c3}));
        test.add(new Question ("Quantos deuses Kratos aniquila no decorrer de God Of War III?", 
                d1, new String[]{d1, d2, d3}));
        test.add(new Question ("No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?", 
                e1, new String[]{e1, e2, e3}));
        test.add(new Question ("Qual o nome da cidade em que se passa o Left 4 Dead 2?", 
                f1, new String[]{f1, f2, f3}));
        test.add(new Question ("Quem é Hanzo Hasashi no game Mortal Kombat?", 
                g1, new String[]{g1, g2, g3}));
        test.add(new Question ("Em que ano foi lançado o jogo Need For Speed Underground?", 
                h1, new String[]{h1, h2, h3}));
        test.add(new Question ("Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?", 
                i1, new String[]{i1, i2, i3}));
        test.add(new Question ("Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?", 
                j1, new String[]{j1, j2, j3}));
        return test;
    }
    
    private static final ArrayList<User> Users = new ArrayList<>();
    public static ArrayList<User> getUser(){
        Users.add(new User ("Leonardo"));
        Users.add(new User ("Thiago"));
        Users.add(new User ("Vinícius"));
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
