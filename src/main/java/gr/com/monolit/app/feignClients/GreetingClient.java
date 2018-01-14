package gr.com.monolit.app.feignClients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("GR-MICRO-SERVICE")
public interface GreetingClient {
    @RequestMapping("/getGr")
    String greeting();
}