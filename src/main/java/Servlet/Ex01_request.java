package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping : Servlet ����
@WebServlet("/Ex01_request")
							// HttpServlet Ŭ������ ��ӹ���
public class Ex01_request extends HttpServlet {
					// service �޼ҵ� : Java�� main �޼ҵ�� ���� ����
					// �Ű����� : request(��û), response(����)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. request ��ü : ����ڰ� ��û�� ���� �� ��û�� ���� ��� ������ ��� �ִ� ��ü
		//				ex) ��û�� ���� �ּ�, ����ڰ� �Է��� ����(id, pw) ��..
		
		// �ǽ�1. ��û�� ���� ip�ּ� Ȯ���ϱ�
		request.getRemoteHost();
		
		
	}

}
