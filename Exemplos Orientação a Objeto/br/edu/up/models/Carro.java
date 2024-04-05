package br.edu.up.models;

public class Carro {


    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int velocidade = 0;

    public Carro(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

//Getter (pegar)
    public String getMarca(){
        return marca;
    };

    public String getModelo(){
        return this.modelo;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

//Setter (atribuir)
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }



    public void acelerar() {
        if (this.velocidade < this.velocidadeMaxima) {
            this.velocidade++;
        }
    }

    public void frear(){
        if(velocidade > 0){
            velocidade--;
        }
    }
}
