import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numOfBridges = sc.nextInt();
        int count = 0;

        while (sc.hasNext()) {
            int bridgeHeight = sc.nextInt();
            count++;
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + count);
                break;
            } else if (count >= numOfBridges) {
                System.out.println("Will not crash");
                break;
            }
        }
    }
}