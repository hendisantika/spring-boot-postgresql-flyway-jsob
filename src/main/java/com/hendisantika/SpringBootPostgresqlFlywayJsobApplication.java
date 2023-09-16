package com.hendisantika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootPostgresqlFlywayJsobApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPostgresqlFlywayJsobApplication.class, args);
    }

//    @Configuration
//    static class OktaOAuth2WebSecurityConfigurerAdapter {
//        @Bean
//        public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//            http
//                    .authorizeHttpRequests().anyRequest().authenticated()
//                    .and()
//                    .oauth2ResourceServer().jwt();
//        }
//    }
}
