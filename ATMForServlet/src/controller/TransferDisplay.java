package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xiao
 * @date 2019/11/23 下午 8:42
 */
@WebServlet(urlPatterns = "/transferDis")
public class TransferDisplay extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameter("aname");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<mead charset = 'utf-8'>");
        out.write("<head>");
        out.write("<body>");
        out.write("<form method='post' action='transfer'>");
        out.write("请输入收款人:");
        out.write("<input value='' name= 'name' type = 'text'");
        out.write("<input value='' name= 'aname' type = 'hidden'");
        out.write("请输入转账金额:");
        out.write("<input value='' name= 'money' type = 'text'");
        out.write("<input type='submit' value='提交' ");
        out.write("</body>");
        out.write("</html>");

    }
}
