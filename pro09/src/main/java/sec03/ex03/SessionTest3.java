package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest3
 */
@WebServlet("/sess3")
public class SessionTest3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); //httpServletrequest �޼��忡 �ִ� getsession�� ���� httpsession��ü ����
		out.print("���� ���̵� : " + session.getId() + "<br>");
		out.print("���� ���� ���� �ð� : " + new Date(session.getCreationTime()) + "<br>" );
		out.print("�ֱ� ���� ���� �ð� : " + new Date(session.getLastAccessedTime()) + "<br>");
		out.print("���� ��ȿ �ð� : " + session.getMaxInactiveInterval() + "<br>");
		if(session.isNew()) {
			out.print("�� ������ ����������ϴ�.");
		}
		session.invalidate(); //���� ������ ������ �Ҹ��Ŵ
		
		
	}

}
