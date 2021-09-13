

public class ArrayTest {

  public static void main(String[] args) {
    int[] numbers = new int[3];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;

    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println(sum);


  }

}