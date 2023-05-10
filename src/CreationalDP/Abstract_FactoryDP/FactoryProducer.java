package CreationalDP.Abstract_FactoryDP;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("sekil")) return new ShapeFactory();
        else if (choice.equalsIgnoreCase("renk")) return new ColorFactory();
        return null;
    }
}
