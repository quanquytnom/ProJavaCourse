package model;

public class Pomodoro {
    private int minutes;
    private int seconds;
    
    
    public enum PomodoroStatus {
        RUNNING,
        PAUSE,
        STOPPED,
    }
    
    private PomodoroStatus status;

    public Pomodoro() {}
    
    public Pomodoro(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.status = status.STOPPED;
    }
    
    public void reset(Pomodoro pomodoro){
        this.minutes = minutes;
        this.seconds = seconds;
        this.status = status.STOPPED;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public PomodoroStatus getStatus() {
        return status;
    }
    
    public void setStatus(PomodoroStatus status) {
        this.status = status;
    }
}
