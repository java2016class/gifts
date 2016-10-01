package tw.youth.project.gift2016;

import java.sql.SQLException;

import tw.youth.project.gift2016.sql.Operation;

public class PresentSystem {

	public static void main(String[] args) {

	}

	public synchronized boolean login(String name, String password) {
		return new Operation("localhost", name, password).chkLogin();
	}

	public synchronized boolean logout() {
		if (Operation.conn != null) {
			try {
				Operation.conn.close();
			} catch (SQLException e) {
				System.out.println("SQLException : " + e.getMessage());
			}
			Operation.conn = null;
		}
		return Operation.conn == null;
	}
}
