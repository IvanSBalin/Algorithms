import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {
    IsPositiveNumber ipn;

    @BeforeEach
    void setUp() { ipn = new IsPositiveNumber();}
    @Order(1)
    @Test

    public void testIsPositiveNumberHappyPathPositive(){
// 555
        double figure = 555;
        boolean expectedResult = true;

        boolean actualResult = ipn.IsPositiveNumber(figure);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test

    public void testIsPositiveNumberHappyPathZero(){
// 0
        double figure = 0;
        boolean expectedResult = true;

        boolean actualResult = ipn.IsPositiveNumber(figure);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test

    public void testIsPositiveNumberHappyPathNegative(){
// -555
        int figure = -555;
        boolean expectedResult = false;

        boolean actualResult = ipn.IsPositiveNumber(figure);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
