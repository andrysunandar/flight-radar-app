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

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Author andry on 31/05/16.
 */
@Service
public class ReceiveFlightMsg {

    private static final Logger logger = Logger.getLogger(ReceiveFlightMsg.class);
    
    public void printData(String msg){
        //logger.info("messages => "+msg);
    }

}
