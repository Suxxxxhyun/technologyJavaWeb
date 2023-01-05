package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
/*@WebServlet("/second") */
public class SecondServlet extends HttpServlet { //�������̼��� �̿��� �����̸��� �ݵ�� httpServlet�� ��ӹ޾ƾ��� 
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("SecondServlet init �޼��� ȣ��");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("SecondServlet destroy �޼��� ȣ��");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SecondServlet doGet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
