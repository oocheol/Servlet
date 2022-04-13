package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex07join")
public class ex07join extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 0. 인코딩
		// post방식 인코딩
		request.setCharacterEncoding("EUC-KR");
		
		// 1. 파라미터 수집
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwC = request.getParameter("pwC");
		String gender = request.getParameter("gender");
		String abo = request.getParameter("abo");
		String birth = request.getParameter("birth");
		
		// request.getParameter("name") : 1개만 가져옴
		// request.getParameterValues("name") : 동일한 name 전부 가져옴, 리턴타입 > String 배열
		String[] hobby = request.getParameterValues("hobby");
		System.out.println(hobby); // [Ljava.lang.String;@3eae5dbd > 주소값
		
		
		// 1. 반복문 사용해서 출력
		// 2. Arrays.toString();
		System.out.println(Arrays.toString(hobby)); // [soc, base, bk]
		
		String color = request.getParameter("color");
		String talk = request.getParameter("talk");
		
		// 2. 응답
		// 응답 형식 지정
		response.setContentType("text/html; charset=euc-kr");
		
		// PrintWriter 객체 생성
		PrintWriter out = response.getWriter();
		
		// 응답
		// <p> 아이디 : id </p>
		out.print("<p> 아이디 : "+ id +" </p>");
		out.print("<p> 비밀번호 : "+ pw +" </p>");
		out.print("<p> 비밀번호 확인 : "+ pwC +" </p>");
		out.print("<p> 성별 : "+ gender +" </p>");
		out.print("<p> 혈액형 : "+ abo +" </p>");
		out.print("<p> 생일 : "+ birth +" </p>");
		out.print("<p> 취미 : "+ Arrays.toString(hobby) +" </p>");
		out.print("<p> 좋아하는 색 : "+ color +" </p>");
		out.print("<p> 하고싶은 말 : "+ talk +" </p>");
		
		
		
		
		
	}

}
