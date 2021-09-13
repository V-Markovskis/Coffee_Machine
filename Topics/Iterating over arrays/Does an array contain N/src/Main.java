import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        boolean contains = false;

        for (int i = 0; i < len; i++) {
            if (array[i] == n) {
                contains = true;
                break;
            }
        }
        System.out.println(contains);
    }
}