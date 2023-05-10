package BehavioralDP.ChainOfResponsibilityDP;

public class ChainOfResponsibilityRunner {

    static void chainOfResponsibilityDemo() {
        Approver gMudur = new GenelMudur();
        Approver mudur = new Mudur(gMudur);
        Approver memur = new Memur(mudur);

        System.out.println("kredi verme limitleri: ");
        System.out.println("memur icin max: 100 000");
        System.out.println("mudur icin max: 500 000");
        System.out.println("genel mudur icin limit yok");

        // islemler hep memur uzerinden yapilacak
        System.out.println("**************************");
        memur.approveLoan(50000);
        System.out.println("**************************");
        memur.approveLoan(450000);
        System.out.println("**************************");
        memur.approveLoan(1050000);
        System.out.println("**************************");
    }

    public static void main(String[] args) {
        chainOfResponsibilityDemo();
    }
}
