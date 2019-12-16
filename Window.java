import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private Convex c;


    Window(Convex c) {
        setSize(800,800);
        setVisible(true);
        setTitle("Figures");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.c = c;
    }
    @Override
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D)g1;
        int x = getWidth()/2;
        int y = getHeight()/2;
        int l1=10*2;
        int l2=20*2;
        g.translate(getWidth()/2, getHeight()/2);
        g.rotate(-Math.PI/2);
        g.setColor(Color.white);
        g.fillRect(-getWidth()/2, -getHeight()/2, getWidth(), getHeight());
        Color pColor = new Color(163, 159, 196);
        g.setColor(pColor);
        g.setColor(new Color(75, 88, 88, 174));
        g.fillOval(-Polygon.l1/5, -Polygon.l1/5, Polygon.l1*2/5, Polygon.l1*2/5);
        g.setColor(new Color(244, 255, 248, 255));
        g.fillOval (-l1/2, -l1/2, l1, l1);
        g.setColor(new Color(66, 43, 64, 255));
        g.drawLine(-getWidth()/2, 0, getWidth()/2, 0);
        g.drawLine(0, -getHeight()/2, 0, getHeight()/2);
        g.setColor(new Color(135, 0, 30));
        c.draw(g);


    }
    public void paint(){
        paint(getGraphics());
    }

}
