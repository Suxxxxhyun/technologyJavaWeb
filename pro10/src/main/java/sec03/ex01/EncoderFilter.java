package sec03.ex01;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class EncoderFilter
 */
@WebFilter("/*") //필터 : 서블릿의 공통작업(ex:한글 인코딩)을 처리하는 공간, /*를 이용해 모든 서블릿이 이 필터를 먼저 실행하도록 한다.
public class EncoderFilter implements Filter { //사용자 정의 필터는 Filter인터페이스를 구현해야함
    
	ServletContext context;
	
    public EncoderFilter() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter 호출");
		request.setCharacterEncoding("utf-8");
		String context = ((HttpServletRequest)request).getContextPath();
		String pathinfo = ((HttpServletRequest)request).getRequestURI();
		String realPath = request.getRealPath(pathinfo);
		
		String mesg = "Context 정보 :" + context + "<br>URI 정보 : " + pathinfo + "<br>" + "물리적 정보 : " + realPath;
		System.out.println(mesg);
		long begin = System.currentTimeMillis(); //요청 처리 전의 시각
		
		
		chain.doFilter(request, response); //다음 필터로 넘기는 작업을 수행
		
		long end = System.currentTimeMillis(); //요청 처리 후의 시각 
		System.out.println("작업 시간 : " + (end-begin) + "ms");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("utf-8 인코딩 ......");
		context = fConfig.getServletContext();
	}

}
