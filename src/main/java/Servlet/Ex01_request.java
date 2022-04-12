package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping : Servlet 별명 (고유값 > 중복되면 안됨)
@WebServlet("/Ex01_request")
							// HttpServlet 클래스를 상속받음
public class Ex01_request extends HttpServlet {
					// service 메소드 : Java의 main 메소드와 같은 역할
					// 매개변수 : request(요청), response(응답)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. request 객체 : 사용자가 요청을 했을 때 요청에 대한 모든 정보를 담고 있는 객체
		//				ex) 요청이 들어온 주소, 사용자가 입력한 정보(id, pw) 등..
		
		// 실습1. 요청이 들어온 ip주소 확인하기
		String client_ip = request.getRemoteHost();
		System.out.println("들어온 사람 : "+ client_ip);
		
		// 내 ip주소 확인하는 방법
		// 검색 - cmd(명령프롬프트) - ipconfig - IPv4 주소
		// 115.23.24.218
		// http://localhost:8081/Servlet/Ex01_request
		// http://115.23.24.218:8081/Servlet/Ex02_practice
		// 다른 컴퓨터에서 내 컴퓨터로 접속이 안되면 방화벽 해제하기!
		
		// 2. response 객체 : 사용자에게 응답을 할 때 사용하는 객체
		//					ex) html 문서, 페이지 이동, text, img 등등..
		
		// 인코딩 2가지
		// 1. euc-kr : 한국어팩 필요 (네모 한칸 > 박)
		// 2. utf-8 : (ㅂ+ㅏ+ㄱ)
		
		// 응답할 페이지에 대한 설정
		response.setContentType("text/html; charset=euc-kr");
		
		// 웹에 출력하기 -> 사용자에게 데이터를 전달할 수 있는 통로
		PrintWriter out = response.getWriter();
		out.print("<h1> 여기는 우철의 페이지 입니다. </h1>");
		
		// 이미지 출력
		// servlet의 실행 위치 : webapp
		// 상대경로
		// 상위폴더 ..
		// 현재폴더 .
		// 루트 /
		out.print("<img src='./imgFile/리자몽.png'>");
		
	}

}
