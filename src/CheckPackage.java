import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    CheckPackage(){
        setBounds(450,200,900,600);

        String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance","Full Day City Tour","Daily Buffet","Hard Drinks Free","Full Day 3 Island Cruise","English Speaking Guide","BOOK PACKAGE","SUMMER SPECIAL","Rs 32000/-","package1.jpg"};
        String[] package2 = {"SILVER PACKAGE","5 Days and 6 Nights","Toll Free Tickets","Complimentary Foods","Meet and Greet at airport","Welcome Drinks on Arrival","Night Safari","Cruise with Dinner","BOOK PACKAGE","WINTER SPECIAL","Rs 24000/-","package2.jpg"};
        String[] package3 = {"BRONZE PACKAGE","4 Days and 5 Nights","Return Airfare","Free Clubbing & various games","Karaoke Concert","Soft Drinks Free","Daily Buffet","BBQ Dinner","BOOK PACKAGE","MONSOON SPECIAL","Rs 12000/-","package3.jpg"};

        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);

        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);

        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);

        add(tab);

        setVisible(true);
    }

    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));

        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(310,10 ,300,30);
        l1.setForeground(Color.YELLOW);
        l1.setFont(new Font("Monospaced", Font.BOLD,30));
        p1.add(l1);

        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(40,70 ,300,30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Script", Font.BOLD,20));
        p1.add(l2);

        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(40,120 ,300,30);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Script", Font.BOLD,20));
        p1.add(l3);

        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(40,170 ,300,30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Script", Font.BOLD,20));
        p1.add(l4);

        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(40,220 ,300,30);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Script", Font.BOLD,20));
        p1.add(l5);

        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(40,270 ,300,30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Script", Font.BOLD,20));
        p1.add(l6);

        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(40,320 ,300,30);
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Script", Font.BOLD,20));
        p1.add(l7);

        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(40,370 ,300,30);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Script", Font.BOLD,20));
        p1.add(l8);

        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(60,430 ,300,30);
        l9.setForeground(Color.MAGENTA);
        l9.setFont(new Font("Script", Font.BOLD,30));
        p1.add(l9);

        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(60,480 ,300,30);
        l10.setForeground(Color.ORANGE);
        l10.setFont(new Font("Script", Font.BOLD,25));
        p1.add(l10);

        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(520,450 ,300,30);
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("Script", Font.BOLD,25));
        p1.add(l11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(340,90,500,300);
        p1.add(image);

        return p1;
    }

    public static void main(String[] args) {
        new CheckPackage();
    }
}
