package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex04plus")
public class ex04plus extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 0. 인코딩 > 숫자만 입력받으므로 불필요
//		request.setCharacterEncoding("EUC-KR");
		
		// 1. 파라미터 수집
		String data1 = request.getParameter("num1");
		String data2 = request.getParameter("num2");
		
		// num1, num2를 정수형 int로 변환
		// String -> int / Integer.parseInt(String);
		// int, char, boolean, double... --> 기본 자료형은 null을 허용
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		// 2. 계산
		
		int res = num1 + num2;
		
		// 3. 응답
		// 응답 형식 지정
		response.setContentType("text/html; charset=euc-kr");
		
		// 응답을 도와줄 친구 PrintWriter 생성
		PrintWriter out = response.getWriter();
		
		// 응답(출력)
		// 
		out.print(num1 +" + "+ num2 + " = " + res);
		
	
	}

}
