import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test

    public void testSumArrayHappyPathPositiveNumber() {
// {0, 1, 2, 3, 4, 5} → 15
        int[] arrey = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arrey);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test

    public void testSumArrayHappyPathNegativeNumber() {
// {-7, -3} → -10
        int[] arrey = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arrey);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
