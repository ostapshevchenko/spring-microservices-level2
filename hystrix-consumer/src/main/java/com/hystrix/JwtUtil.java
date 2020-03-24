package com.hystrix;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken() {
        return "mckdsmckdslcmsdlkc";
    }

    public Boolean validateToken(String token) {
        return true;
    }

}
