package com.baeldung.um.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication // makes this a Spring Boot application
@Import({ // @formatter:off
        UmContextConfig.class,
        UmPersistenceJpaConfig.class,
        UmServiceConfig.class,
        UmWebConfig.class
}) // @formatter:on

public class UmApp extends SpringBootServletInitializer {
}
