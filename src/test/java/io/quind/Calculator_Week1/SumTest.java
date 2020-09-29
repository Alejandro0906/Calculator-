package io.quind.Calculator_Week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @BeforeEach
    void setUp() {
    }
    @Test
    // para el constructor
    void sum() {
        Sum sum = new Sum();
         //int resultado = 4 ;
        Assertions.assertEquals(4,sum.sum(2,2));
    }
}