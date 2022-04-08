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
		System.out.println("���� ��� : "+ client_ip);
		
		// ������ �������� ���� ����
		response.setContentType("text/html; charset=euc-kr");
		
		// ���� ����ϱ� -> ����ڿ��� �����͸� ������ �� �ִ� ���
		PrintWriter out = response.getWriter();
		String[] team = {"222.102.43.169", "115.23.24.218", "211.227.114.238", "59.3.58.97", "221.156.60.33", "0:0:0:0:0:0:0:1"};
		ArrayList<String> teams = new ArrayList<>(Arrays.asList(team));
		if (teams.contains(client_ip)) {
			out.print("<h1> ������~~ </h1><h1>ȯ���մϴ�~~ </h1>");
			out.print("<img src='./imgFile/���ڸ�.png'>");
		} else {
			out.print("<h1> �������� �ƴϱ���! </h1>");
			out.print("<h1> �߸� �����̽��ϴ�! </h1>");
			out.print("<img src='./imgFile/stop.png'>");
		}
		
		
		
	}

}
