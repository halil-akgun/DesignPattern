package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("sekil");

        Shape shape1 = shapeFactory.getShape("daire");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("kare");
        shape2.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("renk");

        Color color1 = colorFactory.getColor("mavi");
        color1.fill();

        Color color2 = colorFactory.getColor("yesil");
        color2.fill();
    }
}
