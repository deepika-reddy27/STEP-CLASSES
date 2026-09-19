import java.util.Scanner;

class TrafficLight {

    private final String id;

    private String color;

    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED";
    }

    public void next() {

        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }
}

public class W7P4_TrafficLight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light ID: ");
        String id = sc.nextLine();

        TrafficLight t = new TrafficLight(id);

        System.out.println("Initial color: " + t.getColor());

        System.out.print("Enter number of times to change: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            t.next();
            System.out.println("Current color: " + t.getColor());
        }

        sc.close();
    }
}