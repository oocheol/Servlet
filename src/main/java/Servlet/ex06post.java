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

	// doGet -> Get ��� ��û�� ���� ����
	// doPost -> Post ��� ��û�� ���� ����
	// �ֱ� Ʈ����� service �޼��常 ���
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. ���ڵ�
		// Get ��� ���ڵ�
		// Get ��� -> URL + ������Ʈ��
		// �޾ƿ��� �ּҸ� ���ڵ�
		// Servers ������Ʈ > Server.xml > Connector�±׿� URIEncoding
		// URI > URL + ������Ʈ��
		
		// Post��� ���ڵ�
		// Post > ��Ŷ�� Body�� ���
		// request ��ü�� ���ڵ� ����
		request.setCharacterEncoding("euc-kr");

		// 1. �Ķ���� ����
		String id = request.getParameter("id");
		String msg = request.getParameter("msg");
		
		// 2. ����
		// ���� ���� ����
		response.setContentType("text/html; charset=euc-kr");
		
		// PrintWriter ����
		PrintWriter out = response.getWriter();
		
		// ����
		// id : msg
		out.print(id + " : " + msg);
		
		
		
		
	}
	

}
