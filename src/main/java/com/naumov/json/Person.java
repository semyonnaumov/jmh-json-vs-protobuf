package com.naumov.json;

import java.util.List;

public class Person {
    private String name;
    private Integer id;
    private String email;
    private List<PhoneNumber> phones;

    public static class PhoneNumber {
        private String number;
        private PhoneType type;

        public PhoneNumber() {
        }

        public PhoneNumber(String number, PhoneType type) {
            this.number = number;
            this.type = type;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public PhoneType getType() {
            return type;
        }

        public void setType(PhoneType type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "number='" + number + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    public enum PhoneType {
        MOBILE,
        HOME,
        WORK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PhoneNumber> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneNumber> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", phones=" + phones +
                '}';
    }
}
