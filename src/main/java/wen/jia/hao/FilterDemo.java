package wen.jia.hao;

import org.springframework.web.context.WebApplicationContext;
import wen.jia.hao.serviceImpl.AcountServiceImpl;

import javax.servlet.*;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * Created by Administrator on 2016/11/22 0022.
 */
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        WebApplicationContext  attribute = (WebApplicationContext) request.getServletContext().
                getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        AcountServiceImpl acountServiceImpl =(AcountServiceImpl) attribute.getBean("acountServiceImpl");
acountServiceImpl.AcountTransfer();
    }

    @Override
    public void destroy() {

    }


}
