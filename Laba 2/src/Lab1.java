import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point3d points[] = new Point3d[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите координаты точки (x, y, z): ");
            points[i] = new Point3d();
            points[i].setX(scanner.nextDouble());
            points[i].setY(scanner.nextDouble());
            points[i].setZ(scanner.nextDouble());
        }
        System.out.println(Point3d.computeArea(points[0], points[1], points[2]));
    }
}
