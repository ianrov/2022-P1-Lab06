// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g) {
        // Draw Grid

        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);


        // Draw Random Lines

        for (int k = 0; k < 100; k++) {

            Random rand = new Random();

            int x1 = rand.nextInt(391) + 15;
            int y1 = rand.nextInt(286) + 15;
            int x2 = rand.nextInt(391) + 10;
            int y2 = rand.nextInt(286) + 10;

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            g.setColor(new Color(red,green,blue));
            g.drawLine(x1, y1, x2, y2);
        }

            // Draw Random Squares

        for (int k = 0; k < 100; k++) {

            Random rand = new Random();

            int x = rand.nextInt(340) + 400;
            int y = rand.nextInt(240) + 10;

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            g.setColor(new Color(red,green,blue));
            g.fillRect(x,y,50,50);
        }

            // Draw Random Circles

        for (int k = 0; k < 100; k++) {

            Random rand = new Random();

            int heightwidth = rand.nextInt(201);

            int x = rand.nextInt(390 - heightwidth) + 10;
            int y = rand.nextInt(289 - heightwidth) + 301;

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            g.setColor(new Color(red,green,blue));
            g.drawOval(x,y,heightwidth,heightwidth);

        }

            // Draw 3-D Box

        //Red Box

        g.setColor(Color.red);
        g.fillRect(600,400,100,100);

        //Green Box

        g.setColor(Color.green);

            Polygon Square = new Polygon();
            Square.addPoint(600,400);
            Square.addPoint(600,500);
            Square.addPoint(550,450);
            Square.addPoint(550,350);
            g.fillPolygon(Square);

        //Yellow Box

        g.setColor(Color.yellow);

            Polygon Polygon = new Polygon();
            Polygon.addPoint(600,400);
            Polygon.addPoint(550,350);
            Polygon.addPoint(650,350);
            Polygon.addPoint(650,400);

            g.fillPolygon(Polygon);


        //Blue Triangle

        g.setColor(Color.blue);

            Polygon Triangle = new Polygon();
            Triangle.addPoint(650,350);
            Triangle.addPoint(650,400);
            Triangle.addPoint(700,400);

            g.fillPolygon(Triangle);

    }
}



    
 