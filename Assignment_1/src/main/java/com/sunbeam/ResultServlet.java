package com.sunbeam;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MarksDetails")
public class ResultServlet extends HttpServlet{

	ArrayList<Marks> result;
	
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
		out.println("<title>Student Marks</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Student Profile</h1>");
		out.println("<table style = {border: 1px solid black}>");
		out.println("<tr>");
		out.println("<th>Marks");				
		out.println("</tr>");
		for(Marks m: result) {
			 out.println("<tr>");
			 out.printf("<td>%s<td>\r\n", m.getSubject());
			 out.printf("<td>%.2f<td>\r\n", m.getMarks());
			 out.println("</tr>");
			}
		out.println("</table>");				
		out.println("</body>");
		out.println("</html>");
				
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		 result = new ArrayList<>();
		 result.add(new Marks("Java programming", 80.0));
		 result.add(new Marks("Web programming", 85.0));
		 result.add(new Marks("Database technologies", 83.0));
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}


}
