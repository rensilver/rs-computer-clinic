package com.rensilver.rscomputerclinic.model;

import java.util.Date;

public class OrderTicket {

    private Integer number;
    private Date entryDate;
    private ComputerType computerType;
    private Owner owner;
    private String problemDescription;

    public OrderTicket() {
    }

    public OrderTicket(Integer number, Date entryDate, ComputerType computerType, Owner owner, String problemDescription) {
        this.number = number;
        this.entryDate = entryDate;
        this.computerType = computerType;
        this.owner = owner;
        this.problemDescription = problemDescription;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }
}
