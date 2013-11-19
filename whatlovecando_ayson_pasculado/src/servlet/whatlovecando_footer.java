package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/whatlovecando_footer")
public class whatlovecando_footer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public whatlovecando_footer() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		PrintWriter out = response.getWriter();
		out.println("<h2><font color='green'>Jake Robert M. Pasculado | Ronald Ayson</font></h2>");
		
		String v_chp =  (String) request.getAttribute("chp_1");
		String v_scn = (String) request.getAttribute("scn_1");

		out.println("<br><h3><font color='green'>Chapter: </font></h3>" + v_chp);
		out.println("<br><h3><font color='green'>Scene: </font></h3>" + v_scn);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
