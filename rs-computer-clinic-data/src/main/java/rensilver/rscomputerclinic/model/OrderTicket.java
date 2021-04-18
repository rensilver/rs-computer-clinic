package rensilver.rscomputerclinic.model;

import rensilver.rscomputerclinic.enums.OrderStatus;

import java.util.Date;

public class OrderTicket {

    private Integer number;
    private Date entryDate;
    private ComputerType computerType;
    private String computerHardwareDescription;
    private Owner owner;
    private String problemDescription;
    private OrderStatus orderStatus;
    private String solution;

    public OrderTicket() {
    }

    public OrderTicket(Integer number, Date entryDate, ComputerType computerType
            , String computerHardwareDescription, Owner owner, String problemDescription
            , OrderStatus orderStatus, String solution) {
        this.number = number;
        this.entryDate = entryDate;
        this.computerType = computerType;
        this.computerHardwareDescription = computerHardwareDescription;
        this.owner = owner;
        this.problemDescription = problemDescription;
        this.orderStatus = orderStatus;
        this.solution = solution;
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

    public String getComputerHardwareDescription() {
        return computerHardwareDescription;
    }

    public void setComputerHardwareDescription(String computerHardwareDescription) {
        this.computerHardwareDescription = computerHardwareDescription;
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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
