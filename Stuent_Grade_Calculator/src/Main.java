import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //let there are total subjects-> english,hindi,chemistry,physics,maths,biology
        Scanner sc = new Scanner(System.in);

        GradeCalculator g = new GradeCalculator();

        System.out.println("add new student enter 1");
        System.out.println("get list of all students enter 2");

        while(true) {
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println(g.addStudentMarks());
            } else if (b == 2) {
               g.listOfStudentMarks();
            } else {
                break;
            }
        }

//        g.listOfStudentMarks();

    }
}