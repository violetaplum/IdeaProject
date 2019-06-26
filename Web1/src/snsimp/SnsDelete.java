package snsimp;

import snsDAO.SnsDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SnsDelete implements Snsimp {
    public String kaja="";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        SnsDAO sd = null;
        int bunho = Integer.parseInt(request.getParameter("bunho"));

        sd = new SnsDAO();
        sd.delete_snsBun(bunho);
        kaja="snsAllview.jsp";

    }
}
