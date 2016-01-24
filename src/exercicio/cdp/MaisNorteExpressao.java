/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.cdp;

import java.util.List;

/**
 *
 * @author Ricardo
 */
public class MaisNorteExpressao implements Expressao {
    private List<Expressao> expressoes;

    public MaisNorteExpressao(List<Expressao> expressoes) {
        this.expressoes = expressoes;
    }

    @Override
    public Cidade interpret() {
        Cidade resultado = new Cidade("NULL", -999.9, -999.9);
        /*
        *   Percorrendo cidade por cidade e pegando a maior de todas baseado na cidade atual.
        */
        for(Expressao atual: expressoes) {
            Cidade cidade = atual.interpret();
            if(cidade.getLatitude() > resultado.getLatitude())
                resultado = cidade;
            
        }
        return resultado;
    }
    
    
    
    
    
}
