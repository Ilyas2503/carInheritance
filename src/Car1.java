public class Car1 extends Auto {
    private String vinCode;




    public String getVinCode() {
        return vinCode;
    }

    public Car1(int yearOFIssue, String model, Shelter shelter,
                ColorEnum colorEnum, String vinCode) {
        super(yearOFIssue, model, shelter, colorEnum);
        super.getYearOFIssue(yearOFIssue);
        super.getBrand(model);
        super.getShelter(shelter);
        super.getColorEnum(colorEnum);
        this.vinCode = vinCode;
    }


//    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nVin code: " + vinCode;
    }



    public void signal() {
        System.out.println("BIP-BIP");
    }
//    @Override
    public void signal(String voice) {
        System.out.println(voice);
    }




}
