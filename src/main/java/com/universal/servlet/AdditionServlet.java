package com.universal.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AdditionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int fnum = Integer.parseInt( 
				request.getParameter("txtFnum"));
		int snum = Integer.parseInt( 
				request.getParameter("txtSnum"));
		int ans = fnum + snum;
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title> Add Num Demo </title>");
		pw.println("</head>");
		pw.println("<body>");
		
		pw.println("<h1 style=color:green> Sum of "
		+ fnum +" and " + snum +" is " + ans + "</h1>");
		
		pw.println("</body>");
		pw.println("</html>");
	}

}
