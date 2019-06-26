package telinfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import telinfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;

public class TelInfoDAO {
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public TelInfoDAO() throws ClassNotFoundException, SQLException {
		con = new TelInfoDBConn().getConnection();
	}
	
	public void pstmtClose() throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}
	}
	
	public void getAllInfoClose() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	public ArrayList<TelInfoVO> getAllInfo() throws SQLException{
		ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
		String sql = "SELECT * FROM TelTable5 ORDER BY id";
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			Date d = rs.getDate("d");
			
			TelInfoVO tiv = new TelInfoVO(id, name, tel, d);
			
			tiarray.add(tiv);
		}
		
		return tiarray;
	}
					//새로운 전화번호 및 수정대상 사원이름은 jsp로부터 온다.
	public boolean update_nametel(String tel2, String name2) throws SQLException {
		//수정은 이름조건에 대하여 전화번호만 수정, 그리고 DB테이블로 저장된다.
		String sql ="update TelTable5 set tel=? where name=?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, tel2);
		pstmt.setString(2, name2);
		pstmt.executeUpdate();
		
		return true;
	}
	
	public boolean update_all(int id1, String name1, String tel1, String d, String sname) throws SQLException {
		String sql ="update TelTable5 set id=?, name=?, tel=?, d=TO_DATE(?,'YYYY-MM-DD') where name=?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id1);
		pstmt.setString(2, name1);
		pstmt.setString(3, tel1);
		pstmt.setString(4, d);
		pstmt.setString(5, sname);
		
		pstmt.executeUpdate();
		
		return true;
	}
	public TelInfoVO getInfo(String name1) throws SQLException {
		TelInfoVO tv = null;
		String sql = "select * from teltable5 where name = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name1);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String tel = rs.getString(3);
			Date d = rs.getDate(4);
			tv = new TelInfoVO(id,name,tel,d);
		}else {
			tv = null;
		}
		return tv;
	}
	
	public boolean insert_nametel(int id, String name, String tel, String d) throws SQLException {
		String sql = "INSERT into TelTable5 values(?,?,?,?)";
			
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, tel);
		
		int year = Integer.parseInt(d.substring(0, 4)) - 1900;
		int month = Integer.parseInt(d.substring(4, 6)) -1;
		int day = Integer.parseInt(d.substring(6, 8));
		Date date = new Date(year, month, day);
		pstmt.setDate(4, date);
		
		pstmt.executeUpdate();
		
		return true;
	}	
	public boolean delete_nametel(String name) throws SQLException {
		String sql = "DELETE TelTable5 WHERE name = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.executeUpdate();
		return true;
	}
}
