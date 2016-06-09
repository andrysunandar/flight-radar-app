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

import com.bl.rekweb.demo.flight.model.FlightDataObject;
import com.bl.rekweb.demo.flight.repository.FlightDataRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author andry on 07/06/16.
 */
@Component
public class FlightDataDbServiceImpl implements FlightDataDbService{

    private static final Logger logger = Logger.getLogger(FlightDataDbServiceImpl.class);
    
    @Autowired
    private FlightDataRepository flightDataRepository;

    @Override
    public void save(FlightDataObject data) {
        logger.info("<<<<<<<<<<< SAVE FLIGHT DATA "+data.getTime()+" >>>>>>>>>>>");
        flightDataRepository.save(data);
    }
}
