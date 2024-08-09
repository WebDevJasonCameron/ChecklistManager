package sandbox.triggers;

public class LocationTrigger {
    private String location;
    private long radius;
    private boolean triggered;
    private boolean completed;

    // CON

    // GETs & SETS

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public long getRadius() {
        return radius;
    }
    public void setRadius(long radius) {
        this.radius = radius;
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
        return "LocationTrigger{" +
                "location='" + location + '\'' +
                ", radius=" + radius +
                ", triggered=" + triggered +
                ", completed=" + completed +
                '}';
    }
}
