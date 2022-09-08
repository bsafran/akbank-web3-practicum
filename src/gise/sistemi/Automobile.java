package gise.sistemi;

public class Automobile implements ICar {

    private int balance;
    private int hgsNumber;
    private String name;
    private String surname;

    public Automobile(int balance, int hgsNumber, String name, String surname) {
        this.balance = balance;
        this.hgsNumber = hgsNumber;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int hgsNumber() {
        return hgsNumber;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public int balance() {
        return balance;
    }


    public void setBalance(int amount) {
        this.balance = amount;
    }

    public String ReturnType() {
        return "Automobile";
    }
}
