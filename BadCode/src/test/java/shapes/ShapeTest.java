package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class ShapeTest {

  /*
  * De method "Shape.getAreaOfShape" werkt naar behoren, alle testen slagen.
  * Alleen klopt er iets niet aan die method.
  */
  @Test
  void getAreaOfShapeForTriangle() {
    Triangle triangle = new Triangle(3, 4, 5);
    double expectedArea = 6.0;
    assertEquals(expectedArea, Shape.getAreaOfShape(triangle));
  }

  @Test
  void getAreaOfShapeForSquare() {
    Square square = new Square(5.0, 5.0);
    double expectedArea = 25.0;
    assertEquals(expectedArea, Shape.getAreaOfShape(square));
  }

  @Test
  void getAreaOfShapeForCircle() {
    Circle circle = new Circle(3);
    double expectedArea = Math.PI * 9;
    assertEquals(expectedArea, Shape.getAreaOfShape(circle));
  }

  @Test
  void getAreaOfShapeForNull() {
    assertEquals(0, Shape.getAreaOfShape(null));
  }
}