/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto4;

import java.util.Calendar;


/**
 *
 * @author Leona
 */
public class Test implements Comparable<Test>{
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
    
    @Override
    public int compareTo(Test t) {
     if (this.nota > t.nota) {
          return -1;
     }
     if (this.nota < t.nota) {
          return 1;
     }
     return 0;
    }
    
    public int comparadorNota(Test t) {
     if (this.nota > t.nota) {
          return -1;
     }
     if (this.nota < t.nota) {
          return 1;
     }
     return 0;
    }
}
