package io.quind.Calculator_Week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivTest {

    @Test
    void div() {
        Div div = new Div();
        Assertions.assertEquals(5,div.div(25,5));
    }
}