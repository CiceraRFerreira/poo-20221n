package br.edu.fatecfranca.exe;

import javax.swing.JOptionPane;

public class Carro {
// declaração das variáveis
String modelo;
int ano;
float velocidade;
boolean motor;

// métodos construtores
Carro(){
        
    }
    Carro(String modelo, int ano, float velocidade, boolean motor){
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }

// métodos
void ligar (){   
    motor = true;
}   
    void desligar () {
    motor = false;   
    velocidade = 0;
}
void acelerar (float x) {
    velocidade += x;
}    
void frear (float x) {
    velocidade -= x;
}
void mostrar(){
        JOptionPane.showMessageDialog(null, "Modelo: " + this.modelo + " Ano: " + this.ano + 
                " Velocidade: " + this.velocidade + " Motor: " + this.motor);
    }
        }
