/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularidade.model;

/**
 *
 * @author beatriz.miranda
 */
public class Pessoa {
    private String nome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private int idade;
    private Universidade universidade; // relacionando a classe Universidade com a classe Pessoa
    private double altura;
    private double peso;
    
    
    public double calcularIMC(){
        double imc = this.peso/(this.altura*this.altura);
        return imc;
    }
    
    public void retornaNomeUniversidade(){
        System.out.println("O " + this.nome + " trabalha na " +universidade.getNome());
    }
    public void setUniversidade(Universidade universidade)
    {
        this.universidade = universidade;
    }
    
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual){
        int idadeCalculo = anoAtual - anoNasc;
        
        if(mesAtual<mesNasc || (mesAtual==mesNasc && diaAtual<diaNasc))
        {
            idadeCalculo --;
        }
        idade=idadeCalculo;   
    }
 
    public int informaIdade(){
        return idade;
    }
    
    public String informaNome()
    {
        return nome;
    }
    
    public void ajustaData(int dia, int mes, int ano){
        diaNasc = dia;
        mesNasc = mes;
        anoNasc = ano;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
     public double getAltura() {
        return altura;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }
    
}
