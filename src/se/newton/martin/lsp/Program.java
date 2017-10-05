package se.newton.martin.lsp;

public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println(rectangle.area());

        Square square = new Square();
        square.setHeight(10);
        System.out.println(square.area());

        Rectangle rectangle2 = new Square();

        rectangle2.setWidth(10);
        rectangle2.setHeight(20);
        System.out.println(rectangle2.area());


    }
}
