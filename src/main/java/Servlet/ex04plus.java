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

		// 0. ���ڵ� > ���ڸ� �Է¹����Ƿ� ���ʿ�
//		request.setCharacterEncoding("EUC-KR");
		
		// 1. �Ķ���� ����
		String data1 = request.getParameter("num1");
		String data2 = request.getParameter("num2");
		
		// num1, num2�� ������ int�� ��ȯ
		// String -> int / Integer.parseInt(String);
		// int, char, boolean, double... --> �⺻ �ڷ����� null�� ���
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		// 2. ���
		
		int res = num1 + num2;
		
		// 3. ����
		// ���� ���� ����
		response.setContentType("text/html; charset=euc-kr");
		
		// ������ ������ ģ�� PrintWriter ����
		PrintWriter out = response.getWriter();
		
		// ����(���)
		// 
		out.print(num1 +" + "+ num2 + " = " + res);
		
	
	}

}
