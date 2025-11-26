import org.junit.jupiter.api.Test ;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    @Test
    void add_twoPositiveNumbers_shouldReturnSum() {

        Calculator calc = new Calculator();
        int result = calc.add(2, 3);

        assertEquals(5,result, "2 + 3 should equal 5");

    }
    @Test
    void Subtraction_Test() {
        Calculator calc = new Calculator();
        int result = calc.sub(2, 3);

        assertEquals(-1,result, "2 - 3 should equal -1");
    }
    @Test
    void Multiplication_Test() {
        Calculator calc = new Calculator();
        int result = calc.mul(2, 3);
        assertEquals(6,result, "2 * 3 should equal 6");
    }
    @Test
    void Division_Test() {
        Calculator calc = new Calculator();
        int result = calc.div(2, 3);
        assertEquals(0,result, "division by 2 should equal 1");
    }

}