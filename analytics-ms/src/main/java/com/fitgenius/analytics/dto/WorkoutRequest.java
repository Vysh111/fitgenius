package com.fitgenius.analytics.dto;

import com.fitgenius.analytics.domain.ExperienceLevel;
import com.fitgenius.analytics.domain.Goal;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class WorkoutRequest {

    @Min(value = 1, message = "Age must be greater than 0")
    private int age;

    @NotNull(message = "Goal is required")
    private Goal goal;

    @NotNull(message = "Experience is required")
    private ExperienceLevel experience;

    public WorkoutRequest() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public ExperienceLevel getExperience() {
        return experience;
    }

    public void setExperience(ExperienceLevel experience) {
        this.experience = experience;
    }
}
