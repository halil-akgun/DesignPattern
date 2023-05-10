package CreationalDP.Abstract_FactoryDP;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("kare")) return new Square();
        if (shapeType.equalsIgnoreCase("daire")) return new Circle();
        if (shapeType.equalsIgnoreCase("dikdortgen")) return new Rectangle();
        return null;
    }

}
