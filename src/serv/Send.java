package serv;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Send
 */
@WebServlet("/Send")
public class Send extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Send() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	/*	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String n=request.getParameter("Name");  
		String p=request.getParameter("locality");  
		String e=request.getParameter("address");  
		String c=request.getParameter("phn"); 
		String a=request.getParameter("des");
	//	long i=Integer.valueOf(c);
		
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mla","root","1234");  
			  
			PreparedStatement ps=con.prepareStatement(  
			"insert into mla.clientinfo values(?,?,?,?,?)");  
			  
			ps.setString(1,n);  
			ps.setString(2,p);  
			ps.setString(3,e);  
			ps.setString(4,c);
			ps.setString(5,a);
			          
			int j=ps.executeUpdate();  
			if(j>0)  
			out.print("You are successfully submitted...");
		
	      }
		catch (Exception e2) {
			e2.printStackTrace();
		    out.println("something error");}  
        
		out.close();  */

		}  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String n=request.getParameter("Name");  
		String p=request.getParameter("locality");  
		String e=request.getParameter("address");  
		String c=request.getParameter("phn"); 
		String a=request.getParameter("des");
	//	long i=Integer.valueOf(c);
		
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mla","root","1234");  
			  
			PreparedStatement ps=con.prepareStatement(  
			"insert into mla.clientinfo values(?,?,?,?,?)");  
			  
			ps.setString(1,n);  
			ps.setString(2,p);  
			ps.setString(3,e);  
			ps.setString(4,c);
			ps.setString(5,a);
			          
			int j=ps.executeUpdate();  
			if(j>0)  
			out.print("You are successfully submitted...");
		
	      }
		catch (Exception e2) {
			e2.printStackTrace();
		    out.println("something error");}  
        
		out.close();  
	}

}
