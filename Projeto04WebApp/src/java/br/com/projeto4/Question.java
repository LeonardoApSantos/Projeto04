/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto4;

/**
 *
 * @author Leona
 */
public class Question {
    //Declaração de variáveis.
    private String question, answer, alternatives[];
    
    //Método construtor.
    public Question(String question, String answer, String[] alternatives) {
        this.question = question;
        this.answer = answer;
        this.alternatives = alternatives;
    }
    //Métodos get e set.
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String[] getAlternatives() {
        return alternatives;
    }
    public void setAlternatives(String[] alternatives) {
        this.alternatives = alternatives;
    }
}
