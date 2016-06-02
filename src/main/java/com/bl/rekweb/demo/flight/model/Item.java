/**
 * Innovez-One, Proprietary Software Cloud Communications
 *  Copyright (c) 2015, Innovez-One and individual contributors
 *  by the @authors tag.
 *
 *  This program is Proprietary Software: you can not redistribute it and/or modify
 *  without license from Innovez-One.
 *
 *  Website : http://www.innovez-one.com/
 *  Report bugs to <techsupport@innovez-one.com>.
 *  Copyright (C) 2015 PT. Innovez-One. All rights reserved.
 */
package com.bl.rekweb.demo.flight.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Author andry on 31/05/16.
 */
public class Item {
    
    String id;
    String country;
    int time;
    double latitude;
    double longitude;
    double altitude;
    @JsonProperty("on_ground")
    boolean onGround;
    double velocity;
    double heading;
    

    public Item() {
    }

    public Item(String id, String country, int time, double latitude, double longitude, double altitude) {
        this.id = id;
        this.country = country;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public Item(String id, String country, int time, double latitude, double longitude, double altitude, boolean onGround, double velocity, double heading) {
        this.id = id;
        this.country = country;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.onGround = onGround;
        this.velocity = velocity;
        this.heading = heading;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getHeading() {
        return heading;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", time=" + time +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                ", onGround=" + onGround +
                ", velocity=" + velocity +
                ", heading=" + heading +
                '}';
    }
}
