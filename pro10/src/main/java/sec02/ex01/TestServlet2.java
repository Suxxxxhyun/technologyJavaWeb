package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet2
 */
@WebServlet("/first/*")
public class TestServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; chartset=utf-8");
		PrintWriter out = response.getWriter();
		String context = request.getContextPath(); //���ؽ�Ʈ �̸��� 
		String url = request.getRequestURL().toString(); //url��ü 
		String mapping = request.getServletPath(); //mapping �̸��� 
		String uri = request.getRequestURI(); //uri�� ������
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Test Servlet</title>");
		out.print("</head>");
		out.print("<body bgcolor = 'yellow'>");
		out.print("<b>TestServlet1�Դϴ�.</b><br>");
		out.print("<b>���ؽ�Ʈ �̸� : " + context + "</b><br>");
		out.print("<b>��ü ��� : " + url + "</b><br>");
		out.print("<b>���� �̸� : " + mapping + "</b><br>");
		out.print("<b>URI : " + uri + "</b><br>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
