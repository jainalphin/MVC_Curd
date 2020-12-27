package com.duo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.model.User;
import com.utill.DBConnection;

public class RegisterDuo {
			Connection con =null;
			int x=0;
	public int doRegisterData(User user) {
		try {
			con = new DBConnection().getConnection();
			PreparedStatement st =con.prepareStatement("insert into details(fname,lname,uname,password) values(?,?,?,?)");
			st.setString(1, user.getFname());
			st.setString(2, user.getLname());
			st.setString(3, user.getUname());
			st.setString(4, user.getPass());
			System.out.println("done............");
			x = st.executeUpdate();
			
			} catch (Exception e) {
			e.printStackTrace();
		}
	return x;	
	}
}
