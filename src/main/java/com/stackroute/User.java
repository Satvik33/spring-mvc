package com.stackroute;

public class User {
    private String name;
    private String id;
    private String age;

    public User(String name, String id, String age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

   /* @Override
    public String toString() {
        return("Name : "+name+ "/n" + "ID : " +id+ "Age : "+age);
    }*/
}
