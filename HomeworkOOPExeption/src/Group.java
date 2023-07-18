import java.util.Arrays;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];
    private int count = 0;

    public Group(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        if (count >= 10) {
            throw new GroupOverflowException("Group are overloaded!");
        }
        students[count] = student;
        count++;
    }

    public Student searchByLastName(String lastName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student == null) {
                break;
            }
            if (student.getLastName() == lastName) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found");
    }

    public boolean removeStudentByID(int id) {
        boolean removed;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i] = null;
                System.out.println("Student has been removed");
                return removed = true;
            }
        }
        System.out.println("Student has not been found");
        return removed = false;
    }
    public void sortByLastName() {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < count - 1; i++) {
                if (students[i] == null || students[i + 1] == null) {
                    continue;
                }
                if (students[i].getLastName().compareTo(students[i + 1].getLastName()) > 0) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    @Override
    public String toString() {
        sortByLastName();
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
