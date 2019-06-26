package teldeleteone;

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

@WebServlet("/Teldeleteone")
public class Teldeleteone extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String kaja = "";


        int id=Integer.parseInt(request.getParameter("id"));

        TelInfoDAO tidao = null;

        try {
            tidao=new TelInfoDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }



            boolean b = tidao.delete_sawon(id);
      if(b==true) {
            kaja = "getAllInfo.jsp";
            request.getRequestDispatcher(kaja).forward(request,response);
      }
      else{
          request.setAttribute("msg","Error Occured!");
          kaja="deleteError.jsp";
          request.getRequestDispatcher(kaja).forward(request,response);
      }






    }
}
