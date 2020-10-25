package module4_java_fundamentals_coding.shopping_list;

class Product {

    private String name;
    private double quantity;
    private String measurementUnits;
    private boolean isBought;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim();
        String firstLetter = name.substring(0, 1).toUpperCase(); //M
        String rest = name.substring(1).toLowerCase(); //ilk
        this.name = firstLetter + rest; //Milk
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getMeasurementUnits() {
        return measurementUnits;
    }

    public void setMeasurementUnits(String measurementUnits) {
        this.measurementUnits = measurementUnits;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    public String toString() {
        char checkMark;
        if (isBought) {
            checkMark = '\u2713';
        } else {
            checkMark = '\u0000';
        }

        StringBuilder sb = new StringBuilder();
        sb.append(checkMark);
        sb.append(name);
        sb.append(" ");
        sb.append(quantity);
        sb.append(" ");
        sb.append(measurementUnits);

        return sb.toString();
    }
}
