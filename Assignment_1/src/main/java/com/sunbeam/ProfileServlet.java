package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profileDetails")
public class ProfileServlet extends HttpServlet {
	
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
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Student Profile</title>");
		out.println("</head>");
		out.println("<body bgcolor='pink'>");
		out.println("<h1>Student Profile</h1>");
		out.println("<h1>First Name: Kartik</h1>");
		out.println("<h1>Last Name: Jachak</h1>");
		out.println("<h1>Qualification: MSc Computer Science</h1>");
		out.println("<h1>University: TCC College</h1>");
		out.println("</body>");
		out.println("</html>");
				
	}
}
