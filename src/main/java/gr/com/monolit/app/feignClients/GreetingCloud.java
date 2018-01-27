package gr.com.monolit.app.feignClients;

import org.springframework.web.bind.annotation.RequestMapping;


public interface GreetingCloud {
    @RequestMapping("/getGr")
    String greeting();

    @RequestMapping("/fake")
    String fake();
}
