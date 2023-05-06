package CreationalDP.FactoryDP;

public class Runner {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.draw();
//
//        Square square = new Square();
//        square.draw();
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();


        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("kare");
        shape1.draw();

        shapeFactory.getShape("daire").draw();

    }
}
