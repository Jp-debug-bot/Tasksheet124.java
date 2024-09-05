class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
    
    public void scale() {
        this.x /= 2;
        this.y /= 2;
    }
}

public class Tasksheet124 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Tasksheet124 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}

        }
    }
}
