package telsearchone;

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

@WebServlet("/Telsearchone")
public class Telsearchone extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");


        String name=(String)request.getParameter("name");

        TelInfoDAO tidao = null;
        TelInfoVO tivo = null;

        try {
            tidao=new TelInfoDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            tivo = tidao.search_nametel(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String kaja="searchOne.jsp";

                request.setAttribute("tivo",tivo);
                RequestDispatcher rd = request.getRequestDispatcher(kaja);
                rd.forward(request,response);



    }
}
