<%@ page import="java.util.List,tgk.forms.dao.User" %>
<%

List <User>lst = (List <User>)request.getAttribute("usersLst");
for(int i =0;i < lst.size();i++){
	out.print("<br> " + lst.get(i).getFirstName() + " " + lst.get(i).getEmail());
}
%>>