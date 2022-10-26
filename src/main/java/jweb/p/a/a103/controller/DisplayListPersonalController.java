package jweb.p.a.a103.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jweb.p.a103.dao.PersonalDAO;
import jweb.p.a103.model.Personal;


@WebServlet(name="/DisplayListPersonalController", urlPatterns = "/display")
public class DisplayListPersonalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayListPersonalController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Personal> personalList= PersonalDAO.getAllPersonal();
		request.setAttribute("listPersonal", personalList);
		RequestDispatcher rDispatcher= request.getRequestDispatcher("SearchVisitor.jsp");
		rDispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
