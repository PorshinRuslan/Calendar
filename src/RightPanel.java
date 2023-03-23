import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    public RightPanel(){

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
//        setLayout(new GridLayout(3,1));
        init();
    }

    public void init(){
        add(new TopPanel());
        add(new DatePanel(3,2023));
        add(new DownPanel());
    }
}
