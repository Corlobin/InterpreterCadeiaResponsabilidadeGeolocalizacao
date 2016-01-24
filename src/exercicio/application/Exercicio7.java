/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.application;

import exercicio.cdp.Cidade;
import exercicio.cdp.DirectionalEvaluator;

/**
 *
 * @author Ricardo
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DirectionalEvaluator evaluator = new DirectionalEvaluator();        
        Cidade cidade = evaluator.evaluate("Cariacica,Serra,Colatina,Pedro Canário,Oeste");
        System.out.println(" Entrada: Cariacica,Serra,Colatina,Pedro Canário,Oeste");
        System.out.println(" Cidade: " + cidade);
    }
    
}
