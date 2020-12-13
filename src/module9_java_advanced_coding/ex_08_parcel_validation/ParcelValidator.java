package module9_java_advanced_coding.ex_08_parcel_validation;

public class ParcelValidator implements Validator<Parcel> {

    @Override
    public boolean validate(Parcel parcel) {

        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() > 300) {
            return false;
        }

        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() < 30) {
            return false;
        }

        if (parcel.isExpress() && parcel.getWeight() > 15) {
            return false;
        }

        if (!parcel.isExpress() && parcel.getWeight() > 30) {
            return false;
        }

        return true;
    }
}
