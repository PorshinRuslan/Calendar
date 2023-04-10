import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TopPanel extends JPanel {

    Bottom[] mass_b = new Bottom[4];
    String[] s = {"Year", "<","Month",">"};

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
            mass_b[i].asTitle();
            mass_b[i].setText(s[i]);
        }
    }

    public void showDate(int month, int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        SimpleDateFormat sd_month = new SimpleDateFormat("MMMM");
        SimpleDateFormat sd_year = new SimpleDateFormat("yyyy");
        mass_b[0].setText(sd_year.format(calendar.getTime()));
        mass_b[2].setText(sd_month.format(calendar.getTime()));
    }

}
