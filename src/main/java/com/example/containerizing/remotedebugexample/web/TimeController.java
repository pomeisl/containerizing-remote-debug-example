package com.example.containerizing.remotedebugexample.web;

import static java.lang.System.currentTimeMillis;
import static org.springframework.http.ResponseEntity.ok;

import com.example.containerizing.remotedebugexample.web.dto.TimeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {

  @GetMapping
  public ResponseEntity<TimeResponse> getTime() {
    return ok(TimeResponse.builder().time(currentTimeMillis()).build());
  }

}
