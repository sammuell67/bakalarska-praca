package models;

public class Teacher {

    private String groupName;

    private String name;

    public Teacher(String groupName, String name, String surName) {
        this.groupName = groupName;
        this.name = name;
        this.surName = surName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    private String surName;


}
