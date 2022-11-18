package com.example.DBZ_API.util;

i
        DevSuperior logo Semana Spring React - Episódio 2
        Crie um app completo para seu portfólio com as tecnologias mais demandadas do mercado

        Realização
        DevSuperior - Escola de programação

        DevSuperior no Instagram DevSuperior no Youtube

        Objetivos do projeto para esta aula
        Implementar o back end
        Acesso a banco de dados
        Criar endpoints da API REST
        Integração com SMS
        Implantação na nuvem
        AVISO: as aulas ficarão disponíveis somente até domingo às 23h59
        Checklist
        Ferramentas
        Postman (Vídeo: https://youtu.be/CWKLVapcnCU )
        Heroku CLI (Vídeo: https://youtu.be/70LUh5KNaEk )
        Passo: configuração de segurança
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.headers().frameOptions().disable();
        http.cors().and().csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeHttpRequests((auth) -> auth.anyRequest().permitAll());

        return http.build();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
        configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}