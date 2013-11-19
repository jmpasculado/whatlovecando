package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/whatlovecando_header")
public class whatlovecando_header extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public whatlovecando_header() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
  		PrintWriter out = response.getWriter();
		out.println("<h1><font color='green'>What Love Can Do</font></h1>");
		
		String v_user = (String) request.getAttribute("user1");
		//String v_pass = (String) request.getAttribute("pass1");

		out.println("<br><font color='green'>Username: </font>" + v_user);
		//out.println("<br>Password: " + v_pass);

		


		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
