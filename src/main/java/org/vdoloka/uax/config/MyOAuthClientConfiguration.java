package org.vdoloka.uax.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class MyOAuthClientConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth
                            .requestMatchers("/api/products").authenticated()
                            .requestMatchers("/api/swagger-ui/index.html").authenticated()
                            .requestMatchers("/1").permitAll()
                            .anyRequest().permitAll();
                })
                .oauth2Login(withDefaults())
                .build();
        //        return http
//                .authorizeHttpRequests(requests -> {
//                            requests.requestMatchers("/").permitAll();
//                            requests.requestMatchers("/secured").authenticated();
//                        }
//                )
//                .oauth2Login((login) -> login
//                        .redirectionEndpoint((endpoint) -> endpoint
//                                .baseUri("/login/oauth2/callback/*")
//                        )
//                )
//                .build();
    }
}
