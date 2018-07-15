package com.drogenidesoftwares.infra.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SuperadminServlet")
public class SuperadminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	Statement st=null;
       
    
    public SuperadminServlet() {
        super();
        
    }

		public void init(ServletConfig config) throws ServletException {
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded.....");
	    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" , "AchuV19");
				System.out.println("Connection establish.....");
				
			}
		    	
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			} catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
			PrintWriter p=response.getWriter();
			
			try
			{
				 st=con.createStatement();
				String sql="select * from superadmin";
				ResultSet rs=st.executeQuery(sql);
				
				
				p.println("<table border><th>Username</th><th>Password</th><th>No of Admin</th>");
				while(rs.next())
				{
					p.println("<tr>");
					p.println("<td>"+rs.getString("email")+"</td><td>"+rs.getString("pwd")+"</td><td>"+rs.getInt("noofadmin")+"</td><br>");
					p.println("</tr>");
				}
				p.println("</table>");
			
			}
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
			
			finally
			{
				try 
				{
					con.close();
				}
				catch (SQLException e) 
				{
					
					e.printStackTrace();
				}
			}
			
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
