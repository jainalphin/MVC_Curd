package com.duo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.User;
import com.utill.DBConnection;

public class LoginDuo 
{
	Connection con =null;
	public User getLogin(User umodel)
	{
		con=new DBConnection().getConnection();
		User user1=null;
		try
		{
			PreparedStatement rs=con.prepareStatement("select * from details where uname=? and password=?");
			/* System.out.println("state,mme...."); */
			rs.setString(1, umodel.getUname());
			rs.setString(2, umodel.getPass());
			ResultSet rr =rs.executeQuery();
			if(rr.next())
			{
				user1= new User();
				user1.setId(rr.getInt(1));
				user1.setFname(rr.getString(2));
				user1.setLname(rr.getString(3));
				user1.setUname(rr.getString(4));
				user1.setPass(rr.getString(5));
				 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return umodel;
	}

}
