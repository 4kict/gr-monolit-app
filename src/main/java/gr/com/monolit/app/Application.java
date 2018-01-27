package gr.com.monolit.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Autowired
    private MicroCloudClient microCloudClient;

    @RequestMapping("/get-greeting")
    public String greeting() {
        return microCloudClient.greeting();
    }

    @RequestMapping("/get-fake")
    public String faking() {
        return microCloudClient.fake();
    }

}

