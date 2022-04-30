import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test

    public void testBiggerValueHappyPathPositiveNumber() {
// Test Data:
//3333, 9999
//Expected Result = 9999
        int firstFigure = 3333;
        int secongFigure = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        Object actualResult = bv.biggerValue(3333,9999);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
