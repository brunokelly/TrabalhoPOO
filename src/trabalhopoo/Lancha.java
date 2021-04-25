/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

public class Lancha extends BarcoPequeno {

    private boolean banheiro;
    
    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }
    
    public Lancha(String marca){
        this.setMarca(marca);
   }

    /* MEOTODS */
    @Override
    public Barco Entrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ValorDesconto() {
        double valorComDesconto = getPreco();
        double desconto;
        
        desconto = getPreco()*0.12;
        
        return valorComDesconto - desconto;
    }

    @Override
    public String Imprimir() {
        return "Barco{"+ "banheiro=" + isBanheiro() + "marca=" + getMarca() + ", modelo=" + getModelo() + ", cor=" + getCor() + ", identificacao=" + getIdentificacao() + ", numeroPassageiros=" + getNumeroPassageiros() + ", velocidadeMaxima=" + getVelocidadeMaxima() + ", alturaCalado=" + getAlturaCalado() + ", preco=" + getPreco() + '}';
    }

    @Override
    public void Cadastrar() {
    } 
    
}
