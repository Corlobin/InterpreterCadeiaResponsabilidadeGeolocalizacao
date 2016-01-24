/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.cdp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Ricardo
 */
public class DirectionalEvaluator {
    private Map<String, Cidade> cidades;

    public DirectionalEvaluator() {
        cidades = new HashMap<String, Cidade>();
        cidades.put("Montanha", new Cidade("Montanha", -18.1255725, -40.3662673));
        cidades.put("Pedro Canário", new Cidade("Pedro Canário", -18.3008985, -39.9577395));
        cidades.put("Pinheiros", new Cidade("Pinheiros", -18.4130251, -40.2192379));
        cidades.put("São Mateus", new Cidade("São Mateus", -18.7191438,-39.8567437));
        cidades.put("Nova Venecia", new Cidade("Nova Venecia", -18.7074851,-40.3955859));
        cidades.put("São Gabriel da Palha", new Cidade("São Gabriel da Palha", -19.0186736,-40.5368682));
        cidades.put("Linhares", new Cidade("São Gabriel da Palha", -19.3951288,-40.0646549));
        cidades.put("Colatina", new Cidade("Colatina", -19.5146429,-40.6752853));
        cidades.put("Serra", new Cidade("Serra", -20.1215224,-40.3077898 ));
        cidades.put("Vitoria", new Cidade("Vitoria", -20.2976178, -40.2957768 ));
        cidades.put("Cariacica", new Cidade("Cariacica", -20.2643105, -40.4203022));
        cidades.put("Vila Velha", new Cidade("Vila Velha", -20.3477821, -40.2949528 ));
        cidades.put("Guarapari",new Cidade("Vila Velha", -20.6741197, -40.4997382 ));
        
    }
    public Cidade evaluate(String rota) {
        Stack<Expressao> stack = new Stack<Expressao>();
        for(String token: rota.split(",")) {
            
            if(cidades.containsKey(token)) {
                Cidade cidade = cidades.get(token);
                stack.push(new CidadeExpressao(cidade));
            }
            else if(token.toLowerCase().equals("norte")) {
                stack.push ( new MaisNorteExpressao( loadExpressoes(stack) ));
            }
            else if(token.toLowerCase().equals("sul")) {
                stack.push ( new MaisSulExpressao( loadExpressoes(stack) ));
            }
            else if(token.toLowerCase().equals("leste")) {
                stack.push ( new MaisLesteExpressao( loadExpressoes(stack) ));
            }
            else if(token.toLowerCase().equals("oeste")) {
                stack.push ( new MaisOesteExpressao( loadExpressoes(stack) ));
            }
            
        }
        return stack.pop().interpret();
    }
    
    private List<Expressao> loadExpressoes(Stack<Expressao> stack){ 
        List<Expressao> expressoes = new ArrayList<Expressao>();
        while ( !stack.empty()) {
            expressoes.add( stack.pop());
        }
        return expressoes;
    }
}
