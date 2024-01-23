// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(5);
        System.out.println("Số lượng các hình tròn được tạo ra : " + Circle.getCount());
        System.out.println("Diện tích của hình tròn có bán kình bằng " + circle1.radius + " là " + circle1.getArea());
        System.out.println("Diện tích của hình tròn có bán kình bằng " + circle2.radius + " là " + circle2.getArea());

        Circle.setMaxRadius(circle2.radius);
        System.out.println(" Hình tròn có bán kính lớn nhất bằng : " + Circle.getMaxRadius());
        System.out.println(" Tổng diện tích các hình tròn là : " + Circle.getTotalArea());
    }
}