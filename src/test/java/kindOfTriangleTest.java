import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class kindOfTriangleTest {
    @Test
    public void first_test(){
        kindOfTriangle triangle = new kindOfTriangle(3,3,3);
        Assertions.assertEquals("Equilateral", triangle.equal() ,"This is testing equal function");
    }

    @Test
    public void second_test(){
        kindOfTriangle triangle = new kindOfTriangle(3,3,4);
        Assertions.assertEquals("Isosceles", triangle.isosceles() ,"This is testing isosceles function");
    }

    @Test
    public void third_test(){
        kindOfTriangle triangle = new kindOfTriangle(3,4,5);
        Assertions.assertEquals("Scalene", triangle.scalene() ,"This is testing Scalene function");
    }

    @Test
    public void forth_test(){
        kindOfTriangle triangle = new kindOfTriangle(1,2,10);
        Assertions.assertEquals("Invalid", triangle.invalid() ,"This is testing Invalid function");
    }


}
