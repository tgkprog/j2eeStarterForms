package tgk.forms.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
//import java.util.Date;
import java.util.List;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserDaoTest{
	UserDao dao ;
	
	@Before
	public void init(){
		dao = new UserDao();
	}
	
	@Test
	public void testAllUsers(){
		
		List<User> lst = dao.getAllUsers();
		//lst.get(0).getEmail();
		assertNotNull(lst);
		assertEquals("admin@gmail.com", lst.get(0).getEmail());
		assertEquals("admin", lst.get(0).getFirstName());
	}
}