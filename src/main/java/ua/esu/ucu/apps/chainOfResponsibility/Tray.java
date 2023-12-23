package ua.esu.ucu.apps.chainOfResponsibility;

public class Tray {
    private Tray next;
    public int denomination;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public Tray  setNext(Tray next) {
        this.next = next;
        return next;
    }

    public void process(int amount) {
        System.out.println(amount / denomination + " x " + denomination);
        if (next != null) {
            next.process(amount % denomination);
        }
    }
}
