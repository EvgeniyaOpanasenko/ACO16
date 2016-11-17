package OOP.week1.student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Lisa on 11/17/2016.
 */
public class Group {
    private String name;
    private Student[] students;
    private int studentsCount;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", studentsCount=" + Arrays.toString(students) +
                '}';
    }

    public Group(String name, int groupSize) {
        this.name = name;
        students = new Student[groupSize];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentCount() {
        return studentsCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentsCount = studentCount;
    }

    public void sort() {
        Arrays.sort(students);
    }

    public void sort(Comparator comparator) {
     Arrays.sort(students, comparator);
    }

    public boolean addStudent(Student student) {

        if (studentsCount == students.length || student == null) return false;// проверили длину
        for (int i = 0; i < studentsCount; i++) {// шагаем по массиву
            if (student.equals(students[i])) return false; //проверяем есть ли такй студент
        }

        students[studentsCount] = student;
        studentsCount++;

        return true;
    }

    public void showStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

}
