import javax.swing.*;
import java.awt.*;

public class CenterPane extends JPanel {

    public CenterPane(){
        setPreferredSize(new Dimension(400,300));
        setMaximumSize(new Dimension(400,300));
    }

    public void showDatePanel(int month, int year){
        removeAll();
        revalidate();
        add(new DatePanel(month,year));
    }
}
