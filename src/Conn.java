import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    Conn(){
        try {  // exception handling because DB is external
            Class.forName("com.mysql.cj.jdbc.Driver");//for initialising the driver
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "Puru2001");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
