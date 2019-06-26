package snsimp;

import snsDAO.SnsDAO;
import snsVO.SnsVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;

public class SnsGo implements Snsimp {
    public String kaja;
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SnsDAO sd = null;
        try {
            sd = new SnsDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ArrayList<SnsVO> sa = null;

        try {
            sa = sd.getAllInfo(); //TelInfoDAO의 정보를 모두 Collection에 넣어버림
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("sa",sa); //try-catch가 들어가면서 완성됨

        kaja = "snsAllview.jsp"; //컬렉션에 전부 들어있는 처리결과와 함께 jsp로 GOGO //자기가 자기에게 보내는것..


    }
}

