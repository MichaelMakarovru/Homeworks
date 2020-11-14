package module7_java_advanced_features.lesson1.oop.encapsulation;

import java.time.LocalDate;

class Client {

    private LocalDate birthDate;

    public void setBirthDate(LocalDate date) {

        if (null == date || date.isAfter(LocalDate.now())) {
            System.out.println("WARNING: Illegal argument.");
            birthDate = LocalDate.now().minusYears(18);
            return;
        }

        birthDate = date;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "birthDate=" + birthDate +
                '}';
    }
}
