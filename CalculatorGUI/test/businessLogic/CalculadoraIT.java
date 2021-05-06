package businessLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraIT {
    
    public CalculadoraIT() {
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

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float a = 3F;
        float b = 5F;
        float expResult = 8F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float a = 10F;
        float b = 5F;
        float expResult = 5F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float a = 7F;
        float b = 2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        float a = 20F;
        float b = 5F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testMod() {
        System.out.println("mod");
        float a = 12F;
        float b = 5F;
        float expResult = 2F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testFact(){
        System.out.println("Factorial");
        float a = 3F;
        float expResult = 6F;
        assertEquals(expResult,Calculadora.factor(a), 0.0);
    }
    
    @Test
    public void testSign(){
        System.out.println("Signo");
        float a = 3F;
        float expResult = -3F;
        assertEquals(expResult,Calculadora.signo(a), 0.0);
    }
    
    @Test
    public void testLog(){
        System.out.println("Log");
        float a = 1F;
        float expResult = 0F;
        assertEquals(expResult,Calculadora.log(a), 0.0);
    }
    
    @Test
    public void test10x(){
        System.out.println("10x");
        float a = 3F;
        float expResult = 1000F;
    }
}
