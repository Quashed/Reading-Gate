package com.readinggate.reading_gate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/reading-gate")
public class ReadingGateController {

    @PostMapping("/start")
    public Map<String, Object> startReading() {
        return Map.of(
                "status", "STARTED",
                "message", "Reading session started"
        );
    }

    @PostMapping("/stop")
    public Map<String, Object> stopReading() {
        return Map.of(
                "status", "STOPPED",
                "message", "Reading session stopped"
        );
    }

    @GetMapping("/status")
    public Map<String, Object> getStatus() {
        return Map.of(
                "gateStatus", "LOCKED",
                "requiredMinutes", 180,
                "completedMinutes", 0,
                "remainingMinutes", 180
        );
    }
}
