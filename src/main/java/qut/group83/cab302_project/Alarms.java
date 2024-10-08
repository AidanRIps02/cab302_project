package qut.group83.cab302_project;

public class Alarms extends User {
    private int alarmId;
    private String eventType;  // Weather event type (e.g., Hurricane, Tornado)
    private String location;   // Location of the weather event
    private String severity;   // Severity of the event (e.g., Moderate, Severe)
    private String message;    // Message to be displayed
    private boolean isActive;

    // Constructor
    public Alarms(String userId, int alarmId, String eventType, String location, String severity, String message, boolean isActive) {
        super("", ""); // Call the parent (User) constructor.
        setUserId(userId);  // Set the existing userId
        this.alarmId = alarmId;
        this.eventType = eventType;
        this.location = location;
        this.severity = severity;
        this.message = message;
        this.isActive = isActive;
    }

    // Getters and Setters
    public int getAlarmId() { return alarmId; }
    public void setAlarmId(int alarmId) { this.alarmId = alarmId; }

    public String getEventType() { return eventType; }
    public void setEventType(String eventType) { this.eventType = eventType; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    @Override
    public String toString() {
        return "Alarm [alarmId=" + alarmId + ", eventType=" + eventType + ", location=" + location +
                 ", severity=" + severity + ", message=" + message +
                ", isActive=" + isActive + ", User=" + super.toString() + "]";
    }
}
