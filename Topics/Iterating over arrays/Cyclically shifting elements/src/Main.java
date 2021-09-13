import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int size = sc.nextInt();
        final int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int n = 1;

        for(int i = 0; i < n; i++) {
            int j, last;
            last = array[array.length - 1];

            for (j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = last;

            for(i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
        }
    }
}