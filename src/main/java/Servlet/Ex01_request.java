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
					// 매개변수 : request(요청), response(응답)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. request 객체 : 사용자가 요청을 했을 때 요청에 대한 모든 정보를 담고 있는 객체
		//				ex) 요청이 들어온 주소, 사용자가 입력한 정보(id, pw) 등..
		
		// 실습1. 요청이 들어온 ip주소 확인하기
		request.getRemoteHost();
		
		
	}

}
