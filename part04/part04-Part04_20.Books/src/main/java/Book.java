/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harry
 */
public class Book {
    
    private String name;
    private int pages;
    private int year;
    
    public Book (String initName, int initPages, int initYear) {
        name = initName;
        pages = initPages;
        year = initYear;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getYear() {
        return year;
    }
    
    public String toString() {
        return (name + ", " + pages + " pages, " + year);
    }
    
}
