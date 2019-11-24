package session4.server.controller;


import session4.server.server.HttpServlet;
import session4.server.server.HttpServletRequest;
import session4.server.server.HttpServletResponse;

public class IndexController extends HttpServlet {
    //一个控制层

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response){
        //1.获取请求发送过来携带的参数?
        //2.找到某一个业务层的方法 做事
        //3.将最终业务层执行完毕的结果 交还给服务器 让服务器写回给浏览器
        response.sendRedirect("index.view");
    }

}
