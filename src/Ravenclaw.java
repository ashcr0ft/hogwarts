public class Ravenclaw extends Hogwarts{
    private final int intelligence, wisdom, wit, creativity;

    public Ravenclaw(String firstName, String lastName) {
        super(firstName, lastName);
        this.intelligence = getRandom();
        this.wisdom = getRandom();
        this.wit = getRandom();
        this.creativity = getRandom();
    }
    public void characteristicPrint() {
        super.studentPrint();
        System.out.println("Ум = " + intelligence + "; Мудрость = " + wisdom + "; Остроумие = "
                + wit + "; Креативность = " + creativity);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
    public int total() {
        return intelligence + wisdom + wit + creativity;
    }
}
