public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter("Germany", "sidan");
        Car1 car1 = new Car1(2018,
                "BMW", shelter, ColorEnum.BLACK, "235T34TG332");
        System.out.println(car1);
        System.out.println(car1.getInfo());
        car1.signal();
        car1.signal("BIP-BIP-BIP");


        System.out.println("-----------");

        Shelter shelter1 = new Shelter("Germany", "universal");
        Car2 car2 = new Car2(2022,
                "Mercedes-Benz", shelter1, ColorEnum.NAVY_BLUE, 3.2);
        System.out.println(car2);
        System.out.println(car2.getinfo());
        car2.getinfo();
        car2.signal();
        car2.signal("BAAAP");

        System.out.println("-----------");

        Shelter shelter2 = new Shelter("Germany", "sidan");
        Car2 car3 = new Car2(2021,
                "Maybach", shelter2, ColorEnum.WHITE, 5.5);
        System.out.println(car3.getinfo());
        car3.signal();
    }


}