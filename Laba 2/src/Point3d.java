public class Point3d {

    private double xCoord;
    private double yCoord;
    private double zCoord;

    //Конструктор по умолчанию.
    public Point3d() {
        this.xCoord = 0.0;
        this.yCoord = 0.0;
        this.zCoord = 0.0;
    }

    //Конструктор инициализации.
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    //Геттеры.
    public double getX() {
        return xCoord;
    }
    public double getY() {
        return yCoord;
    }
    public double getZ() {
        return zCoord;
    }

    //Сетеры.
    public void setX(double x) {
        this.xCoord = x;
    }
    public void setY(double y) {
        this.yCoord = y;
    }
    public void setZ(double z) {
        this.zCoord = z;
    }

    //Метод сравнения двух объектов Point3d.
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        Point3d coords = (Point3d) obj;
        return this.xCoord == coords.xCoord && this.yCoord == coords.yCoord && this.zCoord == coords.zCoord;
    }

    //Метод возращает расстояние между двумя точками.
    public double distanceTo(Point3d obj) {
        double distance = Math.sqrt(Math.pow(obj.xCoord - xCoord, 2) + Math.pow(obj.yCoord - yCoord, 2) + Math.pow(obj.zCoord - zCoord, 2));
        return Math.round(distance * 100.0) / 100.0;
    }

    //Метод возращает площадь треулольника.
    static public double computeArea(Point3d f, Point3d s, Point3d t) {
        double a = f.distanceTo(s);
        double b = s.distanceTo(t);
        double c = t.distanceTo(f);

        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b)  * (p - c));
        return result;
    }
}
