/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harry
 */
public class Timer {

    private int seconds = 0;
    private int hundrethsOfSeconds = 0;
    
    public Timer() {}
    
    public String toString() {
        String secondsString = String.valueOf(seconds);
        String hundrethsString = String.valueOf(hundrethsOfSeconds);
        
        if (seconds < 10) {
            secondsString = "0" + seconds;
        }
        if (hundrethsOfSeconds < 10) {
            hundrethsString = "0" + hundrethsOfSeconds;
        }
        
        return secondsString + ":" + hundrethsString;
    }
    
    public void advance() {
        if (hundrethsOfSeconds == 99) {
            hundrethsOfSeconds = 0;
            seconds += 1;
        } else {
            hundrethsOfSeconds += 1;
        }
        if (seconds == 60) {
            seconds = 0;
        }
    }
}
