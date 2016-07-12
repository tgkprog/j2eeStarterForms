
package tgk.forms.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tgk.forms.service.BusinessProcor;

public class FormsServlet extends HttpServlet{
	BusinessProcor busValidator;
	public FormsServlet (){
		busValidator = new BusinessProcor();
		
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
		String sage = req.getParameter("age");
		String name = req.getParameter("name");
		String q = req.getParameter("qry");
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		boolean vali = busValidator.validateAge(sage, 4);
		if(!vali || q == null || q.length() == 0){
			out.println("<h1>bad values</h1>");
		}else{
			out.println("<h1>Okay process</h1>");
			out.println("Query");
			out.println(q);
			out.println("<br>Age");
			out.println(sage);
			out.println("<br>name");
			out.println(name + ".");
			
		}	
		out.println("</body>");
		out.println("</html>");	
	}
}
