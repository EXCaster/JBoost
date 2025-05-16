package org.jboost.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: web controller demo
 * Created by EXCaster on 2023/8/7
 */
@RestController
@RequestMapping("/v1/basic")
public class BasicController {
  // New GET endpoint
    @GetMapping("/hello")
    public CommonResult<String> sayHello() {
        return CommonResult.success("Hello from JBoost Basic Service!");
    }
  // New GET endpoint with a path variable
    @GetMapping("/greet/{name}")
    public CommonResult<String> greetByName(@PathVariable String name) {
        return CommonResult.success("Hello, " + name + "!");
    }

    // New POST endpoint accepting a request body
    @PostMapping("/create")
    public CommonResult<Object> createResource(@RequestBody Map<String, Object> payload) {
        // In a real application, you would process the payload and create a resource.
        // For this demo, we'll just return the received payload.
        System.out.println("Received payload: " + payload);
        return CommonResult.success(payload);
    }

}
