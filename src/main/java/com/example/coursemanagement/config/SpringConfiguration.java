package com.example.coursemanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfiguration {

      /* @Bean
       public PasswordEncoder passwordencoder(){
           return new BCryptPasswordEncoder();
       }
       */


        @Bean
        SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http.
                    csrf((csrf) ->csrf.disable())
                    .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }

         InMemoryUserDetailsManager userDetails(){
            UserDetails admin= User.builder().username("admin")
                    .password("admin")
                    .roles("ADMIN")
                    .build();

            UserDetails Manobalan =User.builder().username("Manobalan")
                    .password("Manobalan@0809")
                    .roles("USER")
                    .build();
            return new InMemoryUserDetailsManager(admin,Manobalan);

        }

}
