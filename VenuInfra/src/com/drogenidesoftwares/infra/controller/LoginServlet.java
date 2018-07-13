package com.drogenidesoftwares.infra.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	Statement st;
       
    
    public LoginServlet() 
    {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException 
	{
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
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		int flag=0;
		RequestDispatcher rd=null;
		PrintWriter p=response.getWriter();
		String u=request.getParameter("fname");
		String pw=request.getParameter("pwd");
		String role=request.getParameter("users");
		
		try
		{
			st=con.createStatement();
			if(role.equals("Superadmin"))
			{
			String sql="select email,pwd from superadmin";
			ResultSet rs=st.executeQuery(sql);
					
			while(rs.next())
			{
				String u1=rs.getString("email");
				String p1=rs.getString("pwd");
				
				if( u.equals(u1) && pw.equals(p1) )
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			
			if(flag==1)
			{
			rd=request.getRequestDispatcher("/superadmin.jsp");
			rd.forward(request, response);
//				response.sendRedirect("/superadmin.jsp");
			}
			
			else
			{
				p.println("<h2> Invalid User </h2>");
				rd=request.getRequestDispatcher("/Login.jsp");
				rd.forward(request, response);
//				response.sendRedirect("/Login.jsp");
			}
			
		}
			
			//Admin Role
		else
	{
		if(role.equals("Admin"))
		{
			String sql="select aemail,apwd from admin1";
			ResultSet rs=st.executeQuery(sql);
					
			while(rs.next())
			{
				String u1=rs.getString("aemail");
				String p1=rs.getString("apwd");
				
				if( u.equals(u1) && pw.equals(p1) )
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			
			   if(flag==1)
			    {
			        rd=request.getRequestDispatcher("/Admin1.jsp");
			        rd.forward(request, response);
//				    response.sendRedirect("/superadmin.jsp");
			    }
			
			    else
			    {
				    p.println("<h2> Invalid User </h2>");
				    rd=request.getRequestDispatcher("/Login.jsp");
				    rd.forward(request, response);
//				    response.sendRedirect("/Login.jsp");
			    }
//			
		}
			
//			
//			//Store manager role
		else
	{
		if(role.equals("Store Manager"))
		{
			String sql="select stemail,stpwd from storemanager";
			ResultSet rs=st.executeQuery(sql);
					
			while(rs.next())
			{
				String u1=rs.getString("stemail");
				String p1=rs.getString("stpwd");
				
				if( u.equals(u1) && pw.equals(p1) )
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			
			if(flag==1)
			{
			rd=request.getRequestDispatcher("/Storemanager.jsp");
			rd.forward(request, response);
//				response.sendRedirect("/superadmin.jsp");
			}
			
			else
			{
				p.println("<h2> Invalid User </h2>");
				rd=request.getRequestDispatcher("/Login.jsp");
				rd.forward(request, response);
//				response.sendRedirect("/Login.jsp");
			}
//			
		 }
		
		// Delivery Boy
	  else
	{
	    if(role.equals("Delivery Boy"))
	     {
		      String sql="select demail,dpwd from deliveryboy";
		      ResultSet rs=st.executeQuery(sql);
				
		     while(rs.next())
		    {
			   String u1=rs.getString("demail");
			   String p1=rs.getString("dpwd");
			
			  if( u.equals(u1) && pw.equals(p1) )
			 {
				flag=1;
				break;
			 }
			  else
			 {
				flag=0;
			 }
		    }
		
		   if(flag==1)
		     {
		      rd=request.getRequestDispatcher("/DeliveryBoy.jsp");
		      rd.forward(request, response);
//			  response.sendRedirect("/superadmin.jsp");
		     }
		
		   else
		    {
			  p.println("<h2> Invalid User </h2>");
			  rd=request.getRequestDispatcher("/Login.jsp");
			  rd.forward(request, response);
//			  response.sendRedirect("/Login.jsp");
		    }
//		
	   }
	}					
	}
	}
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
		//doGet(request, response);
	}

}
