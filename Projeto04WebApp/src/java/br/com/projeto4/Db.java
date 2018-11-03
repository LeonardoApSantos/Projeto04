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
        
        int[] aux = new int[10];
        
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
        
        /*for(int i=0;i<10;i++){
            //formula que armazenará no vetor aux 10 valores de 1 a 6
        }*/
        
        aux[0]= 1;
        aux[1]= 6;
        aux[2]= 3;
        aux[3]= 5;
        aux[4]= 6;
        aux[5]= 4;
        aux[6]= 2;
        aux[7]= 1;
        aux[8]= 3;
        aux[9]= 2;
        
        if(aux[0]==1){
            test.add(new Question("No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?", 
                a1, new String[]{a1, a2, a3}));
        } else if(aux[0]==2){
            test.add(new Question("No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?", 
                a1, new String[]{a1, a3, a2}));
        } else if(aux[0]==3){
            test.add(new Question("No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?", 
                a1, new String[]{a2, a1, a3}));
        } else if(aux[0]==4){
            test.add(new Question("No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?", 
                a1, new String[]{a2, a3, a1}));
        } else if(aux[0]==5){
            test.add(new Question("No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?", 
                a1, new String[]{a3, a1, a2}));
        } else if(aux[0]==6){
            test.add(new Question("No início do jogo Assassin's Creed III, Haytham Kenway se infiltra em uma ópera a fim de roubar um certo objeto, que objeto era esse?", 
                a1, new String[]{a3, a2, a1}));
        }
        
        if(aux[1]==1){
            test.add(new Question("Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?", 
                b1, new String[]{b1, b2, b3}));
        } else if(aux[1]==2){
            test.add(new Question("Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?", 
                b1, new String[]{b1, b3, b2}));
        } else if(aux[1]==3){
            test.add(new Question("Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?", 
                b1, new String[]{b2, b1, b3}));
        } else if(aux[1]==4){
            test.add(new Question("Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?", 
                b1, new String[]{b2, b3, b1}));
        } else if(aux[1]==5){
            test.add(new Question("Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?", 
                b1, new String[]{b3, b1, b2}));
        } else if(aux[1]==6){
            test.add(new Question("Qual o nome do irmão de Dante, protagonista da série de games Devil May Cry?", 
                b1, new String[]{b3, b2, b1}));
        }
        
        if(aux[2]==1){
            test.add(new Question("Quem narra o jogo FIFA 14 no idioma Português do Brasil?", 
                c1, new String[]{c1, c2, c3}));
        } else if(aux[2]==2){
            test.add(new Question("Quem narra o jogo FIFA 14 no idioma Português do Brasil?", 
                c1, new String[]{c1, c3, c2}));
        } else if(aux[2]==3){
            test.add(new Question("Quem narra o jogo FIFA 14 no idioma Português do Brasil?", 
                c1, new String[]{c2, c1, c3}));
        } else if(aux[2]==4){
            test.add(new Question("Quem narra o jogo FIFA 14 no idioma Português do Brasil?", 
                c1, new String[]{c2, c3, c1}));
        } else if(aux[2]==5){
            test.add(new Question("Quem narra o jogo FIFA 14 no idioma Português do Brasil?", 
                c1, new String[]{c3, c1, c2}));
        } else if(aux[2]==6){
            test.add(new Question("Quem narra o jogo FIFA 14 no idioma Português do Brasil?", 
                c1, new String[]{c3, c2, c1}));
        }
        
        if(aux[3]==1){
            test.add(new Question("Quantos deuses Kratos aniquila no decorrer de God Of War III?", 
                d1, new String[]{d1, d2, d3}));
        } else if(aux[3]==2){
            test.add(new Question("Quantos deuses Kratos aniquila no decorrer de God Of War III?", 
                d1, new String[]{d1, d3, d2}));
        } else if(aux[3]==3){
            test.add(new Question("Quantos deuses Kratos aniquila no decorrer de God Of War III?", 
                d1, new String[]{d2, d1, d3}));
        } else if(aux[3]==4){
            test.add(new Question("Quantos deuses Kratos aniquila no decorrer de God Of War III?", 
                d1, new String[]{d2, d3, d1}));
        } else if(aux[3]==5){
            test.add(new Question("Quantos deuses Kratos aniquila no decorrer de God Of War III?", 
                d1, new String[]{d3, d1, d2}));
        } else if(aux[3]==6){
            test.add(new Question("Quantos deuses Kratos aniquila no decorrer de God Of War III?", 
                d1, new String[]{d3, d2, d1}));
        }
        
        if(aux[4]==1){
            test.add(new Question("No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?", 
                e1, new String[]{e1, e2, e3}));
        } else if(aux[4]==2){
            test.add(new Question("No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?", 
                e1, new String[]{e1, e3, e2}));
        } else if(aux[4]==3){
            test.add(new Question("No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?", 
                e1, new String[]{e2, e1, e3}));
        } else if(aux[4]==4){
            test.add(new Question("No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?", 
                e1, new String[]{e2, e3, e1}));
        } else if(aux[4]==5){
            test.add(new Question("No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?", 
                e1, new String[]{e3, e1, e2}));
        } else if(aux[4]==6){
            test.add(new Question("No final do jogo GTA V,como Trevor, Michael e Franklin matam Devin?", 
                e1, new String[]{e3, e2, e1}));
        }
        
        if(aux[5]==1){
            test.add(new Question("Qual o nome da cidade em que se passa o Left 4 Dead 2?", 
                f1, new String[]{f1, f2, f3}));
        } else if(aux[5]==2){
            test.add(new Question("Qual o nome da cidade em que se passa o Left 4 Dead 2?", 
                f1, new String[]{f1, f3, f2}));
        } else if(aux[5]==3){
            test.add(new Question("Qual o nome da cidade em que se passa o Left 4 Dead 2?", 
                f1, new String[]{f2, f1, f3}));
        } else if(aux[5]==4){
            test.add(new Question("Qual o nome da cidade em que se passa o Left 4 Dead 2?", 
                f1, new String[]{f2, f3, f1}));
        } else if(aux[5]==5){
            test.add(new Question("Qual o nome da cidade em que se passa o Left 4 Dead 2?", 
                f1, new String[]{f3, f1, f2}));
        } else if(aux[5]==6){
            test.add(new Question("Qual o nome da cidade em que se passa o Left 4 Dead 2?", 
                f1, new String[]{f3, f2, f1}));
        }
        
        if(aux[6]==1){
            test.add(new Question("Quem é Hanzo Hasashi no game Mortal Kombat?", 
                g1, new String[]{g1, g2, g3}));
        } else if(aux[6]==2){
            test.add(new Question("Quem é Hanzo Hasashi no game Mortal Kombat?", 
                g1, new String[]{g1, g3, g2}));
        } else if(aux[6]==3){
            test.add(new Question("Quem é Hanzo Hasashi no game Mortal Kombat?", 
                g1, new String[]{g2, g1, g3}));
        } else if(aux[6]==4){
            test.add(new Question("Quem é Hanzo Hasashi no game Mortal Kombat?", 
                g1, new String[]{g2, g3, g1}));
        } else if(aux[6]==5){
            test.add(new Question("Quem é Hanzo Hasashi no game Mortal Kombat?", 
                g1, new String[]{g3, g1, g2}));
        } else if(aux[6]==6){
            test.add(new Question("Quem é Hanzo Hasashi no game Mortal Kombat?", 
                g1, new String[]{g3, g2, g1}));
        }
        
        if(aux[7]==1){
            test.add(new Question("Em que ano foi lançado o jogo Need For Speed Underground?", 
                h1, new String[]{h1, h2, h3}));
        } else if(aux[7]==2){
            test.add(new Question("Em que ano foi lançado o jogo Need For Speed Underground?", 
                h1, new String[]{h1, h3, h2}));
        } else if(aux[7]==3){
            test.add(new Question("Em que ano foi lançado o jogo Need For Speed Underground?", 
                h1, new String[]{h2, h1, h3}));
        } else if(aux[7]==4){
            test.add(new Question("Em que ano foi lançado o jogo Need For Speed Underground?", 
                h1, new String[]{h2, h3, h1}));
        } else if(aux[7]==5){
            test.add(new Question("Em que ano foi lançado o jogo Need For Speed Underground?", 
                h1, new String[]{h3, h1, h2}));
        } else if(aux[7]==6){
            test.add(new Question("Em que ano foi lançado o jogo Need For Speed Underground?", 
                h1, new String[]{h3, h2, h1}));
        }
        
        if(aux[8]==1){
            test.add(new Question("Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?", 
                i1, new String[]{i1, i2, i3}));
        } else if(aux[8]==2){
            test.add(new Question("Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?", 
                i1, new String[]{i1, i3, i2}));
        } else if(aux[8]==3){
            test.add(new Question("Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?", 
                i1, new String[]{i2, i1, i3}));
        } else if(aux[8]==4){
            test.add(new Question("Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?", 
                i1, new String[]{i2, i3, i1}));
        } else if(aux[8]==5){
            test.add(new Question("Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?", 
                i1, new String[]{i3, i1, i2}));
        } else if(aux[8]==6){
            test.add(new Question("Por que, em Shadow of the Colossus, Wander precisa derrotar os colossos?", 
                i1, new String[]{i3, i2, i1}));
        }
        
        if(aux[9]==1){
            test.add(new Question("Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?", 
                j1, new String[]{j1, j2, j3}));
        } else if(aux[9]==2){
            test.add(new Question("Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?", 
                j1, new String[]{j1, j3, j2}));
        } else if(aux[9]==3){
            test.add(new Question("Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?", 
                j1, new String[]{j2, j1, j3}));
        } else if(aux[9]==4){
            test.add(new Question("Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?", 
                j1, new String[]{j2, j3, j1}));
        } else if(aux[9]==5){
            test.add(new Question("Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?", 
                j1, new String[]{j3, j1, j2}));
        } else if(aux[9]==6){
            test.add(new Question("Em Tomb Raider: Underworld, o que Lara Croft usa para enfrentar Natla?", 
                j1, new String[]{j3, j2, j1}));
        }
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
