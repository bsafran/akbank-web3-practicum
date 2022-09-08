package gise.sistemi;

import java.util.ArrayList;

public class TicketOffice implements IOffice {

    //ICar[] carArray = new ICar[100];
    ArrayList <ICar> carArray = new ArrayList<>();
    ArrayList <Integer> totalIncomes = new ArrayList<Integer>();


    public void Payment(ICar car){
        int balance = car.balance();
        if(car instanceof Automobile){
            balance -= 100;
            //mn.increaseIncome(100);
            totalIncomes.add(100);
            ((Automobile) car).setBalance(balance);

        }

        else if(car instanceof Minibus){
            balance -= 150;
            //mn.increaseIncome(150);
            totalIncomes.add(150);
            ((Minibus) car).setBalance(balance);
        }
        else if(car instanceof Bus){
            balance -= 200;
            //mn.increaseIncome(200);
            totalIncomes.add(200);
            ((Bus) car).setBalance(balance);
        }

        carArray.add(car);
    }
    public ArrayList<Integer> Incomes() {
        return totalIncomes;
    }


}
