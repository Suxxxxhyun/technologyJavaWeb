package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginTest
 */
/*@WebServlet("/login")*/
public class LoginTest extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); //httpservletrequest객체의 getsession메서드를 통해 session생성
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		LoginImpl loginUser = new LoginImpl(user_id, user_pw);
		if(session.isNew()) {
			session.setAttribute("loginUser", loginUser);
		}
		out.print("<head>");
		out.print("<script type = 'text/javascript'>");
		out.print("setTimeout('history.go(0);',5000)"); //setTimeout메서드를 통해 5초마다 서블릿에 재요청
		out.print("</script>");
		out.print("</head>");
		out.print("<html><body>");
		out.print("아이디는 : " + loginUser.user_id + "<br>");
		out.print("총 접속자수는 : " + LoginImpl.total_user + "<br>");
		out.print("</body></html>");
		
		
	}

}
