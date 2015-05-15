package com.bchollywood.wordcountchainer;

/**
 * Created by Barry on 15/05/2015.
 * Represents the current user.
 */
public class WordSlinger {
    private String userName;
    private int currentChain;
    private int bestChain;
    private int currentWordCount;
    private int totalWordCount;

    public WordSlinger() {}

    public WordSlinger(String userName, int currentChain, int bestChain, int currentWordCount, int totalWordCount) {
        this.userName = userName;
        this.currentChain = currentChain;
        this.bestChain = bestChain;
        this.currentWordCount = currentWordCount;
        this.totalWordCount = totalWordCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCurrentChain() {
        return currentChain;
    }

    public void setCurrentChain(int currentChain) {
        this.currentChain = currentChain;
    }

    public int getBestChain() {
        return bestChain;
    }

    public void setBestChain(int bestChain) {
        this.bestChain = bestChain;
    }

    public int getCurrentWordCount() {
        return currentWordCount;
    }

    public void setCurrentWordCount(int currentWordCount) {
        this.currentWordCount = currentWordCount;
    }

    public int getTotalWordCount() {
        return totalWordCount;
    }

    public void setTotalWordCount(int totalWordCount) {
        this.totalWordCount = totalWordCount;
    }
}
