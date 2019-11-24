package controller;

import service.AtmService;
import util.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("all")
public class DoDepositController extends HttpServlet {

    private AtmService service = MySpring.getBean("service.AtmService");

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aname = request.getParameter("aname");
        String depositBalance = request.getParameter("depoistBalance");
        System.out.println("接收到了名字和存款金额:" + aname + "--" + depositBalance);
        //调用业务层的方法负责存钱
        service.deposit(aname, new Float(depositBalance));
        //--------------------------------------------------------------
        response.setCharacterEncoding("UTF-8");//设置 服务器向浏览器发送响应信息的字符集
        response.sendRedirect("/");
    }
}
