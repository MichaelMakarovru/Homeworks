package module9_java_advanced_coding.ex_08_parcel_validation;

class Main {

    public static void main(String[] args) {

        ParcelValidator validator = new ParcelValidator();

        Parcel parcel = new Parcel(50, 50, 50, 25, false);
        System.out.println(parcel + " is valid: " + validator.validate(parcel));

        parcel = new Parcel(200, 200, 200, 25, false);
        System.out.println(parcel + " is valid: " + validator.validate(parcel));

        parcel = new Parcel(8, 8, 10, 25, false);
        System.out.println(parcel + " is valid: " + validator.validate(parcel));

        parcel = new Parcel(50, 50, 50, 25, true);
        System.out.println(parcel + " is valid: " + validator.validate(parcel));

        parcel = new Parcel(50, 50, 50, 35, false);
        System.out.println(parcel + " is valid: " + validator.validate(parcel));

        parcel = new Parcel(50, 50, 50, 15, true);
        System.out.println(parcel + " is valid: " + validator.validate(parcel));
    }
}
