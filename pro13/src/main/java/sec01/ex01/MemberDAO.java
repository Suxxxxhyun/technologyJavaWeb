package sec01.ex01;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private Connection con; //톰캣 실행시 커넥션풀 객체 생성이 되어 이 객체는 DBMS와 연결
	private PreparedStatement pstmt; //preparestatement는 statement와 다르게 미리 sql문을 컴파일해서 재사용함
	private DataSource dataFactory; //커넥션 풀 객체 만들기 위해 DATASOURCE클래스 사용
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext(); //JNDI에 접근하기 위해 기본경로 지정, 이때 JNDI는 DATASOURCE클래스를 이용해 만든 커넥션 풀 객체에 접근하기 위한 것.
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List listMembers() {
		
		List list = new ArrayList();
		
		try {
			con = dataFactory.getConnection();
			String query = "Select * from t_member order by joinDate desc";
			System.out.println("prepareStatement : " + query);
			pstmt = con.prepareStatement(query); //preparestatement메서드로 query가져와서 prepareStatement객체 생성
			ResultSet rs = pstmt.executeQuery(); //excuteQuery메서드를 통해 미리 설정해놓은 쿼리문 실행
			while(rs.next())
			{
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberBean vo = new MemberBean();
				vo.setId(id);
				vo.setId(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void addMember(MemberBean memberBean) {
		try {
			Connection con = dataFactory.getConnection();
			String id = memberBean.getId();
			String pwd = memberBean.getPwd();
			String name = memberBean.getName();
			String email = memberBean.getEmail();
			String query = "insert into t_member";
			query += "(id,pwd,name,email)";
			query += "values(?,?,?,?)";
			System.out.println("prepareStatement: " +query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setString(2,pwd);
			pstmt.setString(3,name);
			pstmt.setString(4,email);
			pstmt.executeUpdate();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
