package gise.sistemi;

public class MainClass {
    public static void main(String[] args) {
        ICar car = new Automobile(1000, 1, "Berat", "Safran");
        ICar car2 = new Minibus(2000, 2, "Batuhan", "Okur");
        ICar car3 = new Bus(3000, 3, "James", "Dylan");
        ICar car4 = new Bus(3000, 3, "Kobe", "Bryant");

        TicketOffice office = new TicketOffice();
        Management mn = new Management();

        System.out.println("Car1 geçmeden önce: " + car.balance());
        office.Payment(car);
        System.out.println("Car1 geçtikten sonra: " + car.balance() + "\n");

        System.out.println("Car2 geçmeden önce: " + car2.balance());
        office.Payment(car2);
        System.out.println("Car2 geçtikten sonra: " + car2.balance() + "\n");

        System.out.println("Car3 geçmeden önce: " + car3.balance());
        office.Payment(car3);
        System.out.println("Car3 geçtikten sonra: " + car3.balance() + "\n");

        System.out.println("Car4 geçmeden önce: " + car4.balance());
        office.Payment(car4);
        System.out.println("Car4 geçtikten sonra: " + car4.balance() + "\n");


        System.out.println("Car Listesi");
        for(ICar cars: office.carArray){
            System.out.println("Arac Tipi: " + cars.ReturnType());
            System.out.println("HGS Numarasi: " + cars.hgsNumber());
            System.out.println("Sahibinin adi: " + cars.name());
            System.out.println("Sahibinin soyadi: " + cars.surname());
            System.out.println("Arac bakiyesi: " + cars.balance() + "\n");

        }


        System.out.println("Günlük total kazanç: " + mn.TotalIncome(office));

    }
}
