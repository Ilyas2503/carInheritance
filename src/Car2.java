public final class Car2 extends Auto {
    private double value;

        public double getValue() {
        return value;
    }

    public Car2(int yearOFIssue, String brand, Shelter shelter,
                ColorEnum colorEnum, double value) {
        super(yearOFIssue, brand, shelter, colorEnum);
        this.value = value;
        super.getYearOFIssue(yearOFIssue);
        super.getBrand(brand);
        super.getShelter(shelter);
        super.getColorEnum(colorEnum);
    }


    @Override
    public void signal() {
        System.out.println("BUP-BIP-BAP");
    }

    public void signal(String voice){
        System.out.println(voice);
    }


    public String getinfo(){
        return super.getInfo() +
                "\nValue " + value;
    }


}


