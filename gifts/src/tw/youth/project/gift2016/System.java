package tw.youth.project.gift2016;

import tw.youth.project.gift2016.sql.Operation;

public class System {

	public static void main(String[] args) {

	}

	public boolean isLogin(String name, String password) {
		return new Operation("localhost", name, password).chkLogin();
	}
}
