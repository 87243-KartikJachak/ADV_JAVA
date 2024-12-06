package com.sunbeam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c1 = new Cookie("uname", "");
		c1.setMaxAge(-1);
		resp.addCookie(c1);
		Cookie c2 = new Cookie("role", "");
		c2.setMaxAge(-1);
		resp.addCookie(c2);
		HttpSession session = req.getSession();
		session.invalidate();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		ServletContext app = this.getServletContext();
		String appTitle = app.getInitParameter("app.title");

		String bgcolor = app.getInitParameter("background-color");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Logout</title>");
		out.println("</head>");
		out.printf("<body style='background-color: %s'>",bgcolor);
		out.printf("<h1>%s</h1>", appTitle);
		
		out.println("<h2>Thank you</h2>");
		out.println("<p>See you after 5 years.</p>");
		out.println("<p><a href='Login.html'>Login Again</a></p>");
		out.println("</body>");
		out.println("</html>");			
	}
}