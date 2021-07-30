package com.allen;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class allen implements Servlet{

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init");
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("From service");
        PrintWriter out = response.getWriter();
        out.println("Hello, Java web");
    }

    public void destroy() {
        System.out.println("Destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }

}
