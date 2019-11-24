package controller;

import service.AtmService;
import util.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xiao
 * @date 2019/11/15 下午 9:19
 */
public class LoginController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("login 初始化");
    }

    private AtmService service = MySpring.getBean("service.AtmService");

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //0.告诉request才用如下的字符集进行组合 get请求没有影响因为是靠协议头的编码
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //1.获取请求发送过来的账号和密码
        String aname = request.getParameter("aname");
        String apassword = request.getParameter("apassword");
        System.out.println("接受到了浏览器发送过来的请求信息:" + aname + "--" + apassword);
        //2.负责处理一个业务判断---调用业务层的登录方法
        String result = service.login(aname, apassword);
        System.out.println("业务逻辑的判定结果最终为:" + result);
        //3.根据业务方法的执行结果  给予响应
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<meta charset='UTF-8'>");
        out.write("</head>");
        out.write("<body>");
        if ("登录成功".equals(result)) {
            out.write("****************************<br>");
            out.write("欢迎" + aname + "进入ATM系统<br>");
            out.write("****************************<br>");
            out.write("请输入操作选项<br>");
            out.write("<a href=\"inquiry?aname=" + aname + "\">查询</a><br>");//请求操作资源
            out.write("<a href=\"deposit?aname=" + aname + "\">存款</a><br>");//请求操作资源
            out.write("<a href=\"withdraw?aname=" + aname + "\">取款</a><br>");
            out.write("<a href=\"transferDis?aname=" + aname + "\">转账</a><br>");
        } else {
            out.write("对不起," + result);
        }
        out.write("</body>");
        out.write("</html>");
        out.flush();

    }
}
