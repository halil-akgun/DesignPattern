package BehavioralDP.ChainOfResponsibilityDP;

public class Memur extends Approver {


    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 100000) {
            System.out.println("memur onayladi");
            return true;
        } else if (chief != null) {
            System.out.println("miktar memurun onaylama siniri disinda, sefe yonlendiriliyor");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
