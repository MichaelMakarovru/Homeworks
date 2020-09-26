package module2_java_fundamentals.lesson2.oop;

public class InternetShop {

    public static void main(String[] args) {

        Client myClient = new Client();
        Client myClient2 = myClient;
        Client myClient3 = new Client();

        Client myClient4 = new Client();
        myClient4 = null;

        int x = 5;
        int y = x;
        x++;
        System.out.println(y);

        myClient.name = "John Doe";
        myClient.age = 25;
        myClient.address = "Latvia, Riga, Brivibas 105-35";

        System.out.println(myClient.name);
        System.out.println(myClient.age);
        System.out.println(myClient.address);
        System.out.println(myClient2.name);
        System.out.println(myClient2.age);
        System.out.println(myClient2.address);
        System.out.println(myClient3.name);
        System.out.println(myClient3.age);
        System.out.println(myClient3.address);

        myClient2.age = 36;

        System.out.println(myClient.name);
        System.out.println(myClient.age);
        System.out.println(myClient.address);
        System.out.println(myClient2.name);
        System.out.println(myClient2.age);
        System.out.println(myClient2.address);
        System.out.println(myClient3.name);
        System.out.println(myClient3.age);
        System.out.println(myClient3.address);


        String s5 = "String 1";

    }
}
