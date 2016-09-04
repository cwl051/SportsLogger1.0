/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author CWL
 */
@Entity
@Table (name="SPORTER_TABLE")
public class Executor {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name="SPORTER_ID")
    private long executerId;
    @Column (name="FIRST_NAME")
    private String firstName;
    @Column (name="LAST_NAME")
    private String lastName;
    @Column (name="DATE_OF_BIRTH")
    private LocalDate dob;
    

    private Gender sex;

    public Executor() {
    }

    public Executor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Executor(String firstName, String lastName, LocalDate dob, Gender sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        //this.sex = sex;
    }

    
    
    public long getExecuterId() {
        return executerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Executor{" + "executerId=" + executerId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", sex=" + sex + '}';
    }
    
    
    
}
