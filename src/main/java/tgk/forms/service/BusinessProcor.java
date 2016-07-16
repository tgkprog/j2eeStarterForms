package tgk.forms.service;

import java.util.List;

import tgk.forms.dao.User;
import tgk.forms.dao.UserDao;

public class BusinessProcor {
	UserDao usrDao = new UserDao();
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
	
	public List<User> getAllUsers() {
		
		return usrDao.getAllUsers();
		
	}
}