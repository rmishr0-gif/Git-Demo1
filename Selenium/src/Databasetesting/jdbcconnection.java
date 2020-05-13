package Databasetesting;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Connection;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
// TODO Auto-generated method stub
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root",
				"root");

		Statement s = con.createStatement();
	ResultSet rs=	s.executeQuery("Select *from employeeinfo");
	
	
	while(rs.next())
	{	
System.out.println(rs.getString("name"));
System.out.println(rs.getString("id"));
	}


	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	
	}

}
