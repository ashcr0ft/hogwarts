public class HogwartsStudents {
    private static Hogwarts[] students = new Hogwarts[15];

    //Создаем студента в массиве
    public void createStudents(String firstName, String lastName, String faculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                switch (faculty) {
                    case ("Gryffindor"):
                        students[i] = new Gryffindor(firstName, lastName);
                        break;
                    case ("Hufflepuff"):
                        students[i] = new Hufflepuff(firstName, lastName);
                        break;
                    case ("Slytherin"):
                        students[i] = new Slytherin(firstName, lastName);
                        break;
                    case ("Ravenclaw"):
                        students[i] = new Ravenclaw(firstName, lastName);
                        break;
                }
                break;
            }
        }
    }

    //Вывод данных по студенту
    public void printStudentByName(String studentName) {
        boolean find = false;
        for (Hogwarts student : students) {
            if (student != null && student.getLastName().equals(studentName)) {
                if (student instanceof Gryffindor) {
                    ((Gryffindor) student).characteristicPrint();
                    find = true;
                    break;
                }
                if (student instanceof Hufflepuff) {
                    ((Hufflepuff) student).characteristicPrint();
                    find = true;
                    break;
                }
                if (student instanceof Slytherin) {
                    ((Slytherin) student).characteristicPrint();
                    find = true;
                    break;
                }
                if (student instanceof Ravenclaw) {
                    ((Ravenclaw) student).characteristicPrint();
                    find = true;
                    break;
                }

            }
        }
        if (!find) {
            System.out.println("Who's " + studentName + "?");
        }
    }

//Метод для поиска объектов в массиве по полю getLastName
    public Hogwarts finder(String studentName) {
        Hogwarts studentFind = null;
        for (Hogwarts student : students) {
            if (student != null && (studentFind == null || student.getLastName().equals(studentName))) {
                studentFind = student;
            }

        }
        return studentFind;
    }

    //Лучший на факультете
    public void compareFaculty(String studentName1, String studentName2) {
        Hogwarts student1 = finder(studentName1);
        Hogwarts student2 = finder(studentName2);
        if (student1 instanceof Gryffindor && student2 instanceof Gryffindor) {
            if (((Gryffindor) student1).total() > ((Gryffindor) student2).total()) {
                System.out.println(student1.getFirstName() + " " + student1.getLastName()
                        + " Лучший Гриффиндорец, чем " + student2.getFirstName() + " " + student2.getLastName());

            } else
                System.out.println(student2.getFirstName() + " " + student1.getLastName()
                        + " Лучший Гриффиндорец, чем " + student1.getFirstName() + " " + student1.getLastName());
        }
        if (student1 instanceof Hufflepuff && student2 instanceof Hufflepuff) {
            if (((Hufflepuff) student1).total() > ((Hufflepuff) student2).total()) {
                System.out.println(student1.getFirstName() + " " + student1.getLastName()
                        + " Лучший Пуффендуец, чем " + student2.getFirstName() + " " + student2.getLastName());

            } else
                System.out.println(student2.getFirstName() + " " + student1.getLastName()
                        + " Лучший Пуффендуец, чем " + student1.getFirstName() + " " + student1.getLastName());
        }
        if (student1 instanceof Slytherin && student2 instanceof Slytherin) {
            if (((Slytherin) student1).total() > ((Slytherin) student2).total()) {
                System.out.println(student1.getFirstName() + " " + student1.getLastName()
                        + " Лучший Слизеринец, чем " + student2.getFirstName() + " " + student2.getLastName());

            } else
                System.out.println(student2.getFirstName() + " " + student1.getLastName()
                        + " Лучший Слизеринец, чем " + student1.getFirstName() + " " + student1.getLastName());
        }
        if (student1 instanceof Ravenclaw && student2 instanceof Ravenclaw) {
            if (((Ravenclaw) student1).total() > ((Ravenclaw) student2).total()) {
                System.out.println(student1.getFirstName() + " " + student1.getLastName()
                        + " Лучший Когтевранец, чем " + student2.getFirstName() + " " + student2.getLastName());

            } else
                System.out.println(student2.getFirstName() + " " + student1.getLastName()
                        + " Лучший Когтевранец, чем " + student1.getFirstName() + " " + student1.getLastName());
        }
        if (student1.getClass() != student2.getClass()) {
            System.out.println("Разные факультеты");
        }
    }
//Дуэль
    public void duel(String studentName1, String studentName2) {
        Hogwarts student1 = finder(studentName1);
        Hogwarts student2 = finder(studentName2);
        if (student1.commonPowers() > student2.commonPowers()) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName()
                    + " обладает бОльшей мощностью магии, чем " + student2.getFirstName() + " " + student2.getLastName());
        }else System.out.println(student2.getFirstName() + " " + student2.getLastName()
                + " обладает бОльшей мощностью магии, чем " + student1.getFirstName() + " " + student1.getLastName());
    }

}