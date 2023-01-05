package sec03.ex01;

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
 * Servlet implementation class SessionTest2
 */
@WebServlet("/sess2")
public class SessionTest2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); //httpservletrequest�� �ִ� �޼����� getsession�� ���� ���ǰ�ü ����
		out.print("���� ���̵� : " + session.getId() + "<br>");
		out.print("���� ���� ���� �ð� : " + new Date(session.getCreationTime()) + "<br>");
		out.print("�ֱ� ���� ���� �ð� : " + new Date(session.getLastAccessedTime()) + "<br>");
		out.print("�⺻ ���� ��ȿ �ð� : " + session.getMaxInactiveInterval() + "<br>"); //��Ĺ�� �⺻ ���� ��ȿ�ð� ���
		session.setMaxInactiveInterval(5);
		out.print("���� ��ȿ �ð� : " + session.getMaxInactiveInterval() + "<br>");
		if(session.isNew()) {
			out.print("�� ������ ����������ϴ�.");
		}
		
		
	}

}
