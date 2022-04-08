package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02_practice")
public class Ex02_practice extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String client_ip = request.getRemoteHost();
		System.out.println("들어온 사람 : "+ client_ip);
		
		// 응답할 페이지에 대한 설정
		response.setContentType("text/html; charset=euc-kr");
		
		// 웹에 출력하기 -> 사용자에게 데이터를 전달할 수 있는 통로
		PrintWriter out = response.getWriter();
		String[] team = {"222.102.43.169", "115.23.24.218", "211.227.114.238", "59.3.58.97", "221.156.60.33", "0:0:0:0:0:0:0:1"};
		ArrayList<String> teams = new ArrayList<>(Arrays.asList(team));
		if (teams.contains(client_ip)) {
			out.print("<h1> 선미팀~~ </h1><h1>환영합니다~~ </h1>");
			out.print("<img src='./imgFile/리자몽.png'>");
		} else {
			out.print("<h1> 선미팀이 아니군요! </h1>");
			out.print("<h1> 잘못 들어오셨습니다! </h1>");
			out.print("<img src='./imgFile/stop.png'>");
		}
		
		
		
	}

}
