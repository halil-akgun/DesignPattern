package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("kare")) return new Square();
        if (shapeType.equalsIgnoreCase("daire")) return new Circle();
        if (shapeType.equalsIgnoreCase("dikdortgen")) return new Rectangle();
        return null;
    }

}
