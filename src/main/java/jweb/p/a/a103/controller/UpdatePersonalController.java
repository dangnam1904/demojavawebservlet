package jweb.p.a.a103.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jweb.p.a103.dao.PersonalDAO;

@WebServlet(name= "/UpdatePersonalController", urlPatterns = "/Personal")
public class UpdatePersonalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdatePersonalController() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action= request.getParameter("action");
	
		int person_id=Integer.parseInt(request.getParameter("personal_id"));
		
		if(action.equalsIgnoreCase("update")) {
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
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			PersonalDAO.updatePresonal(fisrtNam, lastName, gender, phone, email, hobbie, description, location, person_id);
			response.sendRedirect("display");
		}else if(action.equalsIgnoreCase("delete")) {
			request.setCharacterEncoding("UTF-8");
			PersonalDAO.deletePresonal(person_id);
			
			
			response.sendRedirect("display");
			
		}else if(action.equalsIgnoreCase("cancel")) {
			response.sendRedirect("display");
		}
		
	}

}
