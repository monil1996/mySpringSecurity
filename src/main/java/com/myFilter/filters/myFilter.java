package com.myFilter.filters;

import javax.servlet.*;
import java.io.IOException;

public class myFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        request.setAttribute("Name", "Monil");
        System.out.println("In myFilter");
        chain.doFilter(request, response);
    }
}
