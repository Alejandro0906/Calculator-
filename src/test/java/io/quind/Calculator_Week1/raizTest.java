package io.quind.Calculator_Week1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class raizTest {
    @BeforeEach
    void setUp() {
    }
    @Test
    void raiz() {
        raiz raiz = new raiz();
        Assertions.assertEquals(2,raiz.raiz(4));
    }
}