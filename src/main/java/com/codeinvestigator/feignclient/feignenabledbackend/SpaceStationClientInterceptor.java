package com.codeinvestigator.feignclient.feignenabledbackend;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class SpaceStationClientInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("myheaderkey", "myvar1");
        log.warn("### WE ARE USING A CUSTOM INTERCEPTOR");
    }
}
