package Homework_7.model;

import java.time.LocalDateTime;

public class Event {
    
    private String description;
    private LocalDateTime time;

    public Event(String description, LocalDateTime time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}

