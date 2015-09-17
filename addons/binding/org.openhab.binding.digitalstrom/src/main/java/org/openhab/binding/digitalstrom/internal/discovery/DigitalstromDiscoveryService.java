/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.digitalstrom.internal.discovery;

import org.eclipse.smarthome.config.discovery.AbstractDiscoveryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Discover Digitalstrom things.
 *
 * @author Christoph Bohl - Initial contribution
 */
public class DigitalstromDiscoveryService extends AbstractDiscoveryService {

    private final Logger logger = LoggerFactory.getLogger(DigitalstromDiscoveryService.class);

    private final static int SEARCH_TIME = 60;

    public DigitalstromDiscoveryService() {
        super(SEARCH_TIME);
    }

    @Override
    protected void startScan() {
        // TODO Auto-generated method stub

    }

    // public void activate() {
    // hueBridgeHandler.registerLightStatusListener(this);
    // }
    //
    // @Override
    // public void deactivate() {
    // removeOlderResults(new Date().getTime());
    // hueBridgeHandler.unregisterLightStatusListener(this);
    // }
    //
    // @Override
    // public Set<ThingTypeUID> getSupportedThingTypes() {
    // return HueLightHandler.SUPPORTED_THING_TYPES;
    // }
    //
    // @Override
    // public void startScan() {
    // List<FullLight> lights = hueBridgeHandler.getFullLights();
    // if (lights != null) {
    // for (FullLight l : lights) {
    // onLightAddedInternal(l);
    // }
    // }
    // // search for unpaired lights
    // hueBridgeHandler.startSearch();
    // }
    //
    // @Override
    // protected synchronized void stopScan() {
    // super.stopScan();
    // removeOlderResults(getTimestampOfLastScan());
    // }
    //
    // @Override
    // public void onLightAdded(HueBridge bridge, FullLight light) {
    // onLightAddedInternal(light);
    // }
    //
    // private void onLightAddedInternal(FullLight light) {
    // ThingUID thingUID = getThingUID(light);
    // if (thingUID != null) {
    // ThingUID bridgeUID = hueBridgeHandler.getThing().getUID();
    // Map<String, Object> properties = new HashMap<>(1);
    // properties.put(LIGHT_ID, light.getId());
    //
    // /*
    // * TODO retrieve the light´s unique id (available since Hue bridge versions > 1.3) and set the mac address
    // * as discovery result representationÏ. For this purpose the jue library has to be modified.
    // */
    //
    // DiscoveryResult discoveryResult = DiscoveryResultBuilder.create(thingUID).withProperties(properties)
    // .withBridge(bridgeUID).withLabel(light.getName()).build();
    //
    // thingDiscovered(discoveryResult);
    // } else {
    // logger.debug("discovered unsupported light of type '{}' with id {}", light.getModelID(), light.getId());
    // }
    // }
    //
    // @Override
    // public void onLightRemoved(HueBridge bridge, FullLight light) {
    // ThingUID thingUID = getThingUID(light);
    //
    // if (thingUID != null) {
    // thingRemoved(thingUID);
    // }
    // }
    //
    // @Override
    // public void onLightStateChanged(HueBridge bridge, FullLight light) {
    // // nothing to do
    // }
    //
    // private ThingUID getThingUID(FullLight light) {
    // ThingUID bridgeUID = hueBridgeHandler.getThing().getUID();
    // ThingTypeUID thingTypeUID = new ThingTypeUID(BINDING_ID, light.getModelID().replaceAll("[^a-zA-Z0-9_]", "_"));
    //
    // if (getSupportedThingTypes().contains(thingTypeUID)) {
    // String thingLightId = light.getId();
    // ThingUID thingUID = new ThingUID(thingTypeUID, bridgeUID, thingLightId);
    // return thingUID;
    // } else {
    // return null;
    // }
    // }
}
