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
package com.bl.rekweb.demo.flight.service;

import com.bl.rekweb.demo.flight.model.FlightData;
import com.bl.rekweb.demo.flight.model.FlightDataObject;
import com.bl.rekweb.demo.flight.model.Item;
import com.bl.rekweb.demo.flight.producer.JmsProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author andry on 31/05/16.
 */
@Service
public class ReceiveFlightMsgObject {
    private static final Logger logger = Logger.getLogger(ReceiveFlightMsgObject.class);

    @Autowired
    private JmsProducer jmsProducer;

    public void printData(FlightData msg) throws JsonProcessingException {
        logger.info("<<<<<<<<<<<<<<< CONVERT JSON TO OBJECT >>>>>>>>>>>>>>>>>>>>");
        //logger.info("object msg => "+msg.toString());
        print5Data(msg);
    }
    
    private void print5Data(FlightData msg) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        //logger.info("convert to json => "+mapper.writeValueAsString(data));

        /*
        logger.info("time : "+msg.getTime());
        for(int i=0;i < 5 ;i++){
            logger.info("states["+i+"] : "+msg.getStates().get(i).toString());
        }
        */
        //logger.info("object msg => "+msg.getStates().get(0).toString());
        List<Item> itemList = new ArrayList<Item>();

        for(int i=0;i < 10;i++){
            logger.info("object msg => "+msg.getStates().get(i).toString());
            List<Object> objectList = msg.getStates().get(i);
            Item item = new Item();
            if(objectList.get(0)!=null)
                item.setId((String)objectList.get(0));
            if(objectList.get(2)!=null)
                item.setCountry((String)objectList.get(2));
            if(objectList.get(3)!=null)
                item.setTime((Integer)objectList.get(3));

            if(objectList.get(6)!=null){
                if(objectList.get(6) instanceof Integer)
                    item.setLatitude((Integer)objectList.get(6));
                else if(objectList.get(6) instanceof Double)
                    item.setLatitude((Double)objectList.get(6));
            }

            if(objectList.get(5)!=null){
                if(objectList.get(5) instanceof Integer)
                    item.setLongitude((Integer)objectList.get(5));
                else if(objectList.get(5) instanceof Double)
                    item.setLongitude((Double)objectList.get(5));
            }

            if(objectList.get(7)!=null){
                if(objectList.get(7) instanceof Integer)
                    item.setAltitude((Integer)objectList.get(7));
                else if(objectList.get(7) instanceof Double)
                    item.setAltitude((Double)objectList.get(7));
            }

            //item.setAltitude((Double)objectList.get(7));
            //Item item = new Item((String)objectList.get(0),(String)objectList.get(2),(Integer)objectList.get(3),(Integer)objectList.get(5),(Integer)objectList.get(6),
            //        (Integer)objectList.get(7));
            logger.info("items : "+item);
            itemList.add(item);
        }
        FlightDataObject flightDataObject = new FlightDataObject();
        flightDataObject.setTime(msg.getTime());
        flightDataObject.setItemList(itemList);
        //logger.info("flight data object limit 5 : "+flightDataObject.toString() );
        jmsProducer.sendData(mapper.writeValueAsString(flightDataObject));
        
    }
}
