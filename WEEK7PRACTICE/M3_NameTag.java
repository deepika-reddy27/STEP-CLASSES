import java.util.Scanner;

class NameTag {

    private final String firstName;
    private final String lastName;

    public NameTag(String fullName) {

        String[] parts = fullName.split(" ");

        firstName = parts[0];
        lastName = parts[1];
    }

    public String getNickname() {

        return firstName + " " + lastName.charAt(0) + ".";
    }
}

public class M3_NameTag {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();

        NameTag tag = new NameTag(fullName);

        System.out.println("Nickname: " + tag.getNickname());

        sc.close();
    }
}
