package jweb.p.a.a103.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jweb.p.a103.dao.PersonalDAO;

@WebServlet(name = "/RegisterPersonalController", urlPatterns = "/resgister")
public class RegisterPersonalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterPersonalController() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String fisrtNam=request.getParameter("fisrtname");
		String lastName= request.getParameter("lastname");
		String gender= request.getParameter("gender");
		String phone=request.getParameter("telephone");
		String email= request.getParameter("email");
	
		String description=request.getParameter("description");
		String[] Loca = request.getParameterValues("Location");
		String location=Loca[0];
		String[] checkboxHobbies= request.getParameterValues("check-hobbies");
		String hobbies="";
		for(int i=0; i<checkboxHobbies.length;i++) {
			
			hobbies=hobbies+", "+checkboxHobbies[i];
		}
		String  hobbie= hobbies.substring(2, hobbies.length());
		PersonalDAO.insertPresonal(fisrtNam,lastName,gender,phone,email,hobbie,description,location);
		request.setAttribute("msgregister","Đăng kí thành công");
		RequestDispatcher rd = request.getRequestDispatcher("VisitorInfo.jsp");
		rd.forward(request,response);
	}

}
