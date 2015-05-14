package com.bchollywood.wordcountchainer;

import java.util.Date;

/**
 * Created by Barry on 13/05/2015.
 */
public class WordCountEntry {
    private int wordCount;
    private Date todaysDate;

    public WordCountEntry(int wordCount, Date todaysDate) {
        this.wordCount = wordCount;
        this.todaysDate = todaysDate;
    }

    public WordCountEntry(int wordCount) {
        this.todaysDate = new Date();
    }

    public WordCountEntry() {

    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public Date getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(Date todaysDate) {
        this.todaysDate = todaysDate;
    }
}
