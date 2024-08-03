package sandbox.triggers;

public class TimeTrigger {
    private long time;
    private long interval;
    private boolean triggered;

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
