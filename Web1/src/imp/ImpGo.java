package imp;

import telinfodao.TelInfoDAO;
import telinfovo.TelInfoVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;

public class ImpGo implements Imp {
    public String kaja;
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        TelInfoDAO tidao1 = null;
        try {
            tidao1 = new TelInfoDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ArrayList<TelInfoVO> alist1 = null;

        try {
            alist1 = tidao1.getAllInfo(); //TelInfoDAO의 정보를 모두 Collection에 넣어버림
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("alist1",alist1); //try-catch가 들어가면서 완성됨

        kaja = "getAllInfo.jsp"; //컬렉션에 전부 들어있는 처리결과와 함께 jsp로 GOGO //자기가 자기에게 보내는것..


    }
}
