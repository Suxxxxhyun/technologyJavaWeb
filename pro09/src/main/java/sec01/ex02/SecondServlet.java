package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {

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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		String user_email = request.getParameter("user_email");
		//String user_hp = request.getParameter("user_hp");
		
		out.print("<html><body>");
		if(user_id!=null & user_id.length()!=0) {
			out.print("�̹� �α��� �����Դϴ�!");
			out.print("ù ��° �������� �Ѱ��� ���̵� : " + user_id);
			out.print("�� ��° �������� �Ѱ��� ��й�ȣ : " + user_pw);
			out.print("�� ��° �������� �Ѱ��� �ּ� : " + user_address );
			out.print("</body></html>");
		}else {
			out.print("�α��� ���� �ʾҽ��ϴ�.<br><br>");
			out.print("�ٽ� �α����϶�<br>");
			out.print("<a href='/pro09/login.html'>�α��� â���� �̵��ϱ�</a>");
		}
		
		System.out.println(user_address);
		
		
	}

}
