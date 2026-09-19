import java.util.Scanner;

class PlacementRecord {

    String studentName;
    String company;
    double packageLpa;

    PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class M1_PlacementRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PlacementRecord[] records = new PlacementRecord[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Student name: ");
            String name = sc.nextLine();

            System.out.print("Company: ");
            String company = sc.nextLine();

            System.out.print("Package LPA: ");
            double packageLpa = sc.nextDouble();
            sc.nextLine();

            records[i] = new PlacementRecord(name, company, packageLpa);
        }

        System.out.println("\nPlacement Records:");

        for (PlacementRecord record : records) {
            record.printRecord();
        }

        sc.close();
    }
}