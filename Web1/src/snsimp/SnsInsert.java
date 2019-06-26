package snsimp;

import snsDAO.SnsDAO;
import snsVO.SnsVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SnsInsert implements Snsimp {
    public String kaja="";
    @Override
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String snsjemok = (String)request.getParameter("snsjemok");
        String snswriter = (String)request.getParameter("snswriter");
        String snscontent = (String)request.getParameter("snscontent");

        SnsDAO sd = null;
        sd = new SnsDAO();
        sd.insert_sns(snsjemok,snswriter,snscontent);
        kaja="snsAllview.jsp";
    }
}
/*

    BUNHO                                     NOT NULL NUMBER(5)
    SNSJEMOK                                           VARCHAR2(30)
    SNSWRITER                                          VARCHAR2(30)
    SBSCONTENT                                         VARCHAR2(200)
    BASEBUN                                            NUMBER(5)
    DAETBUN                                            NUMBER(5)
    DAETDAETBUN                                        NUMBER(5)*/
