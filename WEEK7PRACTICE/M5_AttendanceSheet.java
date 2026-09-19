import java.util.Scanner;

class AttendanceSheet {

    private String[] presentStudents;
    private int presentCount;

    public AttendanceSheet(int maximumStudents) {
        presentStudents = new String[maximumStudents];
        presentCount = 0;
    }

    public void markPresent(String name) {

        if (isPresent(name)) {
            System.out.println(name + " is already marked present.");
            return;
        }

        if (presentCount < presentStudents.length) {
            presentStudents[presentCount] = name;
            presentCount++;

            System.out.println(name + " marked present.");
        } else {
            System.out.println("Attendance sheet is full.");
        }
    }

    public int getPresentCount() {
        return presentCount;
    }

    public boolean isPresent(String name) {

        for (int i = 0; i < presentCount; i++) {

            if (presentStudents[i].equals(name)) {
                return true;
            }
        }

        return false;
    }
}

public class M5_AttendanceSheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum class size: ");
        int maximumStudents = sc.nextInt();
        sc.nextLine();

        AttendanceSheet sheet =
                new AttendanceSheet(maximumStudents);

        System.out.print("Enter number of students to mark: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            sheet.markPresent(name);
        }

        System.out.println(
                "Present count: " + sheet.getPresentCount()
        );

        System.out.print("Enter name to check: ");
        String searchName = sc.nextLine();

        System.out.println(
                searchName + " present: "
                + sheet.isPresent(searchName)
        );

        sc.close();
    }
}