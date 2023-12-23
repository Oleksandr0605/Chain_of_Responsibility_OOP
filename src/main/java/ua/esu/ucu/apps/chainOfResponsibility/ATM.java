package ua.esu.ucu.apps.chainOfResponsibility;

public class ATM {
    public Tray firstTray;

    public ATM() {
        firstTray = new Tray100(100);
        firstTray.setNext(new Tray50(0).setNext(new Tray2(0)));
    }

    public void process(int amount) {
        firstTray.process(amount);
    }   
}
