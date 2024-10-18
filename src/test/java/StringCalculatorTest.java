
import com.rest.app.StringCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringCalculatorTest {

    StringCalculator calculator;


    @BeforeEach
    void setUp(){
        calculator = new StringCalculator();
    }

    @Test
    public void testAdd_trivial(){
        assertEquals(0, calculator.add(""));
        assertEquals(1, calculator.add("1"));
        assertEquals(15, calculator.add("15"));
    }

    @Test
    public void testAddCommseparatedNumber(){
        assertEquals(15, calculator.add("10,5"));
        assertEquals(10, calculator.add("1,2,3,4"));
        assertEquals(1010, calculator.add("10,1000"));

    }


}
