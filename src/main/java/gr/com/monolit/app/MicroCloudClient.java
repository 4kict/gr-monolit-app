package gr.com.monolit.app;


import gr.com.monolit.app.feignClients.GreetingCloud;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "gr-micro-service", fallback = MicroCloudClient.Fallback.class)
interface MicroCloudClient extends GreetingCloud {
    @Component
    class Fallback implements MicroCloudClient {
        @Override
        public String greeting() {
            return "Sorry, MicroCloudClient.Fallback..";
        }

        @Override
        public String fake() {
            return "Fake!!!";
        }
    }
}





