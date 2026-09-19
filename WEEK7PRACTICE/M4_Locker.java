import java.util.Scanner;

class Locker {

    private String code;
    private final int lockerNumber;

    public Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public void changeCode(String currentCode, String newCode) {

        if (code.equals(currentCode)) {
            code = newCode;
            System.out.println("Code changed successfully.");
        } else {
            System.out.println("Code change rejected: incorrect current code.");
        }
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
}

public class M4_Locker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter locker number: ");
        int lockerNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter initial code: ");
        String code = sc.nextLine();

        Locker locker = new Locker(lockerNumber, code);

        System.out.print("Enter current code: ");
        String currentCode = sc.nextLine();

        System.out.print("Enter new code: ");
        String newCode = sc.nextLine();

        locker.changeCode(currentCode, newCode);

        System.out.println("Locker Number: " + locker.getLockerNumber());

        sc.close();
    }
}