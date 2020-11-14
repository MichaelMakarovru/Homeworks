package module7_java_advanced_features.lesson1.oop.encapsulation;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

        Client client = new Client();
        client.setBirthDate(null);
        System.out.println(client);

        client.getBirthDate().getMonth();

        client.setBirthDate(LocalDate.now().plusDays(1));
        System.out.println(client);

        client.setBirthDate(LocalDate.now().minusYears(35));
        System.out.println(client);
    }
}
