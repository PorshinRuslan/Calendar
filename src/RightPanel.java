import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RightPanel extends JPanel {

    ArrayList<JPanel> list = new ArrayList();

    public RightPanel(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        list.add(new TopPanel());
        list.add(new DatePanel(3,2023));
        list.add(new DownPanel());
        init();
    }

    public void init(){

        for(int i=0; i<list.size(); i++){
            add(list.get(i));
        }

//        add(new TopPanel());
//        add(new DatePanel(3,2023));
//        add(new DownPanel());

    }
}
