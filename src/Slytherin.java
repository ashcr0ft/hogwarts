public class Slytherin extends Hogwarts {
    private int cunning, determination, ambition, resourcefulness, lustForPower;

    public Slytherin(String firstName, String lastName) {
        super(firstName, lastName);
        this.cunning = getRandom();
        this.determination = getRandom();
        this.ambition = getRandom();
        this.resourcefulness = getRandom();
        this.lustForPower = getRandom();

    }

    public void characteristicPrint() {
        super.studentPrint();
        System.out.println("Хитрость = " + cunning + "; Решительность = " + determination + "; Амбициозность = "
                + ambition + "; Находчивость = " + resourcefulness + "; Жажда власти = " + lustForPower);
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int total() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
}
