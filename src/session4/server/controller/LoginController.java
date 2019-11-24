package session4.server.controller;

import session4.server.server.HttpServlet;
import session4.server.server.HttpServletRequest;
import session4.server.server.HttpServletResponse;

public class LoginController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        System.out.println(name+"---"+password);
    }
}
