package snsDAO;

import snsCONN.SnsCONN;
import snsVO.SnsVO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SnsDAO {
    private Connection conn;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    public SnsDAO() throws ClassNotFoundException,SQLException
    {
        conn = new SnsCONN().getConnection();
    }
    public void pstmtClose() throws SQLException
    {
        if(pstmt!=null)
        {
            pstmt.close();
        }
    }

    public void getAllInfoClose() throws SQLException
    {
        if(rs!=null)
        {
            rs.close();
        }
        if(pstmt != null) {
            pstmt.close();
        }
        if(conn != null) {
            conn.close();
        }
    }

    public ArrayList<SnsVO> getAllInfo() throws SQLException
    {
        ArrayList<SnsVO> snsarray = new ArrayList<>();
        String sql = "select * from mvcsnsboard";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        rs = pstmt.executeQuery();
/*
        Name                                      Null?    Type
            ----------------------------------------- -------- ----------------------------
            BUNHO                                     NOT NULL NUMBER(5)
        SNSJEMOK                                           VARCHAR2(30)
        SNSWRITER                                          VARCHAR2(30)
        SBSCONTENT                                         VARCHAR2(200)
        BASEBUN                                            NUMBER(5)
        DAETBUN                                            NUMBER(5)
        DAETDAETBUN                                        NUMBER(5)*/

        while(rs.next())
        {
            int bunho = rs.getInt("BUNHO");
            String snsjemok = rs.getString("SNSJEMOK");
            String snswriter = rs.getString("SNSWRITER");
            String snscontent = rs.getString("SBSCONTENT");
            int basebun = rs.getInt("BASEBUN");
            int daetbun = rs.getInt("DAETBUN");
            int daetdaetbun = rs.getInt("DAETDAETBUN");

            SnsVO snsvo = new SnsVO(bunho,snsjemok,snswriter,snscontent,basebun,daetbun,daetdaetbun);
            snsarray.add(snsvo);

        }
        return snsarray;
    }
    //제목,작성자,내용만 뜨게
    public boolean update_all(int bunho,String snsjemok,String snswriter,String snscontent) throws SQLException
    {
        String sql = "update mvcsnsboard set (snsjemok,snswriter,sbscontent,basebun)=(?,?,?,?) where bunho=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,snsjemok);
        pstmt.setString(2,snswriter);
        pstmt.setString(3,snscontent);
        pstmt.setInt(4,bunho);


        pstmt.executeUpdate();

        return true;
    }
    public SnsVO getInfo(int bunho) throws SQLException
    {
        SnsVO sv = null;
        String sql = "select* from mvcsnsboard where bunho=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,bunho);
        rs = pstmt.executeQuery();
        if(rs.next())
        {
            String snsjemok = rs.getString("SNSJEMOK");
            String snswriter = rs.getString("SNSWRITER");
            String snscontent = rs.getString("SBSCONTENT");
            int basebun = rs.getInt("BASEBUN");
            int daetbun = rs.getInt("DAETBUN");
            int daetdaetbun = rs.getInt("DAETDAETBUN");
            sv = new SnsVO(bunho,snsjemok,snswriter,snscontent,basebun,daetbun,daetdaetbun);
        }else{
            sv = null;
        }
        return sv;
    }

    public boolean insert_sns(String snsjemok,String snswriter,String snscontent) throws SQLException
    {
        /*insert into MVCSNSBOARD
        values(mvcsnsboard_sequence1.NEXTVAL,'sns','aa','bb',mvcsnsboard_sequence1.CURRVAL,0,0)*/;
        String sql = "insert into mvcsnsboard values(mvcsnsboard_sequence1.NEXTVAL,?,?,?,mvcsnsboard_sequence1.CURRVAL,0,0)";

        pstmt.setString(1,snsjemok);
        pstmt.setString(2,snswriter);
        pstmt.setString(3,snscontent);


        pstmt.executeUpdate();

        return true;
    }
    public boolean delete_snsBun(int bunho) throws SQLException
    {
        String sql = "delete mvcsnsboard where bunho = ?";

        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,bunho);
        pstmt.executeUpdate();
        return true;
    }
}
