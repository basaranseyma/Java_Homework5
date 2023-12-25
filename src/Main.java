import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, alpha, pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle: ");
        r = inp.nextDouble();
        System.out.print("Please enter the measure of the central angle: ");
        alpha = inp.nextDouble();
        double area = ((pi * (r * r)) * (alpha / 360));

        System.out.println("Area of the circle: " + area);
    }
}