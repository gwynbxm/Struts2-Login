/**
 * 
 */
package ase.gp3.utils;

import java.io.*;
import java.sql.*;
import java.util.*;

import ase.gp3.utils.DbConnect;

/**
 * Programmer: Gwyn Bong Xiao Min
 * Date created: 14 Dec 2020, 7:40:20 pm
 * Date modified: 19 Dec 2020, 9:17:22 pm
 */
public class DbConnect {
	public static Connection getSqlConnection() throws Exception {
		Connection con = null;
		Properties prop = new Properties();
		InputStream inputStrm = DbConnect.class.getClassLoader().getResourceAsStream("properties");

		try {
			prop.load(inputStrm);
			Class.forName(prop.getProperty("driver")).newInstance();
			con = DriverManager.getConnection(prop.getProperty("jdbc") + 
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
