public class Student implements Comparable<Student> {
    private String name;
    private int studentID;
    private double GPA;



    public Student(String name, int studentID, double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student comp) {

        return (int) ((comp.getGPA() - GPA) * 100);
        /* if (comp.GPA - GPA < 0) {
            return -1;
        }
        else if (comp.getGPA() - GPA > 0) {
            return 1;
        }
        else return 0; */


        // negative comes before
        // Zero is equal
        // positive is after
    }
}
