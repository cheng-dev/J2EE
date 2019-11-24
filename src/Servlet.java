import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xiao
 * @date 2019/11/15 上午 10:21
 */
public class Servlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("你好呀2233");
        System.out.println(resp.getCharacterEncoding());
        resp.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<html>");
        printWriter.write("<head>");
        printWriter.write("<meta charset=utf-8/>");
        printWriter.write("</head>");
        printWriter.write("<body>");
        printWriter.write("<h1>test 你好呀</h1>");
        printWriter.write("</body>");
        printWriter.write("</html>");

    }
}
