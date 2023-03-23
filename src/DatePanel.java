import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class DatePanel extends JPanel {

    int month;
    int year;

    Bottom[] mass_b = new Bottom[49];
    String[] s = {"Пон", "Вт", "Ср", "Чт", "Пн", "<html><font color=\"red\">Сб</font></html>", "<html><font color=\"red\">Вс</font></html>"};

    public DatePanel(int month, int year){

        setPreferredSize(new Dimension(400,250));
        setMaximumSize(new Dimension(400,250));
        setLayout(new GridLayout(7,7));

        this.month = month;
        this.year = year;
        init();
        setDate();
    }

    public void init(){
        for(int i=0; i<mass_b.length; i++){
            mass_b[i] = new Bottom();
            add(mass_b[i]);
        }
        for(int i=0; i<7; i++){
            mass_b[i].setText(s[i]);
            mass_b[i].asTitle();
        }
    }

    public void setDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK)-2;
        calendar.add(Calendar.DATE, -startDay);
        for(int i=0; i<mass_b.length; i++){
            if(!mass_b[i].isTitle()){
                mass_b[i].setText(calendar.get(Calendar.DATE) + "");
                mass_b[i].setDate(calendar.getTime());
                mass_b[i].correctMonth(calendar.get(Calendar.MONTH)==month-1);
                calendar.add(Calendar.DATE,1);
            }
        }
    }
}
