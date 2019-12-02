import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
 
public class AmericanFlag extends JPanel {
 
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
 
    double height = super.getSize().getHeight();;
    double width = super.getSize().getWidth();
 
    double rw = .6 * width;
    double xc = .4 * width;
 
    g2.setPaint(Color.BLUE);
    g2.fill(new Rectangle2D.Double(0, 0, .4 * width, .53846 * height));
 
    for (int i = 0; i < 13; i++) {
      if (i == 7) {
        xc = 0;
        rw = width;
      }
 
      if (i % 2 == 0) {
        g2.setPaint(Color.RED);
      } else {
        g2.setPaint(Color.WHITE);
      }
 
      g2.fill(new Rectangle2D.Double(xc, i * .0769 * height, rw, .0769 * height));
    }
 
    double x[] = {
      .0002105 * width, .0126 * width, .0163 * width, .02 * width, .0324 * width,
      .0217 * width, .02574 * width, .0163 * width, .0069 * width, .0109 * width
    };
    double y[] = {
      .02 * height, .02 * height, 0, .02 * height, .02 * height, 
      .03 * height, .05 * height, .04 * height, .05 * height, .03 * height
    };
 
    GeneralPath star = new GeneralPath();
 
    star.moveTo((float) x[0], (float) y[0]);
 
    for (int i = 1; i < x.length; i++) {
      star.lineTo((float) x[i], (float) y[i]);
    }
 
    star.closePath();
 
    g2.translate(.017 * width, .0232 * height);
    g2.setPaint(Color.WHITE);
    g2.fill(star);
 
    for (int i = 0; i < 5; i++) {
      g2.translate(.066316 * width, 0);
      g2.fill(star);
    }
 
    for (int i = 0; i < 4; i++) {
      g2.translate(-.03316 * width, .054 * height);
      g2.fill(star);
 
      for (int j = 0; j < 4; j++) {
        g2.translate(-.066316 * width, 0);
        g2.fill(star);
      }
 
      g2.translate(-.03316 * width, .054 * height);
      g2.fill(star);
 
      for (int k = 0; k < 5; k++) {
        g2.translate(.066316 * width, 0);
        g2.fill(star);
      }
    }
  }
 
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("American Flag");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.white);
    frame.setSize(350, 250);
 
    AmericanFlag panel = new AmericanFlag();
 
    frame.add(panel);
    frame.setVisible(true);
  }
}