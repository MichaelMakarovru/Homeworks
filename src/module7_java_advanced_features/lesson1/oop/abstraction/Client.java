package module7_java_advanced_features.lesson1.oop.abstraction;

import java.time.LocalDate;
//Internet shop client
class Client {
    //These fields make sense in our system, so we are reusing them.
    private String firstName;
    private String lastName;
    private String personalCode;
    private LocalDate localDate;
    private String phoneNumber;
    private String address;

    //We do not need properties of real life objects, like height, weight, hobbies, etc.
    //So we are not using them.
}
