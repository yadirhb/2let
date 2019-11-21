package edu.mum.cs.waa.interceptor;

import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class PerformanceMonitorInterceptor implements HandlerInterceptor {
    ThreadLocal<StopWatch> stopWatchLocal = new ThreadLocal<>();
    Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    UserService userService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StopWatch stopWatch = new StopWatch(handler.toString());
        stopWatch.start(handler.toString());
        stopWatchLocal.set(stopWatch);

        logger.info("Accessing URL path: " + getURLPath(request));
        logger.info("Request processing started on: " + getCurrentTime());
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("Request processing ended on " + getCurrentTime());

        Principal principal = request.getUserPrincipal();
        if (principal != null) {
            if (request.isUserInRole("ROLE_ADMIN"))
                System.out.println("User Is Admin");
            else
                System.out.println("User is not admin");

        }
    }

    public void afterCompletion(HttpServletRequest request,	HttpServletResponse response, Object handler, Exception exception) throws Exception {
        StopWatch stopWatch = stopWatchLocal.get();
        stopWatch.stop();

        logger.info("Total time taken for processing: " + stopWatch.getTotalTimeMillis()+ " ms");
        stopWatchLocal.set(null);
        logger.info("=======================================================");
    }

    private String getURLPath(HttpServletRequest request) {
        String currentPath = request.getRequestURI();
        String queryString = request.getQueryString();
        queryString = queryString == null ? "" : "?" + queryString;
        return currentPath+queryString;
    }

    private String getCurrentTime() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return formatter.format(calendar.getTime());
    }
}
