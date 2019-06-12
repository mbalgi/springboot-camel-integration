package com.example.springcamelintegration.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFileRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/Users/manoj.balgi/work/learning/code/spring-camel-integration/input").to("file:/Users/manoj.balgi/work/learning/code/spring-camel-integration/output");
    }
}
