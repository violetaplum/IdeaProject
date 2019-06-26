package imp;

import telinfodao.TelInfoDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class ImpUpdate implements Imp {
    public String kaja = "";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String name = (String)request.getAttribute("name");
        String tel = request.getParameter("tel");

        boolean b = new TelInfoDAO().update_nametel(name,tel);


        if(b==true)
        {
            kaja = "getAllInfo.jsp";
            //request.getRequestDispatcher(kaja).forward(request,response);
        }
        else
        {
            kaja = "error.jsp";
            request.setAttribute("msg","Udate Error!! Try Agin..");
            //request.getRequestDispatcher(kaja).forward(request,response);
        }
    }

}
