package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/whatlovecando_toc")
public class whatlovecando_toc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public whatlovecando_toc() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>What Love Can Do</title>");
		out.println("<link href='whatlovecando_css.css' rel='stylesheet' type='text/css'>");
		out.println("</head>");
		out.println("<body onload='loadImage()'>");
		RequestDispatcher hrd1 = request.getRequestDispatcher("/whatlovecando_header");
		hrd1.include(request, response);
		out.println("<form>");
		  

		out.println("<h2></h2> ");
		out.println("<h3></h3>");
				
		out.println("<table border='1' style='margin:0px auto; height:500px; width:500px '>");
		out.println("<tr>");
		out.println("<th>Chapter</th>");
		out.println("<th></th>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td id=td01 style='background-image:url(images/bg/bg_school.png); background-size:100%; background-position:right 0px; background-repeat:no-repeat;'>Introduction</td>");
		out.println("<td>");
		out.println("<ul>");
		out.println("<li><input type=submit name=chpt_int_btn value='SC 1'></li>");
		out.println("</ul>");
		out.println("</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td id=td01 style='background-image:url(images/bg/bg_caf_in.png); background-size:100%; background-position:right 0px; background-repeat:no-repeat;'>Chapter 1</td>");
		out.println("<td>");
		out.println("<ul>");
		out.println("<li><input type=submit name=chpt_1_scn_1_btn value='SC 1'></li>");
		out.println("<li><input type=submit name=chpt_1_scn_2_btn value='SC 2'></li>");
		out.println("<li><input type=submit name=chpt_1_scn_3_btn value='SC 3'></li>");
		out.println("</ul>");
		out.println("</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td id=td01 style='background-image:url(images/bg/bg_room.png); background-size:100%; background-position:right 0px; background-repeat:no-repeat;'>Chapter 2</td>");
		out.println("<td>");
		out.println("<ul>");
		out.println("<li><input type=submit name=chpt_2_scn_1_btn value='SC 1'></li>");
		out.println("<li><input type=submit name=chpt_2_scn_2_btn value='SC 2'></li>");
		out.println("<li><input type=submit name=chpt_2_scn_3_btn value='SC 3'></li>");
		out.println("<li><input type=submit name=chpt_2_scn_4_btn value='SC 4'></li>");
		out.println("</ul>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<td id=td01 style='background-image:url(images/bg/bg_lobby.png); background-size:100%; background-position:right 0px; background-repeat:no-repeat;'>Chapter 3</td>");
		out.println("<td>");
		out.println("<ul>");
		out.println("<li><input type=submit name=chpt_3_scn_1_btn value='SC 1'></li>");
		out.println("<li><input type=submit name=chpt_3_scn_2_btn value='SC 2'></li>");
		out.println("<li><input type=submit name=chpt_3_scn_3_btn value='SC 3'></li>");
		out.println("<li><input type=submit name=chpt_3_scn_4_btn value='SC 4'></li>");
		out.println("<li><input type=submit name=chpt_3_scn_5_btn value='SC 5'></li>");
		out.println("</ul>");
		out.println("</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td id=td01 style='background-image:url(images/bg/bg_bedroom.png); background-size:100%; background-position:right 0px; background-repeat:no-repeat;'>Chapter 4</td>");
		out.println("<td>");
		out.println("<ul>");
		out.println("<li><input type=submit name=chpt_4_scn_1_btn value='SC 1'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_2_btn value='SC 2'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_3_btn value='SC 3'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_4_btn value='SC 4'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_5_btn value='SC 5'></li>");
		out.println("</ul>");
		out.println("</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td id=td01 style='background-image:url(images/bg/bg_lapulapu.png); background-size:100%; background-position:right 0px; background-repeat:no-repeat;'>Chapter 5</td>");
		out.println("<td>");
		out.println("<ul>");
		out.println("<li><input type=submit name=chpt_4_scn_1_btn value='SC 1'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_2_btn value='SC 2'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_3_btn value='SC 3'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_4_btn value='SC 4'></li>");
		out.println("<li><input type=submit name=chpt_4_scn_5_btn value='SC 5'></li>");
		out.println("</ul>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
		
		out.println("<br>");	

		out.println("</form>");
		  
		RequestDispatcher frd = request.getRequestDispatcher("/whatlovecando_footer");
		frd.include(request, response);	
			
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
