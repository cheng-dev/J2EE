package controller;

import service.AtmService;
import util.MySpring;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xiao
 * @date 2019/11/23 下午 8:04
 */
@WebServlet(urlPatterns = "/withdraw")
public class WithdrawController extends HttpServlet {
    AtmService atmService = MySpring.getBean("service.AtmService");

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String aname = req.getParameter("aname");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<meta charset = 'utf-8'>");
        out.write("</head>");
        out.write("<body>");
        out.write("<form action = 'doWithdraw' method='post'>");
        out.write("请输入取款金额:");
        out.write("<input type='text' name='money' value='' >");
        out.write("<br>");
        out.write("<input type='hidden' name='aname' value='" + aname + "'>");
        out.write("<input type='submit' value='提交'>");
        out.write("</form>");


        out.write("</body>");
        out.write("</html>");
    }
}
