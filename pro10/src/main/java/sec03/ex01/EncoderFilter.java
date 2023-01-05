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
@WebFilter("/*") //���� : �������� �����۾�(ex:�ѱ� ���ڵ�)�� ó���ϴ� ����, /*�� �̿��� ��� �������� �� ���͸� ���� �����ϵ��� �Ѵ�.
public class EncoderFilter implements Filter { //����� ���� ���ʹ� Filter�������̽��� �����ؾ���
    
	ServletContext context;
	
    public EncoderFilter() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter ȣ��");
		request.setCharacterEncoding("utf-8");
		String context = ((HttpServletRequest)request).getContextPath();
		String pathinfo = ((HttpServletRequest)request).getRequestURI();
		String realPath = request.getRealPath(pathinfo);
		
		String mesg = "Context ���� :" + context + "<br>URI ���� : " + pathinfo + "<br>" + "������ ���� : " + realPath;
		System.out.println(mesg);
		long begin = System.currentTimeMillis(); //��û ó�� ���� �ð�
		
		
		chain.doFilter(request, response); //���� ���ͷ� �ѱ�� �۾��� ����
		
		long end = System.currentTimeMillis(); //��û ó�� ���� �ð� 
		System.out.println("�۾� �ð� : " + (end-begin) + "ms");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("utf-8 ���ڵ� ......");
		context = fConfig.getServletContext();
	}

}