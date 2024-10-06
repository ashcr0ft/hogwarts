import java.util.Objects;

public abstract class Hogwarts {
    private final String firstName;
    private final String lastName;
    private final int power;
    private final int transgress;

    public Hogwarts(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.power = getRandom();
        this.transgress = getRandom();
    }

    public int getRandom() {
        return (int) (Math.random() * 101);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPower() {
        return power;
    }

    public int getTransgress() {
        return transgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return Objects.equals(firstName, hogwarts.firstName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lastName);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", power=" + power +
                ", transgress=" + transgress +
                '}';
    }

    public void studentPrint() {
        System.out.println(firstName + " " + lastName);
        System.out.println("Сила магии = " + power + "; Дальность трансгрессии = " + transgress);
    }

    public int commonPowers() {
        return power + transgress;
    }

}
