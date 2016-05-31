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

import java.util.List;

/**
 * Author andry on 31/05/16.
 */
public class FlightDataObject {
    
    int time;
    List<Item> itemList;
        
    public FlightDataObject() {
    }

    public FlightDataObject(int time, List<Item> itemList) {
        this.time = time;
        this.itemList = itemList;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "FlightDataObject{" +
                "time=" + time +
                ", itemList=" + itemList +
                '}';
    }
}
