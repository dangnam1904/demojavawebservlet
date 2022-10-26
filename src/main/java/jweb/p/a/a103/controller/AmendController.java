package jweb.p.a.a103.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jweb.p.a103.dao.PersonalDAO;
import jweb.p.a103.model.Personal;

@WebServlet(name="/AmendController", urlPatterns = "/amend")
public class AmendController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AmendController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Personal personal= PersonalDAO.SearchPersonalById(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("pers", personal);
		request.getRequestDispatcher("VisitorEdit.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
