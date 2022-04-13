package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03dataSend")
public class ex03dataSend extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 0. 인코딩 (할 때 마다)
		// request.setCharacterEncoding("인코딩 방법")
		// 요청 페이지에 맞추기!
		// post 방식일 때, 인코딩
		request.setCharacterEncoding("EUC-KR");
		
		// 1. 파라미터 수집 : 받은 데이터를 변수에 저장
		// request.getParameter("input태그의 name값")
		// 만약 name에 해당하는 data가 없으면 null을 리턴
		// String 타입으로 리턴
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3 = request.getParameter("data3");
		
		// 2. 응답(response)
		// 응답 형식 설정
		// response.setContentType("문서형식 ; 인코딩 방식")
		response.setContentType("text/html; charset=euc-kr");
		
		// 출력을 도와줄 PrintWriter 객체 생성
		PrintWriter out = response.getWriter();
		
		// 출력
		// <h1> data1 : 안현진 </h1>
		out.print("<h1>data1 : "+ data1 + "</h1>");
		out.print("<h1>data2 : "+ data2 + "</h1>");
		out.print("<h1>data3 : "+ data3 + "</h1>");
		
	}

}
