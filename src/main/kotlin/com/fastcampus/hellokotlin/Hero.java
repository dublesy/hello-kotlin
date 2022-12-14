package com.fastcampus.hellokotlin;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Hero {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int age;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("아이언맨");
        hero.setAge(55);
        hero.setAddress("용인시");
    }
}

