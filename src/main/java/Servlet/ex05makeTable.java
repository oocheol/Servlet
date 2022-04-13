package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex05makeTable")
public class ex05makeTable extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// ����
		// ���� ���� ���� (cf. utf-8�̸� charset=utf-8)
		response.setContentType("text/html; charset=euc-kr");
		
		// PrintWriter ����
		PrintWriter out = response.getWriter();
		
		String inputNum = request.getParameter("num");
		int res =  Integer.parseInt(inputNum);
		
		// python, javascript, html
		// 1. ���� �ٱ��ʰ� �ٸ� ����ǥ
		// 2. ���� ����ǥ ���� �ʹٸ� > ����ǥ �տ� ��������( "\"����\"" )
		out.print("<table border='1'>");
		out.print("<tr>");
		
		for (int i = 1; i <= res; i++) {
			out.print("<td> "+ i +" </td>");
		}
		
		out.print("</tr>");
		out.print("</table>");
		
		
		
	}

}
