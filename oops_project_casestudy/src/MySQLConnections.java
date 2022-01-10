import java.sql.*;
import java.util.List;



public class MySQLConnections {
    public static Connection getCon(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","root","");
		}
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
		return con;
	}
}
