package se.newton.martin.testning;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    @DisplayName("Custom displayname 😱")
    void testTriangleConstructorCreatesTriangle() {
        Triangle triangle = new Triangle(1.0, 2.0, 3.0);

        assertNotNull(triangle);
        assertAll("sides", () -> assertEquals(1.0, triangle.sides[0]),
                () -> assertEquals(2.0, triangle.sides[1]),
                () -> assertEquals(3.0, triangle.sides[2]));
    }

    @Test
    void testTriangleIsScaleneReturnsTrue() {
        Triangle triangle = new Triangle(1.0, 1.0, 1.0);

        boolean answer = triangle.isScalene();

        assertTrue(answer);
    }

    @Test
    void testTriangleIsScaleneReturnsFalse() {
        //Arrange
        Triangle triangle = new Triangle(1.0, 2.0, 1.0);
        //Act
        boolean answer = triangle.isScalene();
        //Assert
        assertFalse(answer);
    }


}