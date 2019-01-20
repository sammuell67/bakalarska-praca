
package models;

public class Class {
    private String groupName;
    private String place;

    public Class(String groupName, String place) {
        this.groupName = groupName;
        this.place = place;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
