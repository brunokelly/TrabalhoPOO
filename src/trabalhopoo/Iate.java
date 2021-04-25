/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

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

    /* METODOS */
    @Override
    public double ValorDesconto() {
        double valorComDesconto = getPreco();
        double desconto;
        
        desconto = getPreco()*0.10;
        
        return valorComDesconto - desconto;
    }

    @Override
    public Barco Entrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int PessoasPorCabine()
    {
        int porCabine = getNumeroPassageiros() / getNumeroCabines();
        return porCabine;
    }
    
    /* CONSTRUTORES */
    public Iate(int NumeroPassageiros, int NumeroCabines)
    {
        super(NumeroPassageiros);
        setNumeroCabines(NumeroCabines);
    }
    
}
