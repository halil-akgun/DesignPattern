package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "hello";

    private static final SingletonObject instance = new SingletonObject();

    public static SingletonObject getInstance() {
        return instance;
    }

    private SingletonObject() {
    }
}
