package io.quind.Calculator_Week1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiTest {
    @Test
    void mult() {
      Multi multi= new Multi();
        Assertions.assertEquals(24,multi.mult(6,4));
    }
}