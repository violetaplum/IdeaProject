package telinfodao;

import telinfodbconn.TelInfoDBConn;
import telinfovo.TelInfoVO;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class TelInfoDAO {
    private Connection con; //java.sql.Connection
    PreparedStatement pstmt = null;
    ResultSet rs = null;    //전역
    //PreaparedStatement ps1 = null; 로 먼저 선언해놓고
    //밑에서 ps1 = new con.prepareStatement(String)

    //Connection.prepareStatement(String);
    //Connection.createStatement();
    //----------------------------------------------------------
    public TelInfoDAO() throws ClassNotFoundException,SQLException
    {
        con = new TelInfoDBConn().getConnection();

        //선언은 상단에서 하고
        //객체 생성은 TelInfoDAO의 생성자 안에서 한다.
        //접속객체 get --> con
    }
    //----------------------------------------------------------
    public void pstmtClose() throws SQLException
    {
        if(pstmt != null)
        {
            pstmt.close();  //박스 닫기 메소드
        }
    }
    public void getAllInfoClose() throws SQLException
    {
        if(rs!=null)            //연결들 끊기 메소드
        {
            rs.close();
        }
        if(pstmt!=null)
        {
            pstmt.close();
        }
        if(con!=null)
        {
            con.close();
        }
    }

    //전체출력을 위해 메소드 정의문 작성
    public ArrayList<TelInfoVO> getAllInfo() throws SQLException //DAO에서 conn을 이용하여 db에서 자료를 뽑아서 VO ArrayList에 넣고 뽑아 나중에 view로 보여줘야함
    {
        ArrayList<TelInfoVO> tiarray = new ArrayList<>();
        String sql = "select* from TelTable5 order by id";
        pstmt = con.prepareStatement(sql);
        rs = pstmt.executeQuery();//검색 명령어
        //결국 종이박스 안에 넣기

        while(rs.next())
        {
            //종이박스에서 꺼내기
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String tel = rs.getString("tel");
            Date d = rs.getDate("d");
            //table --> 변수에 넣기

            TelInfoVO tv = new TelInfoVO(id,name,tel,d);
            //VO 객체에 넣기
            tiarray.add(tv); //VO 객체 를 ArrayList<TelInfoVO> 에 넣기

        }
        return tiarray; //전체 내용이 들어있는 해당 컬렉션을 return
    }  //DAO를 전달할때 객체를 new하여 값을 가져오는것으로 인자전달이 이루어질것!!!
    //new를 하면 메모리에 올라가지게 된다!!

    public boolean update_nametel(String tel2,String name2)
    {//수정 method //이름 조건에 대해 전화번호만 수정하는!!
        //새로운 전화번호 및 수정대상 사원이름은 jsp로부터 온다
        //그리고 DB table로 저장된다
        String sql = "update TelTable5 set tel=? where name=?";
        try
        {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,tel2);
            pstmt.setString(2,name2);
            pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public TelInfoVO search_nametel(String oriName) throws SQLException{
        TelInfoVO tv=new TelInfoVO();
        String sql = "select * from TelTable5 where name=?";
        try
        {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,oriName);
            rs = pstmt.executeQuery();
            if(rs.next())
            {
                tv.setId(rs.getInt("id"));
                tv.setName(rs.getString("name"));
                tv.setTel(rs.getString("tel"));
                tv.setDate(rs.getDate("d"));

            }
            else
            {
                tv=null;
            }

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return tv;
    }

    public boolean delete_sawon(int id) {
        String sql="delete from TelTable5 where id=?";
        try {
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1, id);

            pstmt.executeQuery();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insert_sawon(int id,String name,String tel,String d) {
        String sql="insert into TelTable5 values(?,?,?,?)";
        try {
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, tel);
            pstmt.setDate(4,  java.sql.Date.valueOf(d));

            pstmt.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private PreparedStatement setString(int i, String name3) {
        // TODO Auto-generated method stub
        return null;
    }
}
