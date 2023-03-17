package refactoring.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import refactoring.Cacurator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CaculatorTest {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';

    @Test
    @DisplayName("Testing addition( thử bổ sung")
    static void testCaculatorAdd() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = ADDITION;
        int expected = 2;

        int result = Cacurator.caculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtraction")
    static void testCaculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = SUBTRACTION;
        int expected = 1;
        int result = Cacurator.caculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing multiplication")
    void testCaculateMul(){
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = MULTIPLICATION;
        int expected = 4;
        int result = Cacurator.caculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing division")
    void testCaculateDiv(){
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '/';
        int expected = 2;

        int result = Cacurator.caculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing wrong operator")
    void testCaculateWrongOperator(){
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '=';
    //asertThrows sủ dụng để kiểm thử xem đoạn mã có gây ra ngoại
    // lệ như mong đợi hay không
        assertThrows(RuntimeException.class,
                ()->{Cacurator.caculate(firstOperand,secondOperand,operator);});
    }
}
