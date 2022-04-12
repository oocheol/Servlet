package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping : Servlet ���� (������ > �ߺ��Ǹ� �ȵ�)
@WebServlet("/Ex01_request")
							// HttpServlet Ŭ������ ��ӹ���
public class Ex01_request extends HttpServlet {
					// service �޼ҵ� : Java�� main �޼ҵ�� ���� ����
					// �Ű����� : request(��û), response(����)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. request ��ü : ����ڰ� ��û�� ���� �� ��û�� ���� ��� ������ ��� �ִ� ��ü
		//				ex) ��û�� ���� �ּ�, ����ڰ� �Է��� ����(id, pw) ��..
		
		// �ǽ�1. ��û�� ���� ip�ּ� Ȯ���ϱ�
		String client_ip = request.getRemoteHost();
		System.out.println("���� ��� : "+ client_ip);
		
		// �� ip�ּ� Ȯ���ϴ� ���
		// �˻� - cmd(���������Ʈ) - ipconfig - IPv4 �ּ�
		// 115.23.24.218
		// http://localhost:8081/Servlet/Ex01_request
		// http://115.23.24.218:8081/Servlet/Ex02_practice
		// �ٸ� ��ǻ�Ϳ��� �� ��ǻ�ͷ� ������ �ȵǸ� ��ȭ�� �����ϱ�!
		
		// 2. response ��ü : ����ڿ��� ������ �� �� ����ϴ� ��ü
		//					ex) html ����, ������ �̵�, text, img ���..
		
		// ���ڵ� 2����
		// 1. euc-kr : �ѱ����� �ʿ� (�׸� ��ĭ > ��)
		// 2. utf-8 : (��+��+��)
		
		// ������ �������� ���� ����
		response.setContentType("text/html; charset=euc-kr");
		
		// ���� ����ϱ� -> ����ڿ��� �����͸� ������ �� �ִ� ���
		PrintWriter out = response.getWriter();
		out.print("<h1> ����� ��ö�� ������ �Դϴ�. </h1>");
		
		// �̹��� ���
		// servlet�� ���� ��ġ : webapp
		// �����
		// �������� ..
		// �������� .
		// ��Ʈ /
		out.print("<img src='./imgFile/���ڸ�.png'>");
		
	}

}
