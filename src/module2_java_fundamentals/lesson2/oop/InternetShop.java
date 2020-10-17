package module2_java_fundamentals.lesson2.oop;

public class InternetShop {

    public static void main(String[] args) {

        //Instance of class Client created using a default constructor
        Client myClient = new Client();
        //myClient2 refers to the same object in memory referred by myClient
        Client myClient2 = myClient;
        //Another instance of class Client created using a default constructor
        Client myClient3 = new Client();

        //Setting values to object fields using myClient reference
        myClient.name = "John Doe";
        myClient.age = 25;
        myClient.address = "Latvia, Riga, Brivibas 105-35";

        //Note, that both myClient and myClient2 have the same values.
        //This happens because both point to the same object in memory.
        System.out.println(myClient.name);
        System.out.println(myClient.age);
        System.out.println(myClient.address);
        System.out.println(myClient2.name);
        System.out.println(myClient2.age);
        System.out.println(myClient2.address);
        System.out.println(myClient3.name);
        System.out.println(myClient3.age);
        System.out.println(myClient3.address);
        System.out.println();

        //Changing age value using myClient2 reference
        myClient2.age = 36;

        //Value of age for both myClient and myClient2 changed.
        System.out.println(myClient.name);
        System.out.println(myClient.age);
        System.out.println(myClient.address);
        System.out.println(myClient2.name);
        System.out.println(myClient2.age);
        System.out.println(myClient2.address);
        System.out.println(myClient3.name);
        System.out.println(myClient3.age);
        System.out.println(myClient3.address);
    }
}
