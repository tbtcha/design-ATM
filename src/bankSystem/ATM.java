package bankSystem;

import Hardware.*;

public class ATM {
    private int atmId;
    private Address location;
    private DepositSlot depositSlot = new DepositSlot();
    private CardReader cardReader = new CardReader();
    private Printer printer = new Printer();
    private Screen screen = new Screen();
    private Keypad keypad = new Keypad();
    private CashDispenser cashDispenser = new CashDispenser();
    private Bank bank = new Bank();

    public ATM(int atmId, Address location, DepositSlot depositSlot, CardReader cardReader, Printer printer, Screen screen, Keypad keypad, CashDispenser cashDispenser, Bank bank) {
        this.atmId = atmId;
        this.location = location;
        this.depositSlot = depositSlot;
        this.cardReader = cardReader;
        this.printer = printer;
        this.screen = screen;
        this.keypad = keypad;
        this.cashDispenser = cashDispenser;
        this.bank = bank;
    }

    public ATM() {

    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public DepositSlot getDepositSlot() {
        return depositSlot;
    }

    public void setDepositSlot(DepositSlot depositSlot) {
        this.depositSlot = depositSlot;
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public void setCardReader(CardReader cardReader) {
        this.cardReader = cardReader;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keypad getKeypad() {
        return keypad;
    }

    public void setKeypad(Keypad keypad) {
        this.keypad = keypad;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }

    public void setCashDispenser(CashDispenser cashDispenser) {
        this.cashDispenser = cashDispenser;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean authenticateUser(){
        return true;
    }
}
