package it.unimore.iot.health.api.telemetry.conf;

public class MqttConfigurationParameters {
    public static String BROKER_ADDRESS = "127.0.0.1"; // local host
    public static int BROKER_PORT = 1883; // default mqtt port
    public static final String MQTT_USERNAME = "demouser"; // demonstration username
    public static final String MQTT_BASIC_TOPIC = String.format ("/iot/user/%s", MQTT_USERNAME);
    public static final String SMARTWATCH_TOPIC = "smartwatch";
    public static final String SMARTWATCH_TELEMETRY_TOPIC = "telemetry";
    public static final String SMARTWATCH_INFO_TOPIC = "info";
    public static final String SMARTWATCH_CONTROL_TOPIC = "control1";
}