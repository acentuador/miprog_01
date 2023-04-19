package model;

import java.util.ArrayList;
import java.util.Date;

public class OS {

    private String id;
    private String description;
    private Date startTime;
    private Date endTime;
    private Double totalValue;
    private String duration;
    private Status status;
    private Payments typePay;
    private int installments;
    private String attendantID;
    private String technician;
    private String clientID;
    private ArrayList<Product> usedParts;

    public OS(String id, String description, Date startTime,  String attendantID,  String clientID) {
        this.id = id;
        this.description = description;
        this.startTime = startTime;
        this.endTime = null;
        this.totalValue = 0.0;
        this.duration = null;
        this.status = Status.WAITING;
        this.typePay = null;
        this.installments = 0;
        this.attendantID = attendantID;
        this.technician = null;
        this.clientID = clientID;
        this.usedParts = new ArrayList<Product>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Payments getTypePay() {
        return typePay;
    }

    public void setTypePay(Payments typePay) {
        this.typePay = typePay;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

    public String getAttendantID() {
        return attendantID;
    }

    public void setAttendantID(String attendantID) {
        this.attendantID = attendantID;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public ArrayList<Product> getUsedParts() {
        return usedParts;
    }

    public void setUsedParts(ArrayList<Product> usedParts) {
        this.usedParts = usedParts;
    }
}
