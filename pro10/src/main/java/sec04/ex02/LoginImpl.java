package sec04.ex02;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class LoginImpl implements HttpSessionListener {
	
	String user_id;
	String user_pw;
	static int total_user = 0;
	
    public LoginImpl() {
       
    }
    
    public LoginImpl(String user_id, String user_pw) {
        this.user_id = user_id;
        this.user_pw = user_pw;
    }

    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("技记 积己");
        ++total_user;
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
        System.out.println("技记 昏力");
        total_user--;
    }
	
}
