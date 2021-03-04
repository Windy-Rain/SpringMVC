package com.zx.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: com.zx.servlet
 * @version: 1.0
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String method = req.getParameter("method");
        System.out.println(method);
        if ("add".equals(method)){
            req.setAttribute("msg","执行了"+method+"方法");
        }else if ("delete".equals(method)){
            req.setAttribute("msg","执行了"+method+"方法");
        }else {
            req.setAttribute("msg","执行了"+method+"方法");
        }
        req.getRequestDispatcher("/WEB-INF/jsp/text.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
