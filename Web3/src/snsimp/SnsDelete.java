package snsimp;

import snsDAO.SnsDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SnsDelete implements snsimp.Snsimp {
    public String kaja="";
    public String msg = "";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        SnsDAO sd = null;
        String bunho = request.getParameter("bunho");
        int bunho2 = Integer.parseInt(bunho);


        boolean b = new SnsDAO().delete_snsBun(bunho2);
        if(b==true)
        {
            msg="Delete Success!!";
            request.setAttribute("msg",msg);
            kaja="./error.jsp";
        }
        else
        {
            msg="Delete Failed!!";
            request.setAttribute("msg",msg);
            kaja="./error.jsp";
        }


    }
}
