package com.example.apidog.entitys;

public class Messages {
    private  int id;
    private String first_name;
    private int height_feet;
    private int height_inches;
    private  String last_name;
    private String position;
    private int weight_pounds;


    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public int getHeight_feet() {
        return height_feet;
    }

    public int getHeight_inches() {
        return height_inches;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPosition() {
        return position;
    }

    public int getWeight_pounds() {
        return weight_pounds;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", height_feet=" + height_feet +
                ", height_inches=" + height_inches +
                ", last_name='" + last_name + '\'' +
                ", position='" + position + '\'' +
                ", weight_pounds=" + weight_pounds +
                '}';
    }
}
