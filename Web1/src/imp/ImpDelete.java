package imp;

import telinfodao.TelInfoDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class ImpDelete implements Imp {
    public String kaja="";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

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
            // request.getRequestDispatcher(kaja).forward(request,response);
        }
        else{
            request.setAttribute("msg","Error Occured!");
            kaja="deleteError.jsp";
            // request.getRequestDispatcher(kaja).forward(request,response);
        }
    }
}
