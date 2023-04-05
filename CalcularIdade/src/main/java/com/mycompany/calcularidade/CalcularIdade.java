/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularidade;

import com.mycompany.calcularidade.model.Pessoa;
import com.mycompany.calcularidade.model.Universidade;

/**
 *
 * @author beatriz.miranda
 */
public class CalcularIdade {

    public static void main(String[] args) {
        Universidade senac = new Universidade();
        senac.setNome("Senac");
        
        Universidade senai = new Universidade();
        senai.setNome("Senai");
        
        Pessoa einstein = new Pessoa();
        einstein.setNome("Albert Einstein");
        einstein.ajustaData(14, 3, 1879);
        einstein.calculaIdade(4, 4, 2023);
        einstein.setUniversidade(senai);
        einstein.setAltura(1.87);
        einstein.setPeso(87);
       
        Pessoa newton = new Pessoa();
        newton.setNome("Isaac Newton");
        newton.ajustaData(4, 1, 1643);
        newton.calculaIdade(4, 4, 2023);
        newton.setUniversidade(senac);
        newton.setAltura(1.72);
        newton.setPeso(88);
        
        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() +" anos de idade");
        einstein.retornaNomeUniversidade();
        System.out.println("IMC: " +einstein.calcularIMC());
        
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade()+" anos de idade");
        newton.retornaNomeUniversidade();
        System.out.println("IMC: " +newton.calcularIMC());
    }
}
