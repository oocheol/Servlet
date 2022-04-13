package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex06post")
public class ex06post extends HttpServlet {

	// doGet -> Get 방식 요청이 오면 실행
	// doPost -> Post 방식 요청이 오면 실행
	// 최근 트렌드는 service 메서드만 사용
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. 인코딩
		// Get 방식 인코딩
		// Get 방식 -> URL + 쿼리스트링
		// 받아오는 주소를 인코딩
		// Servers 프로젝트 > Server.xml > Connector태그에 URIEncoding
		// URI > URL + 쿼리스트링
		
		// Post방식 인코딩
		// Post > 패킷의 Body에 담김
		// request 객체에 인코딩 지정
		request.setCharacterEncoding("euc-kr");

		// 1. 파라미터 수집
		String id = request.getParameter("id");
		String msg = request.getParameter("msg");
		
		// 2. 응답
		// 응답 형식 지정
		response.setContentType("text/html; charset=euc-kr");
		
		// PrintWriter 생성
		PrintWriter out = response.getWriter();
		
		// 응답
		// id : msg
		out.print(id + " : " + msg);
		
		
		
		
	}
	

}
