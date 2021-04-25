/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

public class TrabalhoPOO1 {

    public static void main(String[] args) {
        Iate teste = new Iate(50,2);
        
        int numCabine;
        numCabine = teste.PessoasPorCabine(); 
        
        System.out.println(numCabine);
        
    }
    
}
