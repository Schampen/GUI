import javax.swing.*;
import java.awt.*;

public class Grafik extends Canvas {

    public Grafik() {
        setSize(800,600);
        JFrame frame = new JFrame("Grafik");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        ritaGubbe(100,100, g);
        ritaHus(200,200, g);
        ritaTrad(400, 400, g);
    }

    private void ritaTrad(int x1, int y1, Graphics g) {
        g.setColor(new Color(0x994E0A));
        g.fillRect(x1,y1,60,200);
        g.setColor(new Color(0x468B26));
        int[] x = new int[3];
        int[] y = new int[3];
        int n;
        x[0]=x1+30; x[1]=x1-70; x[2]=x1+130;
        y[0]=y1; y[1]=y1+100; y[2]=y1+100;
        n = 3;

        for (int i = 0; i < 5 ; i++) {
            Polygon p = new Polygon(x, y, n);
            g.fillPolygon(p);
            x[1] = x[1] + 10;
            x[2] = x[2] - 10;
            y[0] = y[0] - 50;
            y[1] = y[1] - 50;
            y[2] = y[2] - 50;

        }


    }

    private void ritaHus(int x, int y, Graphics g) {
        g.drawRect(x,y,250,200);
        g.drawLine(x,y,x+125,y-100);
        g.drawLine(x+250,y,x+125,y-100);
        g.drawRect(x+50,y+100,50,100);
        g.drawOval(x+80,y+150,15,5);
        g.drawRect(x+140,y+50,75,75);
        g.drawLine(x+178,y+50,x+178,y+125);
        g.drawLine(x+140,y+87,x+215,y+87);
    }

    private void ritaGubbe(int x, int y, Graphics g) {
        g.setColor(new Color(0));
        g.drawOval(x,y,30,30);
        g.drawLine(x+15,y+30,x+15,y+80);
        g.drawLine(x+15,y+35,x,y+70);
        g.drawLine(x+15,y+35,x+30,y+70);
        g.drawLine(x+15,y+80,x+5,y+110);
        g.drawLine(x+15,y+80,x+25,y+110);
    }

    public static void main(String[] args) {
        Grafik test = new Grafik();

    }
}
