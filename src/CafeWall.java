import java.awt.*;
public class CafeWall {

    public static int mortar = 2;

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(650, 400);
        Graphics g = panel.getGraphics();;

        panel.setBackground(Color.gray);
        makeRow(0,0,20,4, g);
        makeRow(50,70,30,5, g);

        makeGrid(250, 200, 25, 3, 10, g);
        makeGrid(10, 150, 25, 4,0, g);
        makeGrid(425,180,20,5,10, g);
        makeGrid(400, 2, 35, 2, 35, g);
    }

    //Creates rows of boxes
    public static void makeRow(int x, int y, int boxSize, int totalPairs, Graphics g){
        for (int i = 0; i < totalPairs ; i++){
            g.setColor(Color.black);
            g.fillRect(x, y, boxSize, boxSize);
            g.setColor(Color.blue);
            g.drawLine(x, y, x + boxSize, y + boxSize);
            g.drawLine(x , y + boxSize, x + boxSize, y );
//            x += boxSize;
            g.setColor(Color.white);
            g.fillRect(x + boxSize, y, boxSize, boxSize);
            x += boxSize * 2;
        }
    }

    // Creates the grid
    public static void makeGrid(int x, int y, int boxSize, int pairsPerRow, int rowOffset, Graphics g){
        for (int i = 0; i < pairsPerRow * 2; i++){
                makeRow(x + (i % 2) * rowOffset, y, boxSize, pairsPerRow, g);
                // Each y coordinate is an entire box plus the mortar below the previous
                y += boxSize + CafeWall.mortar;
        }
    }
}
