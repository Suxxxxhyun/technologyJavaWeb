package sec03.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest4
 */
/*@WebServlet("/login")*/
public class SessionTest4 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); //httpservletrequest �޼����� getsession�� ���� httpsession��ü ����
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		if(session.isNew()) {
			if(user_id!=null) {
				session.setAttribute("user_id", user_id ); //session�Ӽ� �̸��� user_id�� �Ӽ��� user_id�� �Ҵ�
				out.print("<a href='login'>�α��� ���� Ȯ��</a>");
			} else {
				out.print("<a href='login2.html'>�ٽ� �α��� �ض�</a>");
				session.invalidate(); // ���� �Ҹ��Ŵ
			}
		} else { //������ ������ �̹� �ִٸ�
			user_id = (String) session.getAttribute("user_id"); //�Ӽ� �̸��� user_id�� �Ӽ� ���� objectŸ������ ��ȯ
			if(user_id != null && user_id.length() != 0) {
				out.print("�ȳ��ϼ���" + user_id + "��");
			} else {
				out.print("<a href='login2.html'>�ٽ� �α��� �ض�!!!</a>");
				session.invalidate(); // ���� �Ҹ��Ŵ
			}
		}
		
	}
	
	

}
