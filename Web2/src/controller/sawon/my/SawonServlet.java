package controller.sawon.my;

import model.sawon.vo.SawonVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SawonServlet")
public class SawonServlet extends HttpServlet {

    private static final long serialVersionUID=1L;
    public SawonServlet(){super();}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //jsp는 내장객체이므로 request를 모두 써주어야하는데
        //servlet은 외장객체이므로 내맘대로 객체이름을 바꿔줄 수 있다.
        //request : 받는쪽
        //response : 보내는쪽
        kaja(request,response); //메소드 2형식..
        //받은 request, response를 모두 받았으므로 어디로든 보낼 수 있다!!!
        //VO객체로 모두 넘겨줘야한다..
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            kaja(request,response);
    }
    private void kaja(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        SawonVO svo = new SawonVO(request.getParameter("name"),request.getParameter("tel"),request.getParameter("age"),request.getParameter("address"));

        //값을 가져가게 하기 위해 session과 비슷한 것이 필요하다..
        request.setAttribute("rsawon",svo); //값을 가져가게하는 request객체!!
        RequestDispatcher rd1 = request.getRequestDispatcher("./jspview/sawonView.jsp");
        //ReqeustDispatcher rd = request.getRequestDispatcher(String str) : 값을 보내준다
        rd1.forward(request,response);
        //HttpServletRequest.getRequestDispatcher(String str).forward(HttpServletRequest request, HttpServletResponse response);
    }

}
