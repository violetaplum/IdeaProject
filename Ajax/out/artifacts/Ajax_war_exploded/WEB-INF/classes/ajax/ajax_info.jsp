<%@ page import="java.io.*" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-21
  Time: 오후 5:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%   //html 사용불가. Ajax가 가져가기 때문
    if("POST".equals(request.getMethod()))
    {
        request.setCharacterEncoding("utf-8"); //한글처리
    }

  /*  if("GET".equals(request.getMethod()))
    {
        name = new String(name.getBytes("8859_1"),"utf-8");
        요청에 대한 결과는 httpRequest.responseText로 처리함
        Ajax 는 text,xml만 가져올 수 있음
    }*/
String str = (String)request.getParameter("str");
String[] str2 = str.split(" ");

    String name = str2[0];
    String age = str2[1];
    String novel = str2[2];
    String path = application.getRealPath("./novel.txt");
/*    BufferedOutputStream bfo = new BufferedOutputStream(new FileOutputStream(path));
    BufferedReader br= new BufferedReader(new FileReader(path));
    ArrayList<String> array = new ArrayList<>();
    while(true)
    {
        String read = br.readLine();
        if(str==null) break;
        array.add(read);

    }
br.close();*/
  /*  BufferedInputStream bi = new BufferedInputStream(new FileInputStream(""));*/

%>

회원님
당신의 이름은 <%=name%> 이군요!!!
또한 나이는 <%=age%> 이구요..

novel :  <%=novel%>

