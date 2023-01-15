
import javax.swing.event.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
class Main extends JFrame implements ListSelectionListener
{

    static JFrame frame;
    static JFrame frame2;


    static JList b,b1;


    static JLabel l1;
    static List<Cars> list = new LinkedList<>();



    public static void main(String[] args)
    {

        frame = new JFrame("choose car");
        frame2 = new JFrame("chosen car");


        Main s=new Main();


        JPanel p =new JPanel();
        JPanel p1 = new JPanel();


        JLabel l= new JLabel("choose car");
        l1= new JLabel();


        Cars car1 = new Cars("Audi", "A7", 2012, "luka ushveridze");
        Cars car2 = new Cars("Audi", "RS", 2012, "luka ushveridze");
        Cars car3 = new Cars("BMW", "500", 1997, "luka ushveridze");
        Cars car4 = new Cars("Subaru", "Forester", 1997, "luka ushveridze");
        Cars car5 = new Cars("Subaru", "Impreza", 2006, "luka ushveridze");
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        String[] array = {"Car one", "Car two", "Car three", "Car four", "Car five"};



        b= new JList(array);
        b.setSelectedIndex(0);

        l1.setText(list.get(b.getSelectedIndex()).toString());

        b.addListSelectionListener(s);

        p.add(l);
        p.add(b);
        p.add(l1);
        p1.add(l1);

        frame.add(p);

        frame.setSize(500,500);
        frame2.setSize(800,800);
        frame2.add(p1);

        frame.show();

    }
    public void valueChanged(ListSelectionEvent e)
    {

        l1.setText(list.get(b.getSelectedIndex()).toString());
        frame2.show();

    }
}
