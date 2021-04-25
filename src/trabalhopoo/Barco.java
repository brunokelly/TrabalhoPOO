/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

public abstract class Barco implements ControleBarco {
    
    private String marca;
    private String modelo;
    private String cor;
    private String identificacao;
    private int numeroPassageiros;
    private int velocidadeMaxima;
    private double alturaCalado;
    private double preco;

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getAlturaCalado() {
        return alturaCalado;
    }

    public void setAlturaCalado(double alturaCalado) {
        this.alturaCalado = alturaCalado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public abstract Barco Entrada();

    @Override
    public abstract double ValorDesconto();

    @Override
    public abstract String Imprimir();

    @Override
    public abstract void Cadastrar();

    public Barco() {
    }

    public Barco(String marca) {
        this.marca = marca;
    }

    public Barco(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Barco(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Barco(String marca, String modelo, String cor, String identificacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
    }

    public Barco(String marca, String modelo, String cor, String identificacao, int numeroPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
    }

    public Barco(String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Barco(String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, double alturaCalado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.alturaCalado = alturaCalado;
    }

    public Barco(String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, double alturaCalado, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.alturaCalado = alturaCalado;
        this.preco = preco;
    }

    public Barco(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    
    
    
}
