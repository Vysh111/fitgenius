package com.fitgenius.analytics.controller;

import com.fitgenius.analytics.dto.WorkoutRequest;
import com.fitgenius.analytics.dto.WorkoutResponse;
import com.fitgenius.analytics.service.WorkoutService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/workouts")

public class WorkoutController {
    private final WorkoutService workoutService;

    // 🔑 Constructor Injection
    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @PostMapping
    public WorkoutResponse createWorkout(
            @Valid @RequestBody WorkoutRequest request) {

        return workoutService.generateWorkoutPlan(request);
    }

}


