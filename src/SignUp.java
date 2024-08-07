import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {

    JButton create,back;
    JTextField tfname, tfusername, tfpassword, tfanswer;
    Choice security;

    SignUp(){
        setBounds(540,200,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername =  new JLabel("Username :");
        lblusername.setBounds(30,20,125,25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 16));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(160,20,250,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lblname =  new JLabel("Name :");
        lblname.setBounds(30,70,125,25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 16));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(160,70,250,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblpassword =  new JLabel("Password :");
        lblpassword.setBounds(30,120,125,25);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(160,120,250,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        JLabel lblsecurity =  new JLabel("Security Question");
        lblsecurity.setBounds(30,170,125,25);
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 16));
        p1.add(lblsecurity);

        security = new Choice();
        security.setBounds(160,170,250,30);
        security.add("Birth Place");
        security.add("Favourite Color");
        security.add("Birth Year");
       // security.add("");
        p1.add(security);

        JLabel lblanswer =  new JLabel("Answer :");
        lblanswer.setBounds(30,220,125,25);
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 16));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(160,220,250,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(Color.BLACK);
        create.setFont(new Font("Tahoma", Font.BOLD, 14));
        create.setBounds(100,290,100,30);
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.setBounds(270,290,100,30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();

            String query = "insert into account values('"+username+"','"+name+"', '"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account created successfully");

                setVisible(false);
                new Login();
            }catch (Exception e){
                e.printStackTrace();
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
