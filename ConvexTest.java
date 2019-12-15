import java.util.Scanner;
public class ConvexTest {
    public static void main(String[] args) throws Exception {
        Convex convex = new Convex();
        Window w = new Window(convex);
        while (true) {
            try {
                convex.add(new R2Point());
                w.paint();
            }
            catch(Exception ex) {
                break;
            }
            System.out.println("S = " + convex.area() + " , P = " + convex.perimeter() + " , Колличество точек в кольце: " + convex.cl());
        }

    }
}