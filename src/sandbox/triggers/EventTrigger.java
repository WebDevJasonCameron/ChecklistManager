package sandbox.triggers;

public class EventTrigger {
    private String event;
    private boolean triggered;
    private boolean completed;

    // CON

    // GETs & SETs
    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
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
        return "EventTrigger{" +
                "event='" + event + '\'' +
                ", triggered=" + triggered +
                ", completed=" + completed +
                '}';
    }
}
