package org.example;

import java.io.Serializable;

public class Staff implements Serializable {

    private String name = null;

    public Staff(){}

    String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
