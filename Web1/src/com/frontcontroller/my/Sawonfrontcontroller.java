package com.frontcontroller.my;

import imp.ImpDelete;
import imp.ImpGo;
import imp.ImpInsert;
import imp.ImpUpdate;
import telinfodao.TelInfoDAO;
import telinfovo.TelInfoVO;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


//@WebServlet("/Sawonfrontcontroller")
@WebServlet("*.do") //bo를 붙여도 된다. 하지만 다 do로 붙이기 때문에 이렇게 붙이는것
public class Sawonfrontcontroller extends HttpServlet {
    private String kaja = "";




    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //response.getWriter().append("Served at:");
        /*String ru1 = request.getRequestURI();*/
        /*System.out.println(ru1);*/ //MVC_SNS_Board
        /*String cp1 = request.getContextPath();*/
       /* System.out.println(cp1);*/ //MVC_SNS Board
       /* String c1 = ru1.substring(cp1.length());*/ //앞에 경로는 빼고 뒤에것만 출력되게함
        /*System.out.println(c1);*/ // /*.do
//jsp에서 넘어온게 getallinfo.do , update.do 를 구분할 수 있게 한다.
        String str = request.getRequestURI().substring(String.valueOf(request.getContextPath()).length());  //다 *.do로 오므로 뭐가 왔는지 알기위한 String
        /*System.out.println(str);*/

        /*
        /Web1_war_exploded/getAllInfo.do
        /Web1_war_exploded
        /getAllInfo.do
        상위가 server consol에 출력된다
        */

        /*insert.do 도 *.do를 찾아 오게 된다!!!! : 결국 뒤에 do만 붙으면 여기로 오게됨*/

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////telinsert
        if(str.equals("/insertOne.do"))
        {
            ImpInsert impi = new ImpInsert();
            try {
                impi.imp(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.kaja = impi.kaja;

        }else if(str.equals("/deleteOne.do"))
        {
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////teldelete
            ImpDelete impd = new ImpDelete();
            try {
                impd.imp(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.kaja = impd.kaja;

        }else if(str.equals("/updateOne2.do"))
        {
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////telupdate
            ImpUpdate impu = new ImpUpdate();
            try {
                impu.imp(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.kaja = impu.kaja;

        }else if(str.equals("/getAllInfo.do"))
        {   //////////////////////////////////////////////////////////////////////////////////////////////////////////////telallview
            ImpGo imp1 = new ImpGo();
            try {
                imp1.imp(request,response);

            } catch (Exception e) {
                e.printStackTrace();
            }
            kaja=imp1.kaja;
        }


        request.getRequestDispatcher(kaja).forward(request,response);
    }
}
