import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator testing = new Calculator();
    private ArrayList<Integer> numeri = new ArrayList<>(List.of(10,0,10));
    private ArrayList<Integer> numeriNull = new ArrayList<>(List.of(10));

    @org.junit.jupiter.api.Test
    void  sum_null(){
        Integer result = testing.sum(numeriNull);
        assertNull(result);
    }

    @org.junit.jupiter.api.Test
    void  sub_null(){
        Integer result = testing.sub(numeriNull);
        assertNull(result);
    }
    @org.junit.jupiter.api.Test
    void  molt_null(){
        Integer result = testing.molt(numeriNull);
        assertNull(result);
    }
    @org.junit.jupiter.api.Test
    void div_null() {
        Double result = testing.div(numeriNull);
        assertNull(result);
    }
    @org.junit.jupiter.api.Test
    void div_for0() {
        Double result = testing.div(numeri);
        assertNull(result);
    }
}