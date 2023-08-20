public class App {
    public static double area(double radius) {
        // Calculate the area using the formula A = pi * r^2
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        double radius = 1.0;
        double circleArea = (area(radius));
        System.out.println("The area of the circle with radius " + radius + " is: " + circleArea);
    }
}