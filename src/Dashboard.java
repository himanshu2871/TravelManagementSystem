import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton addPersonalDetails, viewPersonalDetails,updatePersonalDetails,checkPackages,bookPackages,viewPackages,
            viewHotels,destinations,bookHotels,viewBookedHotel,payments,calculator,notepad,about;
    String username;
    Dashboard(String username){
        this.username = username;
       // setBounds(0,0,1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH); //opens the frame in full screen
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1920,75);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(85,20,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,75,350,1005);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,350,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Details");
        updatePersonalDetails.setBounds(0,50,350,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.addActionListener(this);
        //updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,350,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,350,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        //deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);

        checkPackages = new JButton("Check Package");
        checkPackages.setBounds(0,200,350,50);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        //checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);

        bookPackages = new JButton("Book Package");
        bookPackages.setBounds(0,250,350,50);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackages.addActionListener(this);
        //bookPackages.setMargin(new Insets(0,0,0,120));
        p2.add(bookPackages);

        viewPackages = new JButton("View Package");
        viewPackages.setBounds(0,300,350,50);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackages.addActionListener(this);
        //viewPackages.setMargin(new Insets(0,0,0,120));
        p2.add(viewPackages);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,350,350,50);
        viewHotels.setBackground(new Color(0,0,102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewHotels.addActionListener(this);
        //viewHotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewHotels);

        bookHotels = new JButton("Book Hotel");
        bookHotels.setBounds(0,400,350,50);
        bookHotels.setBackground(new Color(0,0,102));
        bookHotels.setForeground(Color.WHITE);
        bookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookHotels.addActionListener(this);
        //bookHotels.setMargin(new Insets(0,0,0,140));
        p2.add(bookHotels);

        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,450,350,50);
        viewBookedHotel.setBackground(new Color(0,0,102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.addActionListener(this);
        //viewBookedHotel.setMargin(new Insets(0,0,0,70));
        p2.add(viewBookedHotel);

        destinations = new JButton("Destinations");
        destinations.setBounds(0,500,350,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.addActionListener(this);
        //destinations.setMargin(new Insets(0,0,0,125));
        p2.add(destinations);

        payments = new JButton("Payments");
        payments.setBounds(0,550,350,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.addActionListener(this);
        //payments.setMargin(new Insets(0,0,0,155));
        p2.add(payments);

        calculator = new JButton("Calculator");
        calculator.setBounds(0,600,350,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.addActionListener(this);
        //calculator.setMargin(new Insets(0,0,0,145));
        p2.add(calculator);

        notepad = new JButton("Notepad");
        notepad.setBounds(0,650,350,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.addActionListener(this);
        //notepad.setMargin(new Insets(0,0,0,155));
        p2.add(notepad);

        about = new JButton("About");
        about.setBounds(0,700,350,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.addActionListener(this);
        //about.setMargin(new Insets(0,0,0,175));
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(150,0,1920,1080);
        add(image);

        JLabel text = new JLabel("Travel & Tourism Management System");
        text.setBounds(700,70,1000,85);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,40));
        image.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        }else if (ae.getSource() == checkPackages){
            new CheckPackage();
        } else if (ae.getSource() == bookPackages) {
            new BookPackage(username);
        } else if (ae.getSource() == viewPackages) {
            new ViewPackage(username);
        } else if (ae.getSource() == viewHotels) {
            new CheckHotels();
        } else if (ae.getSource() == destinations) {
            new Destinations();
        } else if (ae.getSource() == bookHotels){
            new BookHotel(username);
        } else if (ae.getSource() == viewBookedHotel) {
            new ViewBookedHotel(username);
        } else if (ae.getSource() == payments) {
            new Payment();
        } else if (ae.getSource() == calculator) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource() == notepad) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource() == about) {
            new About();
        }
    }

    public static void main(String[] args) {
        new Dashboard("");
    }
}
