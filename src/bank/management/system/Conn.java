package bank.management.system;

import java.sql.DriverManager;
import java.sql.*;
/**
 * Connecting Project with MySQL:
 * It has 5 Steps:
 * 1. Register the Driver.
 * 2. Create Connection.
 * 3. Create Statement.
 * 4. Execute Query.
 * 5. Close Connection.
 */
public class Conn {

    Connection c;
    Statement s;
    public Conn(){
        try{
//            no need to explicitly perform step 1 as it does on its own
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "mysqlpassword");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
