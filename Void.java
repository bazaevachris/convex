import java.awt.*;

public class Void implements Figure {
    public double perimeter() {
        return 0.0;
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point p) {
        if (R2Point.inside(p))
            R2Point.col++;
        return new Point(p);
    }
    public  void draw(Graphics2D g){
    }
    public int cl(){return R2Point.col;}
}
