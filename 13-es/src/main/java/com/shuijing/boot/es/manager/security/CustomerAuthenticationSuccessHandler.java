package com.shuijing.boot.es.manager.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.shuijing.boot.es.common.Result;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-08-09
 */
@Component
public class CustomerAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        response.setCharacterEncoding(StandardCharsets.UTF_8.toString());

        if (isAjaxRequest(request)) {
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.getWriter().write(new ObjectMapper().writeValueAsString(Result.success()));
        } else {
            response.setContentType(MediaType.TEXT_HTML_VALUE);
            super.onAuthenticationSuccess(request, response, authentication);
        }
    }

    public static boolean isAjaxRequest(HttpServletRequest request) {
        String requestType = request.getHeader("X-Requested-With");
        return "XMLHttpRequest".equals(requestType);
    }
}
