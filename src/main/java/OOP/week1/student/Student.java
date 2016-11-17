package OOP.week1.student;

/**
 * Created by Lisa on 11/17/2016.
 */
public class Student implements Comparable <Student>{
    private String name;
    private String surname;
    private transient double averageMark;

    public Student(String name, String surname, double averageMark){
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMark() {
        return averageMark;
    }

    public void setMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format(" name - %s, surname - %s, average mark - %.2f", name, surname, averageMark);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (Double.compare(student.averageMark, averageMark) != 0) return false;
        if (!name.equals(student.name)) return false;
        return surname.equals(student.surname);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + surname.hashCode();
        temp = Double.doubleToLongBits(averageMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

   @Override
    public int compareTo(Student o) {
        int answer = name.compareTo(o.getName());
        if (answer != 0) return answer;
        return surname.compareTo(o.getSurname());
    }
}
