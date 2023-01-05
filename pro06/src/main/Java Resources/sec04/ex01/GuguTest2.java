package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuguTest2
 */
@WebServlet("/guguTest2")
public class GuguTest2 extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); //서블릿에서 웹브라우저로 데이터를 보내줄때 데이터종류가 html임을 setcontenttype으로 알려줌
		PrintWriter out = response.getWriter(); //서블릿에서 웹브라우저로 보내는 데이터를 출력할거임 
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		out.print("<table border=1 width=800 align=center>");
		out.print("<tr align=center>");
		out.print("<td colspan=2>" + dan + "단 출력 </td>");
		out.print("</tr>");
		
		for(int i=1; i<10; i++) 
		{
			if(i%2 == 0) {
				out.print("<tr align=center bgcolor='#ACFA58'>");
			} else{
				out.print("<tr align=center bgcolor='#81BEF7'>");
			}
			out.print("<td width=400>");
			out.print(dan + "*" + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(i * dan);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
