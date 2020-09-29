package io.quind.Calculator_Week1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResTest {
    @BeforeEach
    void setUp() {
    }
    @Test
        // para el constructor
    void rest() {
        Res res= new Res();
        Assertions.assertEquals(2,res.res(6,4));
    }
}