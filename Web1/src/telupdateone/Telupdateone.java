package telupdateone;

import telinfodao.TelInfoDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Telupdateone")
public class Telupdateone extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String kaja = "";

        TelInfoDAO tdao = null;
        try {
            tdao = new TelInfoDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String name = (String)request.getAttribute("name");
        String tel = request.getParameter("tel");



        boolean b = tdao.update_nametel(tel,name);

        if(b==true)
        {
            kaja = "getAllInfo.jsp";
            request.getRequestDispatcher(kaja).forward(request,response);
        }
        else
        {
            kaja = "error.jsp";
            request.setAttribute("msg","Udate Error!! Try Agin..");
            request.getRequestDispatcher(kaja).forward(request,response);
        }

    }
}
