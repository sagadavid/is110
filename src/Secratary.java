//MODUL-3
public class Secratary {
    private BrannMan brannNo;

    public Secratary() {
        brannNo = new BrannMan();
    }

    public void urgentCall() {
        brannNo.ringBrannMan();
    }

    public void ringLastCall() {
        urgentCall();
    }
}
