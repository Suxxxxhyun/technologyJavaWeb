package sec02.ex01;

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
	private Connection con; //��Ĺ ����� Ŀ�ؼ�Ǯ ��ü ������ �Ǿ� �� ��ü�� DBMS�� ����
	private PreparedStatement pstmt; //preparestatement�� statement�� �ٸ��� �̸� sql���� �������ؼ� ������
	private DataSource dataFactory; //Ŀ�ؼ� Ǯ ��ü ����� ���� DATASOURCEŬ���� ���
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext(); //JNDI�� �����ϱ� ���� �⺻��� ����, �̶� JNDI�� DATASOURCEŬ������ �̿��� ���� Ŀ�ؼ� Ǯ ��ü�� �����ϱ� ���� ��.
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
			pstmt = con.prepareStatement(query); //preparestatement�޼���� query�����ͼ� prepareStatement��ü ����
			ResultSet rs = pstmt.executeQuery(); //excuteQuery�޼��带 ���� �̸� �����س��� ������ ����
			while(rs.next())
			{
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberBean vo = new MemberBean();
				vo.setId(id);
				vo.setPwd(pwd);
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
