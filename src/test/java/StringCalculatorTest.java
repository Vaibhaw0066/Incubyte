
import com.rest.app.StringCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new StringCalculator();
    }

    @Test
    @DisplayName("Base Cases - Step 1 ")
    public void testAdd_trivial(){
        assertEquals(0, calculator.add(""));
        assertEquals(1, calculator.add("1"));
        assertEquals(15, calculator.add("15"));
    }

    @Test
    @DisplayName("Comma separated case - Step 1")
    public void testAddCommaSeparatedNumbers(){
        assertEquals(6, calculator.add("1,5"));
        assertEquals(10, calculator.add("1,2,3,4"));
        assertEquals(1010, calculator.add("10,1000"));
    }

    @Test
    @DisplayName("Any length numbers - Step 2")
    public void testAddCommaSeparatedNumbers_HugeInput() throws IOException {
        String filePath = "src/test/resources/numbers_10000.txt";
        String numbers_10000 = Files.readString(Paths.get(filePath));
        assertEquals(898767, calculator.add(numbers_10000));
    }
    @Test
    @DisplayName("new line and comma separated delimiter test case - Step 3")
    public void testAddCommaSeparatedNumbers_newLineDelimeter(){
        assertEquals(6, calculator.add("1,5"));
        assertEquals(10, calculator.add("1\n2,3\n4"));
        assertEquals(1010, calculator.add("10\n1000"));
    }




}
