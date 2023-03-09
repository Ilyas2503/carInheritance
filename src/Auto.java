public class Auto {
    private final Integer yearOfIssue;
    private final String brand;
    private Shelter shelter;
    private ColorEnum colorEnum;

    public Auto(int yearOFIssue, String brand, Shelter shelter, ColorEnum colorEnum) {
        this.yearOfIssue = yearOFIssue;
        this.brand = brand;
        this.shelter = shelter;
        this.colorEnum = colorEnum;
    }


    public int getYearOFIssue(int yearOFIssue) {
        return this.yearOfIssue;
    }

    public String getBrand(String brand) {
        return this.brand;
    }

    public Shelter getShelter(Shelter shelter) {
        return this.shelter;
    }

    public ColorEnum getColorEnum(ColorEnum colorEnum) {
        return this.colorEnum;
    }

    public String getInfo() {
        return "YearOfIssue: " + yearOfIssue +
                "\nBrand: " + brand +
                "\nColor: " + colorEnum +
                "\nShelter country: " + shelter.getPlaceOfProduction() +
                "\nShelter body: " + shelter.getCarBody();
    }

    public void signal() {
        System.out.println("BAP-BIP-BAP");
    }


}


