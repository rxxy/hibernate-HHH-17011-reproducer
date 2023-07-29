package org.hibernate.bugs.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "`user`")
public class User {
    @Id
    private Long id;

    private String name;

    private LocalDateTime birthday;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    public enum Gender {
        Male,
        Female
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
