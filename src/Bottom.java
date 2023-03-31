import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Bottom extends JButton {

    public Date date;
    public boolean title;

    public Bottom(){
        setContentAreaFilled(false);
        setBorder(null);
    }

    public void asTitle(){
        title=true;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public boolean isTitle(){
        return title;
    }

    public void correctMonth(boolean act){
        if(act){
            setForeground(new Color(68,68,68));
        }else{
            setForeground(new Color(169,169,169));
        }
    }


}
