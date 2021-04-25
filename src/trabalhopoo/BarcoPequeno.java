/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

public abstract class BarcoPequeno implements ControleBarco {
    
    private String marca;
    private String modelo;
    private String cor;
    private String identificacao;
    private int numeroPassageiros;
    private int velocidadeMaxima;
    private double alturaCalado;
    private double preco;
    private String tipoCasco;
    private int potenciaMotor; 

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

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public BarcoPequeno() {
    }

    public BarcoPequeno(double preco) {
        this.preco = preco;
    }

    public BarcoPequeno(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public BarcoPequeno(String modelo, String identificacao, int velocidadeMaxima) {
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public BarcoPequeno(String modelo, String identificacao, int velocidadeMaxima, String tipoCasco) {
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.velocidadeMaxima = velocidadeMaxima;
        this.tipoCasco = tipoCasco;
    }

    public BarcoPequeno(String modelo, String identificacao, int velocidadeMaxima, String tipoCasco, int potenciaMotor) {
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.velocidadeMaxima = velocidadeMaxima;
        this.tipoCasco = tipoCasco;
        this.potenciaMotor = potenciaMotor;
    }

    public BarcoPequeno(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public BarcoPequeno(double preco, String tipoCasco) {
        this.preco = preco;
        this.tipoCasco = tipoCasco;
    }

    public BarcoPequeno(int velocidadeMaxima, int potenciaMotor) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.potenciaMotor = potenciaMotor;
    }

    public BarcoPequeno(String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, double alturaCalado, double preco, String tipoCasco, int potenciaMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.alturaCalado = alturaCalado;
        this.preco = preco;
        this.tipoCasco = tipoCasco;
        this.potenciaMotor = potenciaMotor;
    }
    
    
    
    

    @Override
    public void Cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Imprimir() {
        return "marca = " + marca + ", modelo = " + modelo + ", cor = " + cor + ", identificacao = " + identificacao + ", numeroPassageiros = " + numeroPassageiros + ", velocidadeMaxima = " + velocidadeMaxima + ", alturaCalado = " + alturaCalado + ", preco = " + preco + ", tipoCasco = " + tipoCasco + ", potenciaMotor = " + potenciaMotor + '\n';
    }
    
    @Override
    public abstract double ValorDesconto();

    @Override
    public Barco Entrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
