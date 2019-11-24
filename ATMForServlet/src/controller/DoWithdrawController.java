package controller;

import org.apache.jasper.tagplugins.jstl.core.Out;
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
@WebServlet(urlPatterns = "/doWithdraw")
public class DoWithdrawController extends HttpServlet {
    AtmService atmService = MySpring.getBean("service.AtmService");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String with = req.getParameter("money");
        String aname = req.getParameter("aname");
        resp.setCharacterEncoding("UTF-8");
        Float f = Float.valueOf(with);

        PrintWriter out = resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<meta charset = 'utf-8'>");
        out.write("</head>");
        out.write("<body>");

        try {
            atmService.withdraw(aname, f);
            out.write("取款" + with + "成功");
        } catch (Exception e) {
            e.printStackTrace();
            out.write("取款失败");
        }
        out.write("</body>");
        out.write("</html>");
    }
}
