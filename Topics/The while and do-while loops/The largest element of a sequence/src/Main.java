import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = 0;
        int value;
        do {
            value = sc.nextInt();
            if (value > largest) {
                largest = value;
            }
        } while (value != 0);
        System.out.println(largest);


        }
    }