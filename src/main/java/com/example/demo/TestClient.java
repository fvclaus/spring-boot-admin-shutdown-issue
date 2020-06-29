package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("test")
public interface TestClient {
}
