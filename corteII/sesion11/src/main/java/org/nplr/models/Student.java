package org.nplr.models;

import java.util.Objects;

public class Student {
    private String cif;
    private String names;
    private String surnames;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(String cif, String names, String surnames, String email, String phone) {
        this.cif = cif;
        this.names = names;
        this.surnames = surnames;
        this.email = email;
        this.phone = phone;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cif='" + cif + '\'' +
                ", names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(cif, student.cif) && Objects.equals(names, student.names) && Objects.equals(surnames, student.surnames) && Objects.equals(email, student.email) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif, names, surnames, email, phone);
    }
}