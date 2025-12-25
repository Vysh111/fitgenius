package com.fitgenius.analytics.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/workouts")
public class WorkoutController {

    @PostMapping
    public Map<String, Object> createWorkout(@RequestBody Map<String, Object> userInput) {

        return Map.of(
                "receivedInput", userInput,
                "message", "User input received successfully"
        );
    }

}


