import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TypeOfNumberTest {

    @Order(1)
    @Test

    public void testTypeOfNumberHappyPathThreeFive() {

        int a = 15;

        String expectedResult = "Nice number";

        TypeOfNumber ton = new TypeOfNumber();
        String actualResult = ton.typeOfNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test

    public void testTypeOfNumberHappyPathThree() {

        int a = 9;

        String expectedResult = "Invalid number";

        TypeOfNumber ton = new TypeOfNumber();
        String actualResult = ton.typeOfNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test

    public void testTypeOfNumberHappyPathFive() {

        int a = 10;

        String expectedResult = "Bad Number";

        TypeOfNumber ton = new TypeOfNumber();
        String actualResult = ton.typeOfNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test

    public void testTypeOfNumberHappyPathEleven() {

        int a = 11;

        String expectedResult = "-1";

        TypeOfNumber ton = new TypeOfNumber();
        String actualResult = ton.typeOfNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
