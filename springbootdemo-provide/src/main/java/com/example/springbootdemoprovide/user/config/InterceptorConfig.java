//package com.example.springbootdemoprovide.user.config;
//
//import com.example.springbootdemoprovide.user.model.User;
//import com.example.springbootdemoprovide.user.service.TokenService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class InterceptorConfig implements HandlerInterceptor {
//
//    @Autowired
//    private TokenService tokenService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
//        System.out.println("执行了TestInterceptor的preHandle方法");
//        User user = null;
//
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null && cookies.length != 0) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals("token")) {
//                    String token = cookie.getValue();
//                    String name = tokenService.searchToken(token);
//                    if (name != null) {
//                             return true;
//                        } else {
//                            response.sendRedirect("user/login");
//                            return false;
//                        }
//                    }
//
//                }
//
//
//        } else {
//
//            return false;
//        }
//        user = (User) request.getSession().getAttribute("user");
//
//        if(user!=null){
//            return true;
//        }else{
//            response.sendRedirect("user/login");
//            return false;
//        }
//
//
//
//    }
//
//    /**
//     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
//     */
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
//        System.out.println("执行了TestInterceptor的postHandle方法");
//    }
//
//}
