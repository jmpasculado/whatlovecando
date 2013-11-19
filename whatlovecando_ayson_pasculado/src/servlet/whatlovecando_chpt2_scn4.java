package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class whatlovecando_chpt2_scn4
 */
@WebServlet("/whatlovecando_chpt2_scn4")
public class whatlovecando_chpt2_scn4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public whatlovecando_chpt2_scn4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher hdr = request.getRequestDispatcher("/whatlovecando_header");
		hdr.include(request, response);
		
		RequestDispatcher csh = request.getRequestDispatcher("whatlovecando_Chapter2Scene4.html");
		csh.include(request, response);
		
		RequestDispatcher fdr = request.getRequestDispatcher("/whatlovecando_footer");
		fdr.include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
