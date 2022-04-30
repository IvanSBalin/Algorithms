import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    OddIndices oi;

    @BeforeEach
    void setUp() {
        oi = new OddIndices();
    }
    @Order(1)
    //@RepeatedTest(10)
    @Test
    public void testOddIndicesHappyPathFirstArray() {
    // Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = oi.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
