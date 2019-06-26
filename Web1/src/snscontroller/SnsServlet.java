package snscontroller;

import snsimp.SnsDelete;
import snsimp.SnsGo;
import snsimp.SnsInsert;
import snsimp.SnsUpdate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class SnsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public SnsServlet()
    {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
public String kaja="";
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String str = request.getRequestURI().substring(request.getContextPath().length());


        if(str.equals("/snsInsert.do"))
        {/////////////////////insert
            SnsInsert sii = new SnsInsert();
            try {
                sii.imp(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.kaja = sii.kaja;
        }else if(str.equals("/snsDelete.do"))
        {//////////////////////delete
            SnsDelete sdi = new SnsDelete();
            try {
                sdi.imp(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.kaja = sdi.kaja;
        }else if(str.equals("/snsUpdate.do"))
        {//////////////////////update
            SnsUpdate sui = new SnsUpdate();
            try {
                sui.imp(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.kaja = sui.kaja;
        }else if(str.equals("/snsAllview.do"))
        {///////////////////////allview
            SnsGo sai = new SnsGo();
            try {
                sai.imp(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.kaja = sai.kaja;
        }
        request.getRequestDispatcher(kaja).forward(request,response);
    }
}
