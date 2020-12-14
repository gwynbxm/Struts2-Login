/**
 * 
 */
package ase.gp3.model;

/**
 * Programmer: Gwyn Bong Xiao Min
 * Date created: 14 Dec 2020, 6:26:51 pm
 * Date modified: 14 Dec 2020, 6:26:51 pm
 */
public class User {
	private String username, password;
	
	public User () {
		
	}
	
	public User (String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
