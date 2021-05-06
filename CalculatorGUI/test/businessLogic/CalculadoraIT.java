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
     @Test
    public void testAdd1() {
        System.out.println("add");
        float a = 2F;
        float b = 2F;
        float expResult = 4F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd2() {
        System.out.println("add");
        float a = 4F;
        float b = 4F;
        float expResult = 8F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd3() {
        System.out.println("add");
        float a = 1F;
        float b = 1F;
        float expResult = 2F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd4() {
        System.out.println("add");
        float a = 6F;
        float b = 6F;
        float expResult = 12F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd5() {
        System.out.println("add");
        float a = 10F;
        float b = 10F;
        float expResult = 20F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd6() {
        System.out.println("add");
        float a = 9F;
        float b = 9F;
        float expResult = 18F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd7() {
        System.out.println("add");
        float a = 3F;
        float b = 3F;
        float expResult = 6F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd8() {
        System.out.println("add");
        float a = 6F;
        float b = 6F;
        float expResult = 12F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd9() {
        System.out.println("add");
        float a = 30F;
        float b = 40F;
        float expResult = 70F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd10() {
        System.out.println("add");
        float a = 3F;
        float b = 4F;
        float expResult = 7;
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
     @Test
    public void testSubstract1() {
        System.out.println("substract");
        float a = 5F;
        float b = 2F;
        float expResult = 3F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract2() {
        System.out.println("substract");
        float a = 1F;
        float b = 1F;
        float expResult = 0F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract3() {
        System.out.println("substract");
        float a = 5F;
        float b = 1F;
        float expResult = 4F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract4() {
        System.out.println("substract");
        float a = 6F;
        float b = 5F;
        float expResult = 1F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract5() {
        System.out.println("substract");
        float a = 20F;
        float b = 10F;
        float expResult = 10F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract6() {
        System.out.println("substract");
        float a = 6F;
        float b = 3F;
        float expResult = 3F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract7() {
        System.out.println("substract");
        float a = 8F;
        float b = 1F;
        float expResult = 7F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract8() {
        System.out.println("substract");
        float a = 8F;
        float b = 5F;
        float expResult = 3F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSubstract9() {
        System.out.println("substract");
        float a = 40F;
        float b = 10F;
        float expResult = 30F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstract10() {
        System.out.println("substract");
        float a = 50F;
        float b = 45F;
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
        float a = 2F;
        float b = 2F;
        float expResult = 4F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
     public void testMultiply1() {
        System.out.println("multiply");
        float a = 1F;
        float b = 2F;
        float expResult = 2F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
      public void testMultiply2() {
        System.out.println("multiply");
        float a = 10F;
        float b = 2F;
        float expResult = 20F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
       public void testMultiply3() {
        System.out.println("multiply");
        float a = 5F;
        float b = 6F;
        float expResult = 30F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
       @Test
        public void testMultiply4() {
        System.out.println("multiply");
        float a = 7F;
        float b = 5F;
        float expResult = 35F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
        @Test
         public void testMultiply5() {
        System.out.println("multiply");
        float a = 5F;
        float b = 8F;
        float expResult = 40F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    } 
     @Test
     public void testMultiply6() {
        System.out.println("multiply");
        float a = 9F;
        float b = 9F;
        float expResult = 81F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
      public void testMultiply7() {
        System.out.println("multiply");
        float a = 1F;
        float b = 1F;
        float expResult = 1F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
       public void testMultiply8() {
        System.out.println("multiply");
        float a = 6F;
        float b = 6F;
        float expResult = 36F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
       @Test
        public void testMultiply9() {
        System.out.println("multiply");
        float a = 4F;
        float b = 2F;
        float expResult = 8F;
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
