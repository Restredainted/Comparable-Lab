import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.getGPA() - o1.getGPA()) * 100;
    }
}
