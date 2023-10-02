
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        var keyboard = new Scanner(System.in);
        String nameIn, input = " ";
        int IDIn;
        double GPAIn;

        var st1 = new Student("Ana Jolie", 229, 56.7);
        var st2 = new Student("Brie Cheeson", 387, 67.2);
        var st3 = new Student("Shelly Cea", 342, 67.5);
        var st4 = new Student("Hea Vho", 278, 44.8);
        var st5 = new Student("Dea Clan", 434, 78.5);
        var st6 = new Student("Grain ye", 332, 38.5);

        var students = new ArrayList<Student>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        printTable(students);

        Collections.sort(students);
        System.out.println(" ");

        printTable(students);

        while (!input.equalsIgnoreCase("exit")) {

            System.out.println("\nPlease choose Command: Add, Sort Name, Sort ID, Sort GPA, Display, Exit");
            input = keyboard.nextLine();

            if (input.equalsIgnoreCase("Add")) {
                System.out.println("Please enter new Student name: ");
                nameIn = keyboard.nextLine();
                System.out.println("Please enter new Student ID: ");
                IDIn = keyboard.nextInt();
                System.out.println("Please enter new Student GPA: ");
                GPAIn = keyboard.nextDouble();

                var stNew = new Student (nameIn, IDIn, GPAIn);

                students.add(stNew);
            }
            else if (input.equalsIgnoreCase("Sort Name")) {

                Collections.sort(students,new NameComparator());
            }
            else if (input.equalsIgnoreCase("Sort ID")) {

                Collections.sort(students,new IDComparator());
            }else if (input.equalsIgnoreCase("Sort GPA")) {

                Collections.sort(students,new GPAComparator());
            }
            else if (input.equalsIgnoreCase("Display")) {
                printTable(students);
            }
            else if (input.equalsIgnoreCase("Grades")) {
                Collections.sort(students, new GPAComparator());

                System.out.println("H1:");

                for (Student s: students) {
                    if (s.getGPA() > 70) {
                        System.out.printf("%-15s, ", s.getName());
                    }
                }

                System.out.println("\n21:");
                for (Student s: students) {
                    if (s.getGPA() > 60 & s.getGPA() < 69) {
                        System.out.printf("%-15s, ", s.getName());
                    }
                }

                System.out.println("\n22:");

                for (Student s: students) {
                    if (s.getGPA() > 50 & s.getGPA() < 59) {
                        System.out.printf("%-15s, ", s.getName());
                    }
                }

                System.out.println("\nPass:");

                for (Student s: students) {
                    if (s.getGPA() > 40 & s.getGPA() < 49) {
                        System.out.printf("%-15s, ", s.getName());
                    }
                }

                System.out.println("\nFail: ");

                for (Student s: students) {
                    if (s.getGPA() < 40) {
                        System.out.printf("%-15s, ", s.getName());
                    }
                }
            }
            else System.out.println("Please enter Valid command");
        }

    }

    //H1 = 70+
    //21 = 60-69
    //22 = 50-59
    //pass = 40-49
    //fail = 0-39


    public static void printTable(ArrayList<Student> students) {
        System.out.printf("\n%-15s | %-5s | %-5s", "Name:", "ID:", "GPA:");

        for (Student s: students) {
            System.out.printf("\n%-15s | %-5d | %-5.2f", s.getName(), s.getStudentID(), s.getGPA());
        }

    }
}