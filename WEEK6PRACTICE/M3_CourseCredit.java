import java.util.Scanner;

class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {

        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {

        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }
}

public class M3_CourseCredit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Theory-only course:");

        System.out.print("Enter course code: ");
        String code1 = sc.nextLine();

        System.out.print("Enter course title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter credits: ");
        int credits1 = sc.nextInt();
        sc.nextLine();

        Course theoryCourse = new Course(
                code1,
                title1,
                credits1
        );

        System.out.println("\nCourse with lab:");

        System.out.print("Enter course code: ");
        String code2 = sc.nextLine();

        System.out.print("Enter course title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter credits: ");
        int credits2 = sc.nextInt();

        System.out.print("Enter lab credits: ");
        int labCredits = sc.nextInt();

        Course labCourse = new Course(
                code2,
                title2,
                credits2,
                labCredits
        );

        System.out.println("\nTotal Credits:");

        System.out.println(
                theoryCourse.code + " total credits: "
                + theoryCourse.totalCredits()
        );

        System.out.println(
                labCourse.code + " total credits: "
                + labCourse.totalCredits()
        );

        sc.close();
    }
}