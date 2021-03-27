package ab.techstack.spring.cloudgateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    Logger logger =  LoggerFactory.getLogger(FallbackController.class);
    @RequestMapping("/orderFallback")
    public Mono<String> orderServiceFallback(){
        logger.info("orderFallback getting called.....");
        return Mono.just("Order service is taking to long to respond or is down. Please try again.");
    }
    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallback(){
        logger.info("paymentFallback getting called.....");
        return Mono.just("Payment service is taking to long to respond or is down. Please try again.");
    }
}
