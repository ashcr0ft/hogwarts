public class Hufflepuff extends Hogwarts {
    private int hardWork, loyalty, honesty;

      public Hufflepuff(String firstName, String lastName) {
        super(firstName, lastName);
        this.hardWork = getRandom();
        this.loyalty = getRandom();
        this.honesty = getRandom();

    }

    public void characteristicPrint() {
        super.studentPrint();
        System.out.println("Трудолюбие = " + hardWork + "; Верность = " + loyalty + "; Честность = " + honesty);
    }
    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public int total() {
        return hardWork + loyalty + honesty;
    }
}


