package a26_0721;

public class Rectangle {
    public static void main(String[] args) {
        final double WIDTH = 10.0;
        final double HEIGHT = 5.0;
        double area = (WIDTH * HEIGHT);
        double perimeter = (WIDTH + HEIGHT) * 2;

            System.out.println("가로: " + WIDTH);
            System.out.println("세로: " + HEIGHT);
            System.out.println("넓이: " + area);
            System.out.println("둘레: " + perimeter);
    }
}
