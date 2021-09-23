package com.laurentcusimano.s2;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Task {
    private String lib;
    private int priority;
    private Date start;
    private boolean done;

    public Task(String lib) {
        setLib(lib);
        setPriority(ThreadLocalRandom.current().nextInt(1, 6));
        setStart(new Date(System.currentTimeMillis()));
        setDone(false);
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Task : " + lib +
                ", priority=" + priority +
                ", start=" + start +
                ", done=" + done ;
    }
}
