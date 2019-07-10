import javax.swing.JFrame;

public class DrawBullEyeTest
{
    public static void main(String[] args)
    {
        DrawBullEye panel = new DrawBullEye();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230,250);
        app.setVisible(true);
    }
}
