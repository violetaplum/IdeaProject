package controller.jum.my;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Hakjum")
public class Hakjum extends HttpServlet {
    private static final long serialVersionUID=1L;
    public Hakjum(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("name");
        String jum1 = request.getParameter("jum");
        int jum = Integer.parseInt(jum1);

        String kaja=null;

        if(jum>=90)
        {
            kaja="A.jsp"; //jsp로 보내서 view역할을 준다
        }
        else if(jum>=80)
        {
            kaja="B.jsp"; //각각의 해당 jsp로 학점에 대한 결과(인자)를 가져가야 한다
        }
        else if(jum>=70)
        {
            kaja="C.jsp";
        }
        else if(jum>=60)
        {
            kaja="D.jsp";
        }
        else
        {
            kaja="F.jsp";
        }

        request.getRequestDispatcher("./jspview/"+kaja).forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
