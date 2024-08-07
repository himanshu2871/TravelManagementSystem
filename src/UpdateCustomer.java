import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {

    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;

    UpdateCustomer(String username){
        setBounds(550,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,10,300,25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(50,50,150,25);
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(200,50,150,25);
        add(labelusername);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(50,90,150,25);
        add(lblid);

        tfid = new JTextField();
        tfid.setBounds(200,90,150,25);
        add(tfid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(50,130,150,25);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(200,130,150,25);
        add(tfnumber);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50,170,150,25);
        add(lblname);

        labelname = new JLabel();
        labelname.setBounds(200,170,150,25);
        add(labelname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(50,210,150,25);
        add(lblgender);

        tfgender = new JTextField();
        tfgender.setBounds(200,210,150,25);
        add(tfgender);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(50,250,150,25);
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(200,250,150,25);
        add(tfcountry);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50,290,150,25);
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200,290,150,25);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(50,330,150,25);
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(200,330,150,25);
        add(tfphone);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(50,370,150,25);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200,370,150,25);
        add(tfemail);

        add = new JButton("Update");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(80,430,100,25);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200,430,100,25);
        back.addActionListener(this);
        add(back);

//        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
//        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel Image = new JLabel(i3);
//        Image.setBounds(390,70,500,300);
//        add(Image);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while (rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));


            }
        }catch(Exception e){
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();

            try{
                Conn c = new Conn();
                String query = "update customer set username = '"+username+"', id =  '"+id+"', number = '"+number+"', name = '"+name+"', gender = '"+gender+"', country = '"+country+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"'";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateCustomer("");
    }
}

