package JavaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServelt")
public class FirstServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public FirstServelt() {
        super();
       
    }
//request will capture data from client
    // request is black
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		System.out.println("Hello");
		PrintWriter pw=response.getWriter();
		
		//getWriter()== It will returns a PrintWriter object that can sent character text to the client.
		// It is going to work like a pencil/pen  to write something on browser.
		
		pw.println("how are you");
		pw.println("I am fine ");
		pw.println("<h1> kushal....ram....shyam <h1>");
		
		pw.println("<h2> kushal....ram....shyam <h2>");
		
		pw.println("<h3> kushal....ram....shyam <h3>");
		
		
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
