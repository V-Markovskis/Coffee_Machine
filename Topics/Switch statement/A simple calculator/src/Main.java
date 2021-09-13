import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNum = sc.nextLong();
        String operation = sc.next();
        long secondNum = sc.nextLong();

        switch (operation) {
            case ("+"):
                System.out.println(firstNum + secondNum);
                break;
            case ("-"):
                System.out.println(firstNum - secondNum);
                break;
            case ("/"):
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNum / secondNum);
                }
                break;
            case ("*"):
                System.out.println(firstNum * secondNum);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}