import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

public class Bottom extends JButton {

    public Date date;
    public boolean title;
    public boolean toDay;
    public boolean enter;
    public boolean activ;

    public Color c_1 = new Color(68,68,68);
    public Color c_2 = new Color(168,168,168);

    public Bottom(){
        setContentAreaFilled(false);
        setBorder(null);
        bottomAction();
    }

    public void asTitle(){
        title=true;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public void toDay(){
        setForeground(Color.WHITE);
        toDay = true;
    }

    public boolean isTitle(){
        return title;
    }

    public void correctMonth(){
        if(activ){
            //setForeground(new Color(68,68,68));
            setForeground(c_1);
        }else{
            //setForeground(new Color(169,169,169));
            setForeground(c_2);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (toDay && !title || enter && !title) {

            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(Color.decode("#483D8B"));
            g2.fillOval(13,7,30,30);
        }
        super.paintComponent(g);
    }

    public void bottomAction(){
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(!title) {
                    setForeground(Color.WHITE);
                    enter = true;
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                enter = false;
                if(activ || title){
                    setForeground(c_1);
                }else{
                    setForeground(c_2);
                }
            }
        });
    }

}
