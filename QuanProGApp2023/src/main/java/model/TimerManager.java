/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HOME
 */
public class TimerManager {
    private int initTimeInMinute;
    private int remainingTimeInSecond;

    public int getInitTimeInMinute() {
        return initTimeInMinute;
    }

    public void setInitTimeInMinute(int initTimeInMinute) {
        this.initTimeInMinute = initTimeInMinute;
    }

    public int getRemainingTimeInSecond() {
        return remainingTimeInSecond;
    }

    public void setRemainingTimeInSecond(int remainingTimeInSecond) {
        this.remainingTimeInSecond = remainingTimeInSecond;
    }
    
    public enum TimerState {
        RUNNING, PAUSED, STOPPED;
    }

    public TimerState state;
    public TimerManager(int initTimeInMinute, int remainingTimeInSecond) {
        this.initTimeInMinute = initTimeInMinute;
        this.remainingTimeInSecond = remainingTimeInSecond;
        this.state = TimerState.STOPPED;
    }
    
    public void timerUpdate(){
        while (this.remainingTimeInSecond > 0){
            
        }
    }
}
