package shapes;

public interface Shape {
  double getArea();
  double getPerimeter();

  static double getAreaOfShape(Shape shape){
    if(shape instanceof Triangle){
      return ((Triangle) shape).getArea();
    }
    if(shape instanceof Square){
      return ((Square) shape).getArea();
    }
    if(shape instanceof Circle){
      return ((Circle) shape).getArea();
    }
    return 0;
  }
}
