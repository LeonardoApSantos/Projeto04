/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Leona
 */
public class Test{
    private String nomeUsuario;
    private double nota;
    private Calendar data;

    public Test(String nomeUsuario, double nota, Calendar data) {
        this.nomeUsuario = nomeUsuario;
        this.nota = nota;
        this.data = data;
    }
    

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    public static ArrayList<Test> compareNota(ArrayList<Test> Tests){
        Collections.sort(Tests, new Comparator<Test>(){
            @Override
            public int compare(Test t1, Test t2) {
                if (t1.getNota() > t2.getNota()) {
                    return -1;
                }
                else if (t1.getNota() < t2.getNota()) {
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });
        return Tests;
    }
    
    public static ArrayList<Test> compareData(ArrayList<Test> Tests){
        Collections.sort(Tests, new Comparator<Test>(){
            @Override
            public int compare(Test t1, Test t2) {
                if (t1.getData().after(t2.getData())) {
                    return -1;
                }
                else if (t1.getData().before(t2.getData())) {
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });
        return Tests;
    }
}