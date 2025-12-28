package com.fitgenius.analytics.service;

import com.fitgenius.analytics.domain.ExperienceLevel;
import com.fitgenius.analytics.domain.Goal;
import com.fitgenius.analytics.dto.WorkoutRequest;
import com.fitgenius.analytics.dto.WorkoutResponse;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

    public WorkoutResponse generateWorkoutPlan(WorkoutRequest request) {

        Goal goal = request.getGoal();
        ExperienceLevel experience = request.getExperience();

        if (goal == Goal.FAT_LOSS) {
            return new WorkoutResponse(
                    "Fat Loss",
                    experience == ExperienceLevel.BEGINNER ? "Low-Medium" : "Medium-High",
                    45
            );
        }

        if (goal == Goal.MUSCLE_GAIN) {
            return new WorkoutResponse(
                    "Muscle Gain",
                    experience == ExperienceLevel.BEGINNER ? "Medium" : "High",
                    60
            );
        }

        return new WorkoutResponse(
                "General Fitness",
                "Low",
                30
        );
    }
}
