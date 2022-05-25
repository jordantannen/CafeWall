import java.awt.*;

public class Doodle {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(1000, 1000);
        Graphics g = panel.getGraphics();

        panel.setBackground(Color.white);

        g.draw3DRect(500,500,100,100,true);

        g.setColor(Color.red);
        g.drawString("Hello",20,30);

        g.setColor(Color.green);
        g.drawOval(800,600,300,400);
    }
}
