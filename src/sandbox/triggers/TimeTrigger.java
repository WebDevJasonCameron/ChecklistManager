package sandbox.triggers;

public class TimeTrigger {
    private long time;
    private long interval;
    private boolean triggered;
    private boolean completed;

    // CON

    // GETs & SETs
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }

    public long getInterval() {
        return interval;
    }
    public void setInterval(long interval) {
        this.interval = interval;
    }

    public boolean isTriggered() {
        return triggered;
    }
    public void setTriggered(boolean triggered) {
        this.triggered = triggered;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

// METHs


    // OVRs
    @Override
    public String toString() {
        return "TimeTrigger{" +
                "time=" + time +
                ", interval=" + interval +
                ", triggered=" + triggered +
                '}';
    }
}
