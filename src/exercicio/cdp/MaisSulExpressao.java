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
public class MaisSulExpressao implements Expressao {
    private List<Expressao> expressoes;

    public MaisSulExpressao(List<Expressao> expressoes) {
        this.expressoes = expressoes;
    }

    @Override
    public Cidade interpret() {
        Cidade resultado = expressoes.get(0).interpret();
        /*
        *   Percorrendo cidade por cidade e pegando a maior de todas baseado na cidade atual.
        */
        for(Expressao atual: expressoes) {
            Cidade cidade = atual.interpret();
            if(cidade.getLatitude() < resultado.getLatitude())
                resultado = cidade;
            
        }
        return resultado;
    }    
}
