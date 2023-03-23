package model;

import java.util.ArrayList;
import java.util.List;

public class TimerModel {
    
    
    private List<Pomodoro> pomodoros;
    private Pomodoro currentPomodoro;
    private Pomodoro defaultPomodoro;
    private int currentIndex;
    private boolean isRunning;

    public TimerModel() {
        this.pomodoros = new ArrayList<>();
        this.currentIndex = 0;
        this.isRunning = false;
        this.defaultPomodoro = new Pomodoro(25, 0);
    }

    public void addPomodoro(Pomodoro pomodoro) {
        pomodoros.add(pomodoro);
    }

    public Pomodoro getCurrentPomodoro() {
        return currentPomodoro;
    }

    public void switchPomodoro() {
        currentIndex = (currentIndex + 1) % pomodoros.size();
        currentPomodoro = pomodoros.get(currentIndex);
        currentPomodoro.reset(defaultPomodoro);
    }
    
    public void starting() {
        
    }

    // other methods for starting, stopping, and resetting the timer
}
