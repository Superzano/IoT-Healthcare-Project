package it.unimore.iot.health.api.datamanager.utils;

import java.util.ArrayList;

/**
 * {@code SenMLPack} class represents a SenMLRecord ArrayList used for receiving telemetry data within
 * {@code MqttHandler} and {@code HealthCheckResource} classes, and to emulate telemetry data within
 * {@code DummyDataGenerator}
 * @author Christopher Zanoli, Undergraduate student - 270765@studenti.unimore.it
 */
public class SenMLPack extends ArrayList<SenMLRecord> {
}
