/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercicio.cdp.Cidade;
import exercicio.cdp.DirectionalEvaluator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testaMaisoOeste() {
        DirectionalEvaluator evaluator = new DirectionalEvaluator();        
        Cidade cidade = evaluator.evaluate("Cariacica,Serra,Colatina,Pedro Canário,Oeste");
        Assert.assertEquals(cidade.getNome(), "Cariacica");
    }
    @Test
    public void testaMaisoNorte() {
        DirectionalEvaluator evaluator = new DirectionalEvaluator();        
        Cidade cidade = evaluator.evaluate("Cariacica,Serra,Colatina,Pedro Canário,Norte");
        Assert.assertEquals(cidade.getNome(), "Pedro Canário");
    }
    @Test
    public void testaMaisoSul() {
        DirectionalEvaluator evaluator = new DirectionalEvaluator();        
        Cidade cidade = evaluator.evaluate("Cariacica,Serra,Colatina,Pedro Canário,Sul");
        Assert.assertEquals(cidade.getNome(), "Cariacica");
    }
    @Test
    public void testaMaisoLeste() {
        DirectionalEvaluator evaluator = new DirectionalEvaluator();        
        Cidade cidade = evaluator.evaluate("Cariacica,Serra,Colatina,Pedro Canário,Leste");
        Assert.assertEquals(cidade.getNome(), "Pedro Canário");
    }
}
