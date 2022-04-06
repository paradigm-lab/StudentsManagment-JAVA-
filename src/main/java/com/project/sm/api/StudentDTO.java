package com.project.sm.api;


public class StudentDTO {
    private String name;
    private Long mobile;
    private String Country;


    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", Country='" + Country + '\'' +
                '}';
    }
}
