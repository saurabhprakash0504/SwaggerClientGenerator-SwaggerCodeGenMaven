package com.example.swagger;

import com.swagger.client.codegen.rest.api.PetApi;
import com.swagger.client.codegen.rest.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {

    @Value("${endpoint.host.url}")
    private String hostInfoBasePath;

    @Bean
    public ApiClient apiClient(){
        return new ApiClient().setBasePath(hostInfoBasePath);
    }

    @Bean
    public PetApi petApi(){
        return new PetApi(apiClient());
    }
}
