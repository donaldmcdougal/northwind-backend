package com.donaldmcdougal.northwind.config;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
@AutoConfigureBefore(value = { DatabaseConfiguration.class })
public class CacheConfiguration {
}
