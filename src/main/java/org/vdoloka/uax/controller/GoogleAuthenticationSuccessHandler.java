package org.vdoloka.uax.controller;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class GoogleAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
//    private final UsersService usersService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {
        AuthenticationSuccessHandler.super.onAuthenticationSuccess(request, response, chain, authentication);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException , ServletException {
        OAuth2User oauth2User = (DefaultOAuth2User) authentication.getPrincipal();
        String userSub = oauth2User.getAttribute("sub");
//        if (usersService.isGoogleUserExist(userSub)) {
//            response.sendRedirect(request.getContextPath() + "/orders");
//        } else {
//            usersService.createUser(oauth2User);
//            response.sendRedirect(request.getContextPath() + "/profile");
//        }
        System.out.println(userSub);
    }
}