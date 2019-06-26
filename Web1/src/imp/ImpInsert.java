package imp;

import telinfodao.TelInfoDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class ImpInsert implements Imp {
    public String kaja = "";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //4개의 필드를 모두 입력받아 dao를 통해 DB에 저장해야함
        //제대로 저장됐으면 true, 아니면 false

        TelInfoDAO tidao = null;
        try {
            tidao = new TelInfoDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int id = Integer.parseInt(request.getParameter("id"));
        String name = (String)request.getParameter("name");
        String tel = (String)request.getParameter("tel");
        String sDate = (String)request.getParameter("date");

        boolean b = tidao.insert_sawon(id,name,tel,sDate);


        request.setAttribute("check",b);

        kaja="checkInsert.jsp";

        // RequestDispatcher rd = request.getRequestDispatcher(kaja);
        // rd.forward(request,response);
    }
}
