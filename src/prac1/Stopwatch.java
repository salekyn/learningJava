package prac1;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    Stopwatch(){
        this.startTime = System.currentTimeMillis();    
    }
    
    public void start() {
        this.startTime=System.currentTimeMillis();

    }

    public void stop() {
        this.endTime=System.currentTimeMillis();

    }

    public long getElapsedTime() {
        return (this.endTime-this.startTime);
    }
    
}


