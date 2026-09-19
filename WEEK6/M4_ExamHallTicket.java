import java.util.Scanner;

class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class M4_ExamHallTicket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        HallTicket priya = new HallTicket(name, 0);

        HallTicket copy = priya;

        System.out.print("Enter new seat number: ");
        int seatNumber = sc.nextInt();

        copy.seatNumber = seatNumber;

        HallTicket separate = new HallTicket(name, seatNumber);

        System.out.println("\nOutput:");

        System.out.println(
            name + "'s seatNumber (via first variable):"
        );
        System.out.println(priya.seatNumber);

        System.out.println("copy == priya: " + (copy == priya));

        System.out.println(
            "separate == priya: " + (separate == priya)
        );

        sc.close();
    }
}