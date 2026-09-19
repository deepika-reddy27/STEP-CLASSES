import java.util.Scanner;

class PiggyBank {

    private double savings;
    private final String id;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
            System.out.println("Deposit successful. Savings = " + savings);
        } else {
            System.out.println("Deposit rejected: amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
        } else if (amount > savings) {
            System.out.println("Withdrawal rejected: insufficient savings.");
        } else {
            savings -= amount;
            System.out.println("Withdrawal successful. Savings = " + savings);
        }
    }

    public double getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }
}

public class M1_PiggyBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Piggy Bank ID: ");
        String id = sc.nextLine();

        PiggyBank pb = new PiggyBank(id);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        pb.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        pb.withdraw(withdraw);

        System.out.println("Piggy Bank ID: " + pb.getId());
        System.out.println("Final savings: " + pb.getSavings());

        sc.close();
    }
}