package com.telservlet.my;

import telinfodao.TelInfoDAO;
import telinfovo.TelInfoVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/Telallview")
public class Telallview extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //business login start!!
        //현재 주석처리 된 부분과 하단의 주석처리가 안된 부분 두경우로 구현 가능하다

        /*String kaja=null;
        TelInfoDAO tidao1 = null;
        try {
            tidao1 = new TelInfoDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ArrayList<TelInfoVO> alist1 = tidao1.getAllInfo();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/


        String kaja=null;
        TelInfoDAO tidao1 = null;
        try {
            tidao1 = new TelInfoDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ArrayList<TelInfoVO> alist1 = null;

        try {
            alist1 = tidao1.getAllInfo(); //TelInfoDAO의 정보를 모두 Collection에 넣어버림
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("alist1",alist1); //try-catch가 들어가면서 완성됨

        kaja = "getAllInfo.jsp"; //컬렉션에 전부 들어있는 처리결과와 함께 jsp로 GOGO //자기가 자기에게 보내는것..

        RequestDispatcher rd1 = request.getRequestDispatcher(kaja);
        rd1.forward(request,response);

    }
}
