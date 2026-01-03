/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emery
 */
public class Song {
    
    private String name;
    private int length;
    
    public Song(String songName, int songLength) {
        name = songName;
        length = songLength;
        
    }
    
    public String name() {
        return name;
    }
    
    public int length() {
        return length;
    }
}
