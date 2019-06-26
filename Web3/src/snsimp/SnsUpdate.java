package snsimp;

import snsDAO.SnsDAO;
import snsVO.SnsVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SnsUpdate implements Snsimp {
    public String kaja="";
    public String msg="";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");



        String snscontent = (String)request.getParameter("content");
        int bunho = Integer.parseInt((String)request.getAttribute("bunho"));

        boolean b = new SnsDAO().update_all(bunho,snscontent);

        if(b==true)
        {
            msg="Update Success!!";
            request.setAttribute("msg",msg);
            kaja="./error.jsp";
        }
        else
        {
            msg="Update Failed.. Try Again....";
            request.setAttribute("msg",msg);
            kaja="./error.jsp";
        }

    }
}
