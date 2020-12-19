package module9_java_advanced_coding.ex_20_shape;

abstract class Shape3D extends Shape implements Fillable {

    abstract double calculateVolume();

    @Override
    public void fill(double water) {
        if (calculateVolume() > water) {
            System.out.println("Not enough water.");
        } else if (calculateVolume() == water) {
            System.out.println("Just enough water.");
        } else {
            System.out.println("Too much water.");
        }
    }
}
