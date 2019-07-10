import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class DrawBullEye extends JPanel
{
    public void paintComponent(Graphics g)
    {
        Random rd = new Random();
        super.paintComponent(g);
        for(int i=1; i<=5; i++)
        {
            int a = 1+ rd.nextInt(255);
            int b = 1+ rd.nextInt(255);
            int c = 1+ rd.nextInt(255);
            Color cl = new Color(a,b,c);
            g.setColor(cl);
            g.fillOval(50 + i*20, 50 + i*20, 200 - i*40, 200 - i*40);
        }
    }
}
