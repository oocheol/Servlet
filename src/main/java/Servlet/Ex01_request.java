package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping : Servlet 별명
@WebServlet("/Ex01_request")
							// HttpServlet 클래스를 상속받음
public class Ex01_request extends HttpServlet {
					// service 메소드 : Java의 main 메소드와 같은 역할
					// 매개변수 : request, response
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
