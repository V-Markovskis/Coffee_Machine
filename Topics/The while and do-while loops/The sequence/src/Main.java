import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = 0;
        int highestElement = 0;

        while(sc.hasNext()) {
            numberOfElements++;
            int n = sc.nextInt();
            if (n % 4 == 0 && n > highestElement) {
                highestElement = n;
            }
            if (numberOfElements == 1000) {
                break;
            }

        }
        System.out.println(highestElement);
    }
}