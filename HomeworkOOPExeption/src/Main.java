public class Main {
    public static void main(String[] args) throws GroupOverflowException, StudentNotFoundException {
        Student studentOne = new Student("Big", "Frog", Gender.MALE, 1, "First");
        Student studentTwo = new Student("Small", "Dro", Gender.MALE, 2, "First");
        Student studentThree = new Student("Medium", "Cro", Gender.MALE, 3, "First");
        Student studentFour = new Student("Fist", "Bro", Gender.MALE, 4, "First");
        Student studentFive = new Student("Last", "Aro", Gender.MALE, 5, "First");
        Group firstGroup = new Group();
        firstGroup.setGroupName("First");
        firstGroup.addStudent(studentOne);
        firstGroup.addStudent(studentTwo);
        firstGroup.addStudent(studentThree);
        firstGroup.addStudent(studentFour);
        firstGroup.addStudent(studentFive);
        System.out.println(firstGroup);
        System.out.println(firstGroup.searchByLastName("Dro"));
        firstGroup.removeStudentByID(2);
        System.out.println(firstGroup);
    }
}
