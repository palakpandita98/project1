/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class feedback extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
out.println("html lang='en'>");
out.println("<head>");
	out.println("<title>Contact V12</title>");
	out.println("<meta charset='UTF-8'>");
	out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");

	out.println("<link rel='icon' type='image/png' href='images/icons/favicon.icon'/>");
out.println	("<link rel='stylesheet' type='text/css' href='vendor/bootstrap/css/bootstrap.min.css'>");
	out.println("<link rel='stylesheet' type='text/css' href='fonts/font-awesome-4.7.0/css/font-awesome.min.css'>");
	out.println("<link rel='stylesheet' type='text/css' href='vendor/animate/animate.css'>");
	out.println("<link rel='stylesheet' type='text/css' href='vendor/css-hamburgers/hamburgers.min.css'>");
	out.println("<link rel='stylesheet' type='text/css' href='vendor/select2/select2.min.css'>");
	out.println("<link rel='stylesheet' type='text/css' href='css/util.css'>");
	out.println("<link rel='stylesheet' type='text/css' href='css/main.css'>");
out.println("</head>");
out.println("<body>");

	out.println("<div class='bg-contact100' style='background-image: url('images/bg-01.jpg');'>");
		out.println("<div class='container-contact100'>");
			out.println("<div class='wrap-contact100'>");
				out.println("<div class='contact100-pic js-tilt' data-tilt>");
					out.println("<img src='images/img-01.png' alt='IMG'>");
				out.println("</div>");

				out.println("<form class='contact100-form validate-form'>");
					out.println("<span class='contact100-form-title'>");
						out.println("Get in touch");
					out.println("</span>");

					out.println("<div class='wrap-input100 validate-input' data-validate = 'Name is required'>");
						out.println("<input class='input100' type='text' name='name' placeholder='Name'>");
						out.println("<span class='focus-input100'></span>");
						out.println("<span class='symbol-input100'>");
							out.println("<i class='fa fa-user' aria-hidden='true'></i>");
						out.println("</span>");
					out.println("</div>");

					out.println("<div class='wrap-input100 validate-input' data-validate = 'Valid email is required: ex@abc.xyz'>");
						out.println("<input class'input100'type='text' name='email' placeholder='Email'>");
						out.println("<span class='focus-input100'></span>");
						out.println("<span class='symbol-input100'>");
							out.println("<i class='fa fa-envelope' aria-hidden='true'></i>");
						out.println("</span>");
					out.println("</div>");

					out.println("<div class='wrap-input100 validate-input' data-validate = 'Message is required'>");
						out.println("<textarea class='input100' name='message' placeholder='Message'></textarea>");
						out.println("<span class='focus-input100'></span>");
					out.println("</div>");

					out.println("<div class='container-contact100-form-btn'>");
						out.println("<button class='contact100-form-btn'>");
							out.println("Send");
						out.println("</button>");
					out.println("</div>");
				out.println("</form>");
			out.println("</div>");
		out.println("</div>");
	out.println("</div>");



	out.println("<script src='vendor/jquery/jquery-3.2.1.min.js'></script>");
	out.println("<script src='vendor/bootstrap/js/popper.js'></script>");
	out.println("<script src='vendor/bootstrap/js/bootstrap.min.js'></script>");
	out.println("<script src='vendor/select2/select2.min.js'></script>");
	out.println("<script src='vendor/tilt/tilt.jquery.min.js'></script>");
	out.println("<script >");
		out.println("$('.js-tilt').tilt({scale: 1.1})");
	out.println("</script>");
	out.println("<script src='js/main.js'></script>");
out.println("<script async src='https://www.googletagmanager.com/gtag/js?id=UA-23581568-13'></script>");
out.println("<script>");
  out.println("window.dataLayer = window.dataLayer || [];");
  out.println("function gtag(){dataLayer.push(arguments);}");
  out.println("gtag('js', new Date());");

  out.println("gtag('config', 'UA-23581568-13');");
out.println("</script>");

out.println("</body>");
out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
