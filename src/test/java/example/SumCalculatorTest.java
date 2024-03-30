package example;

import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    public  void  testCreateObjectSumCalculator(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public  void testIfUseNumber3() {

        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testIfUseNumber1() {

        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testIfUseNumber0ThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class,()-> sumCalculator.sum(0));
    }
}