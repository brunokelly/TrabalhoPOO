/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import static java.lang.Math.ceil;
import java.util.Scanner;

public class Iate extends Barco{
    
    private int numeroTripulantes;
    private int numeroCabines;
    private boolean piscina;
    private double peso;
    
    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }
    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }
    
    public int getNumeroCabines() {
        return numeroCabines;
    }
    public final void setNumeroCabines(int numeroCabines) {
        this.numeroCabines = numeroCabines;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    /* CONSTRUTORES */

    public Iate() {
    }

    public Iate(boolean piscina, String marca, String modelo) {
        super(marca, modelo);
        this.piscina = piscina;
    }

    public Iate(double peso, String marca) {
        super(marca);
        this.peso = peso;
    }

    public Iate(int numeroTripulantes, String marca, String modelo, String cor, String identificacao) {
        super(marca, modelo, cor, identificacao);
        this.numeroTripulantes = numeroTripulantes;
    }

    public Iate(int numeroTripulantes, int numeroCabines, boolean piscina, 
            double peso, String marca, String modelo, String cor, String identificacao, 
            int numeroPassageiros, int velocidadeMaxima) 
    {
        super(marca, modelo, cor, identificacao, numeroPassageiros, velocidadeMaxima);
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;
        this.piscina = piscina;
        this.peso = peso;
    }    
    
    public Iate(int NumeroPassageiros, int NumeroCabines)
    {
        super(NumeroPassageiros);
        setNumeroCabines(NumeroCabines);
    }

    public Iate(boolean piscina, double peso, double preco) {
        super(preco);
        this.piscina = piscina;
        this.peso = peso;
    }

    public Iate(int numeroTripulantes, int numeroCabines, boolean piscina, double peso) {
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;
        this.piscina = piscina;
        this.peso = peso;
    }

    public Iate(int numeroTripulantes, int numeroCabines, int numeroPassageiros) {
        super(numeroPassageiros);
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;
    }

    public Iate(boolean piscina) {
        this.piscina = piscina;
    }
    
    
    
    /* METODOS */
    
    public final void Cadastrar(int numeroTripulantes, int numeroCabines, boolean piscina,
            double peso, String marca, String modelo, String cor, 
            String identificacao, int numeroPassageiros, int velocidadeMaxima, 
            double alturaCalado, double preco, String tipoCasco, int potenciaMotor) 
    {
        setNumeroPassageiros(numeroTripulantes);
        setNumeroCabines(numeroCabines);
        setPiscina(piscina);
        setPeso(peso);
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setIdentificacao(identificacao);
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setAlturaCalado(alturaCalado);
        setPreco(preco);
    }
    
    public final void Imprimir() 
    {
        System.out.println("Peso: " + getPeso());
        System.out.println("Piscina: " + isPiscina());
        System.out.println("Numero de Cabines: " + getNumeroCabines());
        System.out.println("Numero de Tripulantes: " + getNumeroTripulantes());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Identificacao: " + getIdentificacao());
        System.out.println("Numero de Passageiros: " + getNumeroPassageiros());
        System.out.println("Velocidade Maxima: " + getVelocidadeMaxima());
        System.out.println("Altura do Calado: " + getAlturaCalado());
        System.out.println("Preco: " + getPreco());
        System.out.println("Tipo de Casco: " + getTipoCasco());
        System.out.println("Potencia do Motor: " + getPotenciaMotor());
    }
    
    public final void ValorDesconto() {
        double valorComDesconto = getPreco();
        double desconto;
        
        desconto = getPreco()*0.12;
        
        System.out.println(ceil(valorComDesconto - desconto));
    }

     public final void Entrada() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numero de passageiros: (inteiro) ");
        setNumeroPassageiros(sc.nextInt());
        
        System.out.println("Numero de cabines: (inteiro) ");
        setNumeroCabines(sc.nextInt());
        
        System.out.println("Possue piscina? Sim ou Nao: ");
        String perg = sc.nextLine();
        if ( perg.equalsIgnoreCase("sim") ) {
            setPiscina(true);
        } else {
            setPiscina(false);
        }
        
        System.out.println("Qual o peso? (real) ");
        setPeso(sc.nextDouble());
        
        System.out.println("Qual a marca? ");
        setMarca(sc.nextLine());
        
        System.out.println("Qual o modelo? ");
        setModelo(sc.nextLine());
        
        System.out.println("Qual a cor? ");
        setCor(sc.nextLine());
        
        System.out.println("Qual a identificação? ");
        setIdentificacao(sc.nextLine());
        
        System.out.println("Numero de passageiros: (inteiro)");
        setNumeroPassageiros(sc.nextInt());
        
        System.out.println("Qual a velocidade maxima? (inteiro)");
        setVelocidadeMaxima(sc.nextInt());
        
        System.out.println("Qual a altura do calado? (real)");
        setAlturaCalado(sc.nextDouble());
        
        System.out.println("Qual o preco? (real)");
        setPreco(sc.nextDouble());
    }
    
    public final int PessoasPorCabine()
    {
        int porCabine = getNumeroPassageiros() / getNumeroCabines();
        return porCabine;
    }
}
