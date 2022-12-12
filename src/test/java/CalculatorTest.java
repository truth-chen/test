import org.example.Calculator;
import org.example.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void ini(){
        System.out.println("ini...");
    }

   @After
   public void close(){
       System.out.println("close...");
   }

    @Test
    public void testAdd(){
            Calculator c = new Calculator();
            int result = c.add(2, 3);
        System.out.println("testAdd....");
        Assert.assertEquals(4,result);
        }

    @Test
    public void testSub(){
        Calculator c = new Calculator();
        int result = c.sub(2,3);
        System.out.println("testSub...");
        Assert.assertEquals(-1,result);
    }
}
