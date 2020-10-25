package module4_java_fundamentals_coding.shopping_list;

class ShoppingList {

    private Product[] list = new Product[10];
    private int currentIndex = 0;

    public void addProduct(Product product) {

        if (currentIndex >= list.length) {
            expandList();
        }
        list[currentIndex] = product;
        currentIndex++;
    }

    public void removeProduct(int productIndex) {

        for (int i = productIndex; i < currentIndex - 1; i++) {
            list[i] = list[i + 1];
        }
        currentIndex--;
        list[currentIndex] = null;
    }

    public void clearList() {

        list = new Product[list.length];
        currentIndex = 0;
    }

    public void editProduct(int productIndex, Product newProduct) {

        Product product = list[productIndex];

        if (newProduct.getName() != null) {
            product.setName(newProduct.getName());
        }
        if (newProduct.getQuantity() != 0) {
            product.setQuantity(newProduct.getQuantity());
        }
        if (newProduct.getMeasurementUnits() != null) {
            product.setMeasurementUnits(newProduct.getMeasurementUnits());
        }
    }

    public void markAsBought(int productIndex) {
        list[productIndex].setBought(true);
    }

    public void unmarkAsBought(int productIndex) {
        list[productIndex].setBought(false);
    }

    public void displayShoppingList() {
        System.out.println();
        System.out.println("List");
        System.out.println("====");
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (int i = 0; i < currentIndex; i++) {
            System.out.println((i + 1) + ") " + list[i].toString());
        }
    }

    public boolean isEmpty() {
        if (currentIndex == 0) {
            return true;
        }
        return false;
    }

    private void expandList() {

        Product[] newList = new Product[(int) (list.length * 1.5)];

        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }

        list = newList;

        //We can use Arrays.copyOf method to copy and expand array
       // list = Arrays.copyOf(list, (int)(list.length * 1.5));
    }
}
