package BehavioralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{

    public Mudur(Approver chief) {
        super(chief);
    }


    @Override
    boolean approveLoan(int amount) {
        if (amount < 500000) {
            System.out.println("mudur onayladi");
            return true;
        } else if (chief != null) {
            System.out.println("miktar mudurun onaylama siniri disinda, sefe yonlendiriliyor");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
