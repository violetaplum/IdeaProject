package telinsertone;

import telinfodao.TelInfoDAO;
import telinfovo.TelInfoVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/Telinsertone")
public class Telinsertone extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

        tidao.insert_sawon(id,name,tel,sDate);

        request.setAttribute("check","true");

        String kaja="checkInsert.jsp";

        RequestDispatcher rd = request.getRequestDispatcher(kaja);
        rd.forward(request,response);



    }
}
