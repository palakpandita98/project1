
import java.io.IOException;
import java.sql.*;  
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class submit_feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("feedback");
		
                            try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/filter1","root","Palak@1234");  
  // for Connection with mysql
PreparedStatement stmt=con.prepareStatement("insert into feedbacks values(?)");  
stmt.setString(1,username);    
stmt.executeUpdate();  
System.out.println(" records inserted");  

con.close();  
RequestDispatcher req = request.getRequestDispatcher("Main.html");
			req.include(request, response);
}catch(Exception e){ System.out.println(e);}  
                        
		}
	}
 
