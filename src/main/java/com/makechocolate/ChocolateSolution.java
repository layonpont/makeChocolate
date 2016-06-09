package com.makechocolate;

/**
 * Created by Sulton on 6/3/2016.
 */
public class ChocolateSolution {
        public int smalls;
        public int bigs;
        public boolean hasSolution = false;

    public void setNoSolution() {
                smalls = -1;
                bigs = -1;
                hasSolution = false;
            }

    public int getSmalls() {
        return smalls;
    }

    public void setSmalls(int smalls) {
        this.smalls = smalls;
    }

    public int getBigs() {
        return bigs;
    }

    public void setBigs(int bigs) {
        this.bigs = bigs;
    }

    public boolean isHasSolution() {
        return hasSolution;
    }

    public void setHasSolution(boolean hasSolution) {
        this.hasSolution = hasSolution;
    }

    public void setSolution(int smalls, int bigs) {
        hasSolution = true;

        this.smalls = smalls;
        this.bigs = bigs;
    }
}