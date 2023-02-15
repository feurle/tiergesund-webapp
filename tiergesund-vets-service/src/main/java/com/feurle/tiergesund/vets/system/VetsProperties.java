package com.feurle.tiergesund.vets.system;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Typesafe custom configuration.
 *
 */
@Data
@ConfigurationProperties(prefix = "vets")
public class VetsProperties {

    private Cache cache;

    @Data
    public static class Cache {

        private int ttl;

        private int heapSize;
    }
}
