package com.sonpham.it.ats.pojos;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "asset")
public class Asset implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "stamp")
    private int stamp;
    @Column(name = "identifier")
    private String identifier;
    @Column(name = "serial_no")
    private String serialNo;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "status")
    private String status;
    @Column(name = "battery_level")
    private String batteryLevel;
    @Column(name = "product")
    private String product;
    @Column(name = "description")
    private String description;
    @Column(name = "last_position")
    private long lastPosition;
    @Column(name = "fleet")
    private long fleet;
    public Asset() {

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getStamp() {
        return stamp;
    }
    public void setStamp(int stamp) {
        this.stamp = stamp;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBatteryLevel() {
        return batteryLevel;
    }
    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public long getLastPosition() {
        return lastPosition;
    }
    public void setLastPosition(long lastPosition) {
        this.lastPosition = lastPosition;
    }
    public long getFleet() {
        return fleet;
    }
    public void setFleet(long fleet) {
        this.fleet = fleet;
    }
}
