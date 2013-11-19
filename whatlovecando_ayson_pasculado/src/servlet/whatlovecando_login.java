package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/whatlovecando_login")
public class whatlovecando_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public whatlovecando_login() {
        super();

    }

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher hdr = request.getRequestDispatcher("/whatlovecando_header");
		hdr.include(request, response);
		out.println("<html>");
		out.println("<head>");
		out.println("<title>What Love Can Do</title>");
		out.println("<link href='whatlovecando_css.css' rel='stylesheet' type='text/css'>");
		out.println("</head>");
		out.println("<body onload='loadImage()'>");
		
		out.println("<form>");
		out.println("Enter Username: " + "<input type=text name=n1><br>");
		out.println("Enter Password: " + "<input type=password name=n2><br>");
		out.println("<input type=submit value=Submit><br><br>");
		
		out.println("</form>");
		RequestDispatcher frd = request.getRequestDispatcher("/whatlovecando_footer");
		frd.include(request, response);	
		String vn1=request.getParameter("n1");
		String vn2=request.getParameter("n2");
		
		String chpt_int_btn = (String) request.getAttribute("chpt_int_btn");
		String chpt_1_scn_1_btn = (String) request.getAttribute("chpt_1_scn_1_btn");
		String chpt_1_scn_2_btn = (String) request.getAttribute("chpt_1_scn_2_btn");
		String chpt_1_scn_3_btn = (String) request.getAttribute("chpt_1_scn_3_btn");	
		String chpt_2_scn_1_btn = (String) request.getAttribute("chpt_2_scn_1_btn");
		String chpt_2_scn_2_btn = (String) request.getAttribute("chpt_2_scn_2_btn");
		String chpt_2_scn_3_btn = (String) request.getAttribute("chpt_2_scn_3_btn");
		String chpt_2_scn_4_btn = (String) request.getAttribute("chpt_2_scn_4_btn");
		String chpt_3_scn_1_btn = (String) request.getAttribute("chpt_3_scn_1_btn");	
		String chpt_3_scn_2_btn = (String) request.getAttribute("chpt_3_scn_2_btn");
		String chpt_3_scn_3_btn = (String) request.getAttribute("chpt_3_scn_3_btn");
		String chpt_3_scn_4_btn = (String) request.getAttribute("chpt_3_scn_4_btn");
		String chpt_3_scn_5_btn = (String) request.getAttribute("chpt_3_scn_5_btn");
		String chpt_4_scn_1_btn = (String) request.getAttribute("chpt_4_scn_1_btn");	
		String chpt_4_scn_2_btn = (String) request.getAttribute("chpt_4_scn_2_btn");
		String chpt_4_scn_3_btn = (String) request.getAttribute("chpt_4_scn_3_btn");
		String chpt_4_scn_4_btn = (String) request.getAttribute("chpt_4_scn_4_btn");
		String chpt_4_scn_5_btn = (String) request.getAttribute("chpt_4_scn_5_btn");
		String chpt_5_scn_1_btn = (String) request.getAttribute("chpt_5_scn_1_btn");	
		String chpt_5_scn_2_btn = (String) request.getAttribute("chpt_5_scn_2_btn");
		String chpt_5_scn_3_btn = (String) request.getAttribute("chpt_5_scn_3_btn");
		String chpt_5_scn_4_btn = (String) request.getAttribute("chpt_5_scn_4_btn");
		String chpt_5_scn_5_btn = (String) request.getAttribute("chpt_5_scn_5_btn");
		 
		  if(request.getParameter("chpt_int_btn") != null){
				RequestDispatcher cs1a = request.getRequestDispatcher("/whatlovecando_introduction");
				cs1a.forward(request, response);

			   }
			  else if(request.getParameter("chpt_1_scn_1_btn") != null){
					RequestDispatcher cs1 = request.getRequestDispatcher("/whatlovecando_chpt1_scn1");
					cs1.forward(request, response);
					
			  }
			  else if(request.getParameter("chpt_1_scn_2_btn") != null){
					RequestDispatcher cs2 = request.getRequestDispatcher("/whatlovecando_chpt1_scn2");
					cs2.forward(request, response);
					
					 
			  }
			  else if(request.getParameter("chpt_1_scn_3_btn") != null){
					RequestDispatcher cs3 = request.getRequestDispatcher("/whatlovecando_chpt1_scn3");
					cs3.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_2_scn_1_btn") != null){
					RequestDispatcher cs4 = request.getRequestDispatcher("/whatlovecando_chpt2_scn1");
					cs4.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_2_scn_2_btn") != null){
					RequestDispatcher cs4 = request.getRequestDispatcher("/whatlovecando_chpt2_scn2");
					cs4.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_2_scn_3_btn") != null){
					RequestDispatcher cs5 = request.getRequestDispatcher("/whatlovecando_chpt2_scn3");
					cs5.forward(request, response);
					
			  }
			  else if(request.getParameter("chpt_2_scn_4_btn") != null){
					RequestDispatcher cs6 = request.getRequestDispatcher("/whatlovecando_chpt2_scn4");
					cs6.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_3_scn_1_btn") != null){
					RequestDispatcher cs7 = request.getRequestDispatcher("/whatlovecando_chpt3_scn1");
					cs7.forward(request, response);
					
			  }
			  else if(request.getParameter("chpt_3_scn_2_btn") != null){
					RequestDispatcher cs8 = request.getRequestDispatcher("/whatlovecando_chpt3_scn2");
					cs8.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_3_scn_3_btn") != null){
					RequestDispatcher cs9 = request.getRequestDispatcher("/whatlovecando_chpt3_scn3");
					cs9.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_3_scn_4_btn") != null){
					RequestDispatcher cs10 = request.getRequestDispatcher("/whatlovecando_chpt3_scn4");
					cs10.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_3_scn_5_btn") != null){
					RequestDispatcher cs11 = request.getRequestDispatcher("/whatlovecando_chpt3_scn5");
					cs11.forward(request, response);
					
			  }
			  else if(request.getParameter("chpt_4_scn_1_btn") != null){
					RequestDispatcher cs12 = request.getRequestDispatcher("/whatlovecando_chpt4_scn1");
					cs12.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_4_scn_2_btn") != null){
					RequestDispatcher cs13 = request.getRequestDispatcher("/whatlovecando_chpt4_scn2");
					cs13.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_4_scn_3_btn") != null){
					RequestDispatcher cs14 = request.getRequestDispatcher("/whatlovecando_chpt4_scn3");
					cs14.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_4_scn_4_btn") != null){
					RequestDispatcher cs15 = request.getRequestDispatcher("/whatlovecando_chpt4_scn4");
					cs15.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_4_scn_5_btn") != null){
					RequestDispatcher cs16 = request.getRequestDispatcher("/whatlovecando_chpt4_scn5");
					cs16.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_5_scn_1_btn") != null){
					RequestDispatcher cs17 = request.getRequestDispatcher("/whatlovecando_chpt5_scn1");
					cs17.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_5_scn_2_btn") != null){
					RequestDispatcher cs18 = request.getRequestDispatcher("/whatlovecando_chpt5_scn2");
					cs18.forward(request, response);
					
			  }
			  else if(request.getParameter("chpt_5_scn_3_btn") != null){
					RequestDispatcher cs19 = request.getRequestDispatcher("/whatlovecando_chpt5_scn3");
					cs19.forward(request, response);
					
					
			  }
			  else if(request.getParameter("chpt_5_scn_4_btn") != null){
					RequestDispatcher cs20 = request.getRequestDispatcher("/whatlovecando_chpt5_scn4");
					cs20.forward(request, response);
					
			  }
			  else if(request.getParameter("chpt_5_scn_5_btn") != null){
					RequestDispatcher cs21 = request.getRequestDispatcher("/whatlovecando_chpt5_scn5");
					cs21.forward(request, response);
					
			  }			  
		  
		if("jake".equalsIgnoreCase(vn1) && "pasculado".equalsIgnoreCase(vn2)){
			request.setAttribute("user1", vn1);
			request.setAttribute("pass1", vn2);
			RequestDispatcher rd = request.getRequestDispatcher("/whatlovecando_toc");
			rd.forward(request, response);
		}
		
		else if (vn1 == null || vn2 == null){
			out.println("<h4>Please Fill in the specified info.</h4>");
			return;			
		} 
		
		else {
			out.println("<h4>Incorrect Login. Please try again.</h4>");
			return;	
		}
		
		out.println("</body></html>");

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
