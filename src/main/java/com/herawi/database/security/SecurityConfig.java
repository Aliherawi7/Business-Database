package com.herawi.database.security;//package com.herawi.database.security;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.access.AccessDeniedHandler;
//
//@EnableWebSecurity
//@Configuration
//@RequiredArgsConstructor
//public class SecurityConfig {
//    private final AccessDeniedHandler accessDeniedHandler;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password(passwordEncoder().encode("password")).roles("USER")
//                .and()
//                .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
//    }
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
////        return httpSecurity
////                .auth
////                .formLogin(httpSecurityFormLoginConfigurer -> {
////                    httpSecurityFormLoginConfigurer
////                            .failureUrl("/login-error.html")
////                            .loginPage("login.html");
////                }).logout(httpSecurityLogoutConfigurer -> {
////                    httpSecurityLogoutConfigurer.logoutUrl("/logout.html")
////                            .permitAll();
////        });
////    }
//
//
//}