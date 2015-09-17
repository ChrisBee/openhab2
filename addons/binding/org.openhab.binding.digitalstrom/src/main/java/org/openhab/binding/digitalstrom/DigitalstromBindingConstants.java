/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.digitalstrom;

import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.ImmutableSet;

/**
 * The {@link DigitalstromBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Christoph Bohl - Initial contribution
 */
public class DigitalstromBindingConstants {

    public static final String BINDING_ID = "digitalstrom";

    public static final String BROADCAST_MESSAGE = "@@@@VITOTRONIC@@@@/";
    public static final int BROADCAST_PORT = 8080;

    public static final String APPLICATION_NAME = "openHAB2";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_DSS = new ThingTypeUID(BINDING_ID, "dss");
    public final static ThingTypeUID THING_TYPE_LIGHT_DIMMABLE = new ThingTypeUID(BINDING_ID, "light-dimmable");

    public final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = ImmutableSet.of(THING_TYPE_DSS,
            THING_TYPE_LIGHT_DIMMABLE);

    public final static Set<ThingTypeUID> SUPPORTED_BRIDGE_THING_TYPES_UIDS = ImmutableSet.of(THING_TYPE_DSS);

    // List of all Channel ids
    public final static String CHANNEL_BRIGHTNESS = "brightness";

}
