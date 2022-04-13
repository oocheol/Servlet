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

		// 0. ���ڵ�
		// post��� ���ڵ�
		request.setCharacterEncoding("EUC-KR");
		
		// 1. �Ķ���� ����
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwC = request.getParameter("pwC");
		String gender = request.getParameter("gender");
		String abo = request.getParameter("abo");
		String birth = request.getParameter("birth");
		
		// request.getParameter("name") : 1���� ������
		// request.getParameterValues("name") : ������ name ���� ������, ����Ÿ�� > String �迭
		String[] hobby = request.getParameterValues("hobby");
		System.out.println(hobby); // [Ljava.lang.String;@3eae5dbd > �ּҰ�
		
		
		// 1. �ݺ��� ����ؼ� ���
		// 2. Arrays.toString();
		System.out.println(Arrays.toString(hobby)); // [soc, base, bk]
		
		String color = request.getParameter("color");
		String talk = request.getParameter("talk");
		
		// 2. ����
		// ���� ���� ����
		response.setContentType("text/html; charset=euc-kr");
		
		// PrintWriter ��ü ����
		PrintWriter out = response.getWriter();
		
		// ����
		// <p> ���̵� : id </p>
		out.print("<p> ���̵� : "+ id +" </p>");
		out.print("<p> ��й�ȣ : "+ pw +" </p>");
		out.print("<p> ��й�ȣ Ȯ�� : "+ pwC +" </p>");
		out.print("<p> ���� : "+ gender +" </p>");
		out.print("<p> ������ : "+ abo +" </p>");
		out.print("<p> ���� : "+ birth +" </p>");
		out.print("<p> ��� : "+ Arrays.toString(hobby) +" </p>");
		out.print("<p> �����ϴ� �� : "+ color +" </p>");
		out.print("<p> �ϰ���� �� : "+ talk +" </p>");
		
		
		
		
		
	}

}
