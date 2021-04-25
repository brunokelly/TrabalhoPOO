/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import static java.lang.Math.ceil;
import java.util.Scanner;

public class Lancha extends Barco {

    private boolean banheiro;
    
    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    /* CONSTRUTORES */
    
    public Lancha(){};
    
    public Lancha(double preco) {
        super(preco);
    }
    
    

    /* MEOTODS */
    public final void Cadastrar(boolean banheiro, String marca, String modelo, String cor, 
            String identificacao, int numeroPassageiros, int velocidadeMaxima, 
            double alturaCalado, double preco, String tipoCasco, int potenciaMotor) {
        setBanheiro(banheiro);
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setIdentificacao(identificacao);
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setAlturaCalado(alturaCalado);
        setPreco(preco);
        setTipoCasco(tipoCasco);
        setPotenciaMotor(potenciaMotor);
    }
    
    public final void Imprimir() {
        System.out.println("Banheiro: " + isBanheiro());
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
    
    public final void Entrada() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Possue banheiro? Sim ou Nao: ");
        String perg = sc.nextLine();
        if ( perg.equalsIgnoreCase("sim") ) {
            setBanheiro(true);
        } else {
            setBanheiro(false);
        }
        
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
        
        System.out.println("Qual a altura do calado? (inteiro)");
        setAlturaCalado(sc.nextDouble());
        
        System.out.println("Qual o preco? (real)");
        setPreco(sc.nextDouble());
        
        System.out.println("Qual tipo de casco? ");
        setTipoCasco(sc.nextLine());
        
        System.out.println("Qual a potencia do motor? (inteiro)");
        setPotenciaMotor(sc.nextInt());
    }
}
