import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class myClassTest {
    @Test
    void quotient() {
        myClass tester = new myClass();
        assertEquals("10/5 = 2", "2", tester.quotient(10,5));
    }
}
