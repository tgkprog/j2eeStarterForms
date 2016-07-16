package tgk.forms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public List<User> getAllUsers(){
		
		List<User> usrs = new ArrayList<>();
		Connection con = null;
		try {
			con = tgk.forms.dao.ConUtl.getCon();
			Statement st= con.createStatement();
		    
		    ResultSet rs=st.executeQuery("select fname, lname,email from User");
		    
		    String dbtime;
		    
		    while(rs.next())
		    {
		        //out.println("Value is:"+rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4));  
		        User user = new User();
		        user.setEmail(rs.getString("email"));
		        user.setFirstName(rs.getString("fname"));
		        user.setLastName(rs.getString("lname"));
		        usrs.add(user);
		    }  
		} catch (Exception e) {
			// TODO: handle exception log4j
			System.err.println("err dao  " + e);
			e.printStackTrace();
		}finally{
			ConUtl.close(con);
		}
		return usrs;
		
	}
	
	public boolean validateAge(String strAge, int type) {
		int age = -1;
		if (strAge != null && strAge.length() > 0) {
			try {
				age = Integer.parseInt(strAge);
				if (age < 19 && type > 3) {
					return false;
				}
				return true;

			} catch (Exception e) {
				// iggy
			}
		}
		return false;

	}
}