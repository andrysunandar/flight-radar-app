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
package com.bl.rekweb.demo.flight.producer;

import com.bl.rekweb.demo.flight.model.FlightDataObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Author andry on 31/05/16.
 */
@Service
public class JmsProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    private static final Logger logger = Logger.getLogger(JmsProducer.class);


    public void sendData(String data) throws JsonProcessingException {

        logger.info("<<<<<<<<<<<<<<  SEND JSON DATA TO FLIGHT TOPIC  >>>>>>>>>>>>>>>");
        logger.info(data);

        // convert MarineOrder to gantt_data tasks
        //String tasks = convertMarineOrderToGanttData(mo);

        //logger.info("GANTT DATA => "+strData);

        jmsTemplate.send(
                (session) ->{
                    Message message = null;

                    message = session.createTextMessage(data);

                    return message;
                }
        );

        System.out.println();
    }
}
