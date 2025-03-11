package com.cw.ChallengeApplication;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Challenge{
    @Id
    private long id ;

    @Column(name = "challengeMonth")
    private String Month;
    private String Discription;

    public Challenge(){

    }

    public Challenge(long id,String Month,String Discription) {
        this.id = id;
        this.Month = Month;
        this.Discription = Discription;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }
}
























