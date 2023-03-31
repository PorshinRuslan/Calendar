import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class RightPanel extends JPanel {

    TopPanel topPanel = new TopPanel();
    CenterPane centerPanel= new CenterPane();

    int month;
    int year;

    public RightPanel(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        init();
    }

    public void init(){
        thisDate();

        add(topPanel);
        topPanel.showDate(month,year);
        bottomAction();

        add(centerPanel);
        centerPanel.showDatePanel(month,year);

        System.out.println(month);

    }

    public void thisDate(){
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
    }

    private void bottomAction() {

        topPanel.mass_b[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(month == 1){
                    month = 12;
                    year--;
                }else{
                    month--;
                }
                topPanel.showDate(month,year);
                //centerPanel.showDatePanel(month,year);
            }
        });

        topPanel.mass_b[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(month == 12){
                    month = 1;
                    year++;
                }else{
                    month++;
                    System.out.println(month);
                }
                topPanel.showDate(month,year);
                //centerPanel.showDatePanel(month,year);
            }
        });
    }




}


