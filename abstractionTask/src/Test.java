public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.4,5.2);

        Circle circle = new Circle(3.4);

        circle.calculateArea();
        System.out.println("Circle1: " + circle.toString());

        System.out.println();

        rectangle.calculateArea();
        System.out.println("Rectangle1: " + rectangle.toString());
    }
}
