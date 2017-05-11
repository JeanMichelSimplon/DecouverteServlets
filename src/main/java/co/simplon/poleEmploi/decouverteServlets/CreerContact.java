package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Array;

import co.simplon.annuaire.domaine.Contact;
import co.simplon.annuaire.domaine.Hobbies;

// Extend HttpServlet class
public class CreerContact extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		// Do required initialization

		message = "Hello World";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		String paramnom = request.getParameter("nom");
		PrintWriter out = response.getWriter();
		if (paramnom != null) {
			out.println("<h1>bonjour " + paramnom + "</h1>");
		} else {
			out.println("<h1>" + message + "</h1>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitementContact(request, response);
	}

	private void traitementContact(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");

		Contact contact = new Contact();
		Set<Hobbies> listHobbies = new HashSet<>();
		
		listHobbies.add(new Hobbies(1,"Violon"));
		listHobbies.add(new Hobbies(2,"Piano"));
		listHobbies.add(new Hobbies(2,"Jardinage"));		
		contact.setHobbies(listHobbies);
		contact.setEmail(email);
		contact.setNom(nom);
		contact.setPrenom(prenom);
		contact.setHobbies(listHobbies);
		request.setAttribute("contact", contact);
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("afficherContact.jsp");
		dispatcher.forward(request, response);
	}

	public void destroy() {
		// do nothing.
	}
}