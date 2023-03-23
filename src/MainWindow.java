import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MainWindow extends JFrame{

    JFrame jf;

    JPanel jleft = new JPanel();


    public MainWindow() {

        jf = new JFrame("I must");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(600, 400);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.X_AXIS));
        jf.setVisible(true);

        jleft();
        jf.add(new RightPanel());
    }

    public void jleft(){
        jf.add(jleft);
        jleft.setBackground(Color.decode("#483D8B"));
        jleft.setPreferredSize(new Dimension(200,400));
        jleft.setMaximumSize(new Dimension(200,400));

    }

}
