import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    Bottom[] mass_b = new Bottom[4];
    String[] s = {"Mounth", "<","year",">"};

    public TopPanel(){

        setPreferredSize(new Dimension(400,50));
        setMaximumSize(new Dimension(400,50));
        setLayout(new GridLayout(1,4));
        init();
    }

    public void init(){
        for(int i=0; i<mass_b.length; i++){
            mass_b[i] = (new Bottom());
            add(mass_b[i]);
            mass_b[i].setText(s[i]);
        }
    }
}
