package com.example.coursemanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SpringConfiguration {

      @Bean
       public PasswordEncoder passwordencoder(){
           return new BCryptPasswordEncoder();
       }



        @Bean
        SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http.
                    csrf((csrf) ->csrf.disable())
                    .authorizeHttpRequests(auth ->{
                       // auth.requestMatchers(HttpMethod.POST,"/Instructor").hasRole("ADMIN");
                       // auth.requestMatchers(HttpMethod.PUT,"/Instructor").hasRole("ADMIN");
                       // auth.requestMatchers(HttpMethod.GET,"/**").hasAnyRole("ADMIN","USER");
                        auth.anyRequest().authenticated();
                    }
                            )
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }

        @Bean
        UserDetailsService userDetails(){
            UserDetails admin= User.builder().
                    username("admin")
                    .password(passwordencoder().encode("admin"))
                    .roles("ADMIN")
                    .build();

            UserDetails Manobalan =User.builder().
                    username("Manobalan")
                    .password(passwordencoder().encode("Manobalan@0809"))
                    .roles("USER")
                    .build();
            return new InMemoryUserDetailsManager(admin,Manobalan);

        }

}
