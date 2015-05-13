package com.bchollywood.wordcountchainer;

/**
 * Created by Barry on 13/05/2015.
 */
public class WordCountEntry {
    private int wordCount;
    private String datePlaceHolder;
    private String timePlaceHolder;

    public WordCountEntry(int wordCount, String datePlaceHolder, String timePlaceHolder) {
        this.wordCount = wordCount;
        this.datePlaceHolder = datePlaceHolder;
        this.timePlaceHolder = timePlaceHolder;
    }

}
