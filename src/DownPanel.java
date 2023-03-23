import javax.swing.*;
import java.awt.*;

public class DownPanel extends JPanel {

    public DownPanel(){

        setLayout(new GridLayout(1,4));
        setPreferredSize(new Dimension(400,100));
        setMaximumSize(new Dimension(400,1000));
    }
}
