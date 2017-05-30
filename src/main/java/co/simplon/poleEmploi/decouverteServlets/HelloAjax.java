package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Extend HttpServlet class
public class HelloAjax extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		// Do required initialization

		message = "Hello World";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/plain");

		// Actual logic goes here.
		String paramnom = request.getParameter("prenom");
		PrintWriter out = response.getWriter();
		
		
		if (paramnom != null) {
			out.println("bonjour " + paramnom );
			response.setStatus(HttpServletResponse.SC_OK);			
		} else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramnom = request.getParameter("nom");
		request.setAttribute("paramnom", paramnom);
			RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("/WEB-INF/hello.jsp");
			dispatcher.forward(request, response);
	}

	public void destroy() {
		// do nothing.
	}
}