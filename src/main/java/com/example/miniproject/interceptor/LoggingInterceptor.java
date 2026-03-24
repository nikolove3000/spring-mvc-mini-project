package com.example.miniproject.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * Interceptor used to log HTTP request information and execution time
 * during the Spring MVC request lifecycle.
 *
 * <p>This interceptor performs two main tasks:</p>
 * <ul>
 *     <li>Logs incoming HTTP requests before they reach the controller.</li>
 *     <li>Calculates and logs the total processing time after request completion.</li>
 * </ul>
 *
 * <p>The start time of the request is stored as a request attribute
 * and later retrieved to compute the execution duration.</p>
 */
public class LoggingInterceptor implements HandlerInterceptor {

    /**
     * Executed before the target controller method is invoked.
     * This method records the start time of the request and logs
     * the HTTP method along with the requested URI.
     *
     * @param request  the current HTTP request
     * @param response the current HTTP response
     * @param handler  the chosen handler to execute
     * @return {@code true} to continue request processing;
     *         {@code false} to stop execution
     * @throws Exception if an error occurs during interception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        System.out.println("[REQUEST] " + request.getMethod() + " " +
                    request.getRequestURI());
        return true;
    }

    /**
     * Executed after the complete request has finished processing,
     * including view rendering.
     * This method retrieves the stored start time, calculates the
     * total processing duration, and logs the result.
     *
     * @param request  the current HTTP request
     * @param response the current HTTP response
     * @param handler  the executed handler
     * @param ex       exception thrown during execution (if any),
     *                 otherwise {@code null}
     * @throws Exception if an error occurs during completion handling
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        long startTime = (Long) request.getAttribute("startTime");
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("[COMPLETED] " + request.getRequestURI() + " - " + duration + "ms");
    }
}
