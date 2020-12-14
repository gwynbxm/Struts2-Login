/**
 * 
 */
package ase.gp3.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import ase.gp3.utils.DbConnect;

/**
 * Programmer: Gwyn Bong Xiao Min
 * Date created: 14 Dec 2020, 7:40:20 pm
 * Date modified: 14 Dec 2020, 7:40:20 pm
 */
public class DbConnect {
	public static Connection getSqlConnection() throws Exception {
		Connection con = null;
		Properties prop = new Properties();
		InputStream inputStrm = DbConnect.class.getClassLoader().getResourceAsStream("properties.properties");

		try {
			prop.load(inputStrm);
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + 
											prop.getProperty("db.schema"), 
											prop.getProperty("db.username"), 
											prop.getProperty("db.password"));
		} catch (SQLException s) {
			System.out.println("SQLException: Unable to open connection: " + s.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to open connection: " + e.getMessage());
		}
		return con;
	}
}
