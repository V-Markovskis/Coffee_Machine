import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomShape = sc.nextLine();

        double sideA,sideB,sideC,radius;

        switch (roomShape) {
            case "triangle":
                sideA = sc.nextDouble();
                sideB = sc.nextDouble();
                sideC = sc.nextDouble();
                double p = (sideA + sideB + sideC) / 2;
                double areaTriangle = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
                System.out.println(areaTriangle);
                break;
            case "rectangle":
                sideA = sc.nextDouble();
                sideB = sc.nextDouble();
                double areaRectangle = sideA * sideB;
                System.out.println(areaRectangle);
                break;
            case "circle":
                radius = sc.nextDouble();
                double areaCircle = 3.14 * Math.pow(radius, 2);
                System.out.println(areaCircle);
                break;
        }

    }
}