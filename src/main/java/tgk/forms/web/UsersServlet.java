
package tgk.forms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tgk.forms.dao.User;
import tgk.forms.service.BusinessProcor;

public class UsersServlet extends HttpServlet{
	BusinessProcor busProc;
	public UsersServlet (){
		busProc = new BusinessProcor();
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body> do post");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException{
		
		
		try {
			List<User> usrs = busProc.getAllUsers();
			req.setAttribute("usersLst", usrs );
            req.getRequestDispatcher("/l.jsp").forward(req, res);
        } catch (Exception e) {
            System.err.println("srv err " + e);
        }
		
	}
		
}
