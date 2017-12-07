package com.voti.Consultas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.voti.HibernateUtils;
import com.voti.dao.UsuarioOcdeDAO;
import com.voti.model.UsuarioOcde;



/**
 * Servlet implementation class UsuarioOcdeController
 */
public class UsuarioOcdeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static UsuarioOcdeDAO UsuarioOcdeDAO = new UsuarioOcdeDAO();
	private SessionFactory factory;
	private Session session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioOcdeController() {
        super();
        // TODO Auto-generated constructor stub
        
        factory = HibernateUtils.getSessionFactory();
		session = factory.openSession();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	
    	ArrayList<UsuarioOcde> usuariosOcde = null;
    	
		try {
			usuariosOcde = UsuarioOcdeDAO.selectName();
		} catch (HibernateException e) {
			System.err
					.println("An error ocurred while trying to retrieve products");
			e.printStackTrace();
		}
				
		PrintWriter out = response.getWriter();
		
		out.println("<table class='table table-hover table-inverse'>"
				+ "<tr>"
				+ "<td>Tabla UsuarioOcde</td>"
				+ "</tr>");
		
		
			out.println("<tr>"
					+ "<td>"+usuariosOcde+"</td>"
					+ "</tr>");
		
		out.print("</table>");
	
		
	
    }
}


    

