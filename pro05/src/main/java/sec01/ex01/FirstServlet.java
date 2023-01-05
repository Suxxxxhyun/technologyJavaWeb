package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 메서드 호출");
	}

	@Override
	public void destroy() {
		System.out.println("doGet 메서드 호출");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}//사용자 정의 서블릿을 firstservlet이라는 이름으로 만듬{
	
}
