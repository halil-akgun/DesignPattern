package BehavioralDP.ChainOfResponsibilityDP;

// yetki dagilimi icin abstract class
public abstract class Approver {

    Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    // onaylayabilecegi kredi limiti
    abstract boolean approveLoan(int amount);
}
