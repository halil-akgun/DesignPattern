package CreationalDP.Abstract_FactoryDP;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) return null;
        if (color.equalsIgnoreCase("mavi")) return new Blue();
        if (color.equalsIgnoreCase("kirmizi")) return new Red();
        if (color.equalsIgnoreCase("yesil")) return new Green();
        return null;
    }

    @Override
    Shape getShape(String color) {
        return null;
    }
}
