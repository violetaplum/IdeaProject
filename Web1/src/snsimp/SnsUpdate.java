package snsimp;

import snsDAO.SnsDAO;
import snsVO.SnsVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SnsUpdate implements Snsimp {
    public String kaja="";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        SnsDAO sd =null;
        SnsVO sv =null;

        String snsjemok = (String)request.getParameter("snsjemok");
        String snswriter = (String)request.getParameter("snswriter");
        String snscontent = (String)request.getParameter("snscontent");
        int bunho = Integer.parseInt(request.getParameter("bunho"));

        sd = new SnsDAO();
        sv = new SnsVO();

        sd.update_all(bunho,snsjemok,snswriter,snscontent);

        kaja = "snsAllview.jsp";

    }
}
