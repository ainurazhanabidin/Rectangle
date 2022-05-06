package com.company;

import java.security.PrivateKey;

public class Rectangle1 {
    private String name;
    private int uzunu;
    private int tuurasy;

    void setName(String a){
        name=a;
    }
    String getName(){
        return name;
    }
    void setUzunu( int b){
        uzunu=b;
    }
     int getUzunu(){
        return uzunu;
    }
    void setTuurasy(int d){
        tuurasy=d;
    }
    int getTuurasy(){
        return tuurasy;
    }
    int tikburchtuktunAyanty(){
        return uzunu*tuurasy;
    }


}
