/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.digitalstrom.internal;

import static org.openhab.binding.digitalstrom.DigitalstromBindingConstants.THING_TYPE_LIGHT_DIMMABLE;

import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;
import org.openhab.binding.digitalstrom.DigitalstromBindingConstants;
import org.openhab.binding.digitalstrom.handler.DigitalstromHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link DigitalstromThingHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Christoph Bohl - Initial contribution
 */
public class DigitalstromThingHandlerFactory extends BaseThingHandlerFactory {

    private Logger logger = LoggerFactory.getLogger(DigitalstromThingHandlerFactory.class);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        logger.trace("Ask Handler for Suported Thing {}",
                DigitalstromBindingConstants.SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID));
        return DigitalstromBindingConstants.SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {

        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(THING_TYPE_LIGHT_DIMMABLE)) {
            return new DigitalstromHandler(thing);
        }

        return null;
    }
}
