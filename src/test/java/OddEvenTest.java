import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {
    OddEven oe;

    @BeforeEach
    void setUp() { oe = new OddEven();}
    @Order(1)

    @Test
    public void testOddEvenHappyPathNegativeNumber() {
        //-345 →  “Odd”
        int number = -345;
        String expectedResult ="Odd";

        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(2)

    @Test
    public void testOddEvenHappyPathZero() {
        //222222 →  “Even”
        int number = 0;
        String expectedResult ="Even";

        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(3)

    @Test
    public void testOddEvenHappyPathPositiveNumber() {
        //222222 →  “Even”
        int number = 222222;
        String expectedResult ="Even";

        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(4)

    @Test
    public void testOddEvenHappyPathPositiveSum() {
        //2147483647 + 1 →  “Undefined”
        int number = 2147483647 + 1;
        String expectedResult ="Undefined";

        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
