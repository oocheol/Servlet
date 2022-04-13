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

		// 0. ���ڵ� (�� �� ����)
		// request.setCharacterEncoding("���ڵ� ���")
		// ��û �������� ���߱�!
		// post ����� ��, ���ڵ�
		request.setCharacterEncoding("EUC-KR");
		
		// 1. �Ķ���� ���� : ���� �����͸� ������ ����
		// request.getParameter("input�±��� name��")
		// ���� name�� �ش��ϴ� data�� ������ null�� ����
		// String Ÿ������ ����
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3 = request.getParameter("data3");
		
		// 2. ����(response)
		// ���� ���� ����
		// response.setContentType("�������� ; ���ڵ� ���")
		response.setContentType("text/html; charset=euc-kr");
		
		// ����� ������ PrintWriter ��ü ����
		PrintWriter out = response.getWriter();
		
		// ���
		// <h1> data1 : ������ </h1>
		out.print("<h1>data1 : "+ data1 + "</h1>");
		out.print("<h1>data2 : "+ data2 + "</h1>");
		out.print("<h1>data3 : "+ data3 + "</h1>");
		
	}

}
