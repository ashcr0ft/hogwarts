public class Main {

    public static void main(String[] args) {
        HogwartsStudents students = new HogwartsStudents();
        students.createStudents("Harry", "Potter", "Gryffindor");
        students.createStudents("Hermione", "Granger", "Gryffindor");
        students.createStudents("Ron", "Weasley", "Gryffindor");
        students.createStudents("Draco", "Malfoy", "Slytherin");
        students.createStudents("Graham", "Montague", "Slytherin");
        students.createStudents("Gregory", "Goyle", "Slytherin");
        students.createStudents("Zachariah", "Smith", "Hufflepuff");
        students.createStudents("Cedric", "Diggory", "Hufflepuff");
        students.createStudents("Justin", "Finch-Fletchley", "Hufflepuff");
        students.createStudents("Zhou", "Chang", "Ravenclaw");
        students.createStudents("Padma", "Patil", "Ravenclaw");
        students.createStudents("Marcus", "Belby", "Ravenclaw");
        students.printStudentByName("Potter");
        students.printStudentByName("Granger");
        students.compareFaculty("Potter", "Granger");
        students.printStudentByName("Goyle");
        students.duel("Goyle", "Potter");


    }
}