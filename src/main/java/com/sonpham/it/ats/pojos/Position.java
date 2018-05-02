package com.sonpham.it.ats.pojos;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="position")
public class Position implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "speed")
    private int speed;
    @Column(name = "received_time")
    private String receivedTime;
    @Column(name = "reported_time")
    private String reportedTime;

    public Position() {

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getReceivedTime() {
        return receivedTime;
    }
    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }
    public String getReportedTime() {
        return reportedTime;
    }
    public void setReportedTime(String reportedTime) {
        this.reportedTime = reportedTime;
    }
}
