package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

//        SingletonObject singletonObject1 = new SingletonObject();
//        SingletonObject singletonObject2 = new SingletonObject();
//        System.out.println(singletonObject1);
//        System.out.println(singletonObject2);
        // bu sekilde ayri ayri obje uretilir


        SingletonObject singletonObject3 = SingletonObject.getInstance();
        SingletonObject singletonObject4 = SingletonObject.getInstance();
        System.out.println(singletonObject3);
        System.out.println(singletonObject4);
        // bu sekilde tek bir obje uretilir
        // ama bizim istedigimiz bu classtan newleme yapilamasin

        // parametresiz PRIVATE constructor yaptigimizda artik new ile yeni obje uretilemez
        // cunku constructor PRIVATE ve buradan ulasilamaz

        singletonObject3.message = "GUL";
        System.out.println(singletonObject3.message); // GUL

        System.out.println(singletonObject4.message); // GUL
        // singletonObject4 de degisti, cunku ikisi ayni obje
        // spring framework bu mantikla calisir
    }
}
