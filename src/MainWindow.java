import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MainWindow extends JFrame{

    JFrame jf;

    JPanel jleft = new JPanel();
    JPanel jright = new JPanel();
    JPanel jTop = new JPanel();
    JPanel jCenter = new JPanel();
    JPanel jDown = new JPanel();

    Bottom[] bTop = new Bottom[4];
    Bottom[] bCenter = new Bottom[49];
    String[] days = {"Пон", "Вт", "Ср", "Чт", "Пн", "<html><font color=\"red\">Сб</font></html>", "<html><font color=\"red\">Вс</font></html>"};

    private int month;
    private int year;

    public MainWindow(int month, int year) {

        jf = new JFrame("I must");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(600, 400);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.X_AXIS));
        jf.setVisible(true);

        this.month = month;
        this.year = year;

        jleft();
        jright();
    }

    public void jleft(){
        jf.add(jleft);
        jleft.setBackground(Color.decode("#483D8B"));
        jleft.setPreferredSize(new Dimension(200,400));
        jleft.setMaximumSize(new Dimension(200,400));
    }

    public void jright(){
        jf.add(jright);
        jright.setLayout(new BoxLayout(jright, BoxLayout.Y_AXIS));

        jright.add(jTop);
        jTop.setPreferredSize(new Dimension(400,50));
        jTop.setMaximumSize(new Dimension(400,50));

        jTop.setLayout(new GridLayout(1,4));
        massBotton(bTop,4);
        addBotton(bTop, jTop);
        bTop[0].setText("Mounth");
        bTop[1].setText("<");
        bTop[2].setText("year");
        bTop[3].setText(">");

        jright.add(jCenter);
        jCenter.setPreferredSize(new Dimension(400,250));
        jCenter.setMaximumSize(new Dimension(400,250));

        jCenter.setLayout(new GridLayout(7,7));
        massBotton(bCenter,49);
        addBotton(bCenter, jCenter);
        addWeek();
        setDate();


        jright.add(jDown);
        jDown.setPreferredSize(new Dimension(400,100));
        jDown.setMaximumSize(new Dimension(400,1000));
    }

    public void massBotton(Bottom[] but, int x){
        for(int i=0; i<x; i++){
            but[i] = new Bottom();
        }
    }

    public void addBotton(Bottom[] but, JPanel pan){
        for(int i=0; i<but.length; i++){
            pan.add(but[i]);
        }
    }

    public void addWeek(){
        for(int i=0; i<7; i++){
            bCenter[i].setText(days[i]);
            bCenter[i].asTitle();
        }
    }

    public void setDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK)-2;
        calendar.add(Calendar.DATE, -startDay);
        for(int i=0; i<bCenter.length; i++){
            if(!bCenter[i].isTitle()){
                bCenter[i].setText(calendar.get(Calendar.DATE) + "");
                bCenter[i].setDate(calendar.getTime());
                bCenter[i].correctMonth(calendar.get(Calendar.MONTH)==month-1);
                calendar.add(Calendar.DATE,1);
            }
        }
    }



}
