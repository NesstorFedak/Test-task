package zadanie3.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zadanie3.servicee.HttpClientService;

@RestController
@RequestMapping("/get-all")
public class MyController {
    private final HttpClientService httpClientService;

    public MyController(HttpClientService httpClientService) {
        this.httpClientService = httpClientService;
    }

    public String run(@RequestBody String url) {
        return httpClientService.get(url, String.class);
    }
}
