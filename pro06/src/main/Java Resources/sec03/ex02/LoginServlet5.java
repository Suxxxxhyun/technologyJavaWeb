package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet5
 */
@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {
	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); //�������� ���������� ������ �������� ������ html�������� setcontenttype�� �̿��� �˷��ְ����� 
		PrintWriter out = response.getWriter(); // ���������� ������ ����� ���� printwriter�� �̿��� ���
		String id = request.getParameter("user_id"); //login2.html �� �̸����� user_id�� ���� id�� �־���
		String pw = request.getParameter("user_pw"); 
		String address = request.getParameter("user_address");
		System.out.println("���̵�: " + id);
		System.out.println("��й�ȣ: " + pw);
		
		String data = "<html>";
		data += "<body>";
		data += "���̵� : " + id;
		data += "<br>";
		data += "�н����� : " + pw;
		data += "<br>";
		data += "�ּ� : " + address;
		data += "</body>";
		data += "</html>";
		out.print(data);
	}

}
