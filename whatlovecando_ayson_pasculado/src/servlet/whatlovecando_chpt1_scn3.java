package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class whatlovecando_chpt1_scn3
 */
@WebServlet("/whatlovecando_chpt1_scn3")
public class whatlovecando_chpt1_scn3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public whatlovecando_chpt1_scn3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher hdr = request.getRequestDispatcher("/whatlovecando_header");
		hdr.include(request, response);
		
		RequestDispatcher csh = request.getRequestDispatcher("whatlovecando_Chapter1Scene3.html");
		csh.include(request, response);
		
		RequestDispatcher fdr = request.getRequestDispatcher("/whatlovecando_footer");
		fdr.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
