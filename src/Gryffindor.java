public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String firstName, String lastName) {
        super(firstName, lastName);
        this.nobility = getRandom();
        this.honor = getRandom();
        this.courage = getRandom();

    }

    public void characteristicPrint() {
        super.studentPrint();
        System.out.println("Благородство = " + nobility + "; Честь = " + honor + "; Храбрость = " + courage);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    public int total() {
        return honor + nobility + courage;
    }
}
