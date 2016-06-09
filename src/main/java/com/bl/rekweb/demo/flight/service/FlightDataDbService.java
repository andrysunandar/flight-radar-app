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
import org.springframework.stereotype.Service;

/**
 * Author andry on 07/06/16.
 */
@Service
public interface FlightDataDbService {
    
    public void save(FlightDataObject data);
}
