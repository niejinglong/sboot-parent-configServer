package app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientConfigController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/getpf")
    public String getProfile(){
        return profile;
    }
}
