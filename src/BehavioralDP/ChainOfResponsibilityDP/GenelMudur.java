package BehavioralDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver {

    public GenelMudur() {
        super(null); // ustu yok
    }


    @Override
    boolean approveLoan(int amount) {
        System.out.println("genel mudur onayladi");
        return true;
    }
}
