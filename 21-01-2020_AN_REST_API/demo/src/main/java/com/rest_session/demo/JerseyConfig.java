package com.rest_session.demo;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
          public JerseyConfig(){
              register(Employe.class);
          }
}
