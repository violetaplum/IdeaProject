package com.frontcontroller.my;

import snsimp.Snsimp;
import snsimp.SnsUpdate;
import snsimp.SnsDelete;
import snsimp.SnsGo;
import snsimp.SnsInsert;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class SnsServlet extends HttpServlet {
    public String kaja = "";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String str = request.getRequestURI().substring(String.valueOf(request.getContextPath()).length());

        if(str.equals("/snsInsert.do"))
        {
            SnsInsert impi = new SnsInsert();
            try {
                impi.imp(request,response);
                this.kaja = impi.kaja;
            } catch (Exception e) {
                e.printStackTrace();
            }


        }else if(str.equals("/snsDelete.do"))
        {
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////snsdelete
            SnsDelete impd = new SnsDelete();
            try {
                impd.imp(request,response);
                this.kaja = impd.kaja;
            } catch (Exception e) {
                e.printStackTrace();
            }


        }else if(str.equals("/snsUpdate2.do"))
        {
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////snsupdate
            SnsUpdate impu = new SnsUpdate();
            try {
                impu.imp(request,response);
                this.kaja = impu.kaja;
            } catch (Exception e) {
                e.printStackTrace();
            }


        }else if(str.equals("/getAllInfo.do"))
        {   //////////////////////////////////////////////////////////////////////////////////////////////////////////////snsallview
            SnsGo impg = new SnsGo();
            try {
                impg.imp(request,response);
                this.kaja=impg.kaja;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        request.getRequestDispatcher(kaja).forward(request,response);
    }
}
