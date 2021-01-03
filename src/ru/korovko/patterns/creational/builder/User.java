package ru.korovko.patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {

    private final String name;
    private final int age;
    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static User.Builder builder() {
        return new User.Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder() {}

        public User build() {
            return new User(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
    }
}
