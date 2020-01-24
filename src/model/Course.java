package model;

public class Course {

    int id;
    int code;
    String name;
    String description;
    int credit;

    public Course(int anId, int aCode, String aName, String aDescription, int credit){
        id = anId;
        code = aCode;
        name = aName;
        description = aDescription;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }
}
