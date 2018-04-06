package org.vaadin.sensors;

import java.util.Objects;

public class GeoLocation {
    private final long timestamp;
    private final double lat;
    private final double lon;
    private final double altitude;
    private final double accuracy;
    private final double altitudeAccuracy;
    private final double heading;
    private final double speed;
    private final int errorCode; // todo constants

    public GeoLocation(long timestamp, double lat, double lon, double altitude,
                       double accuracy, double altitudeAccuracy, double heading,
                       double speed, int errorCode) {
        this.timestamp = timestamp;
        this.lat = lat;
        this.lon = lon;
        this.altitude = altitude;
        this.accuracy = accuracy;
        this.altitudeAccuracy = altitudeAccuracy;
        this.heading = heading;
        this.speed = speed;
        this.errorCode = errorCode;
    }

    /**
     * Timestamp in ms. Mandatory.
     *
     * @return
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Latitude in WGS84 coordinate system. Positive means North Hemisphere.
     * Mandatory.
     *
     * @return degrees [-90...90]
     */
    public double getLat() {
        return lat;
    }

    /**
     * Longitude in WGS84 coordinate system. Positive means East Hemisphere. Mandatory.
     *
     * @return degrees [-180...180]
     */
    public double getLon() {
        return lon;
    }

    /**
     * Altitude if known.
     *
     * @return meters above sea level or {@link Double#NaN} if unknown.
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * Horizontal accuracy. Always positive, mandatory.
     *
     * @return meters
     */
    public double getAccuracy() {
        return accuracy;
    }

    /**
     * Horizontal accuracy. Positive or {@link Double#NaN} if unknown.
     *
     * @return meters
     */
    public double getAltitudeAccuracy() {
        return altitudeAccuracy;
    }

    /**
     * Heading, in range [0..360] or {@link Double#NaN} if unknown.
     *
     * @return degrees
     */
    public double getHeading() {
        return heading;
    }

    /**
     * Speed, positive or {@link Double#NaN} if unknown.
     *
     * @return m/s
     */
    public double getSpeed() {
        return speed;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoLocation that = (GeoLocation) o;
        return timestamp == that.timestamp &&
                Double.compare(that.lat, lat) == 0 &&
                Double.compare(that.lon, lon) == 0 &&
                Double.compare(that.altitude, altitude) == 0 &&
                Double.compare(that.accuracy, accuracy) == 0 &&
                Double.compare(that.altitudeAccuracy, altitudeAccuracy) == 0 &&
                Double.compare(that.heading, heading) == 0 &&
                Double.compare(that.speed, speed) == 0 &&
                errorCode == that.errorCode;
    }

    @Override
    public int hashCode() {

        return Objects.hash(timestamp, lat, lon, altitude, accuracy, altitudeAccuracy, heading, speed, errorCode);
    }

    @Override
    public String toString() {
        return "GeoLocation{" +
                "timestamp=" + timestamp +
                ", lat=" + lat +
                ", lon=" + lon +
                ", altitude=" + altitude +
                ", accuracy=" + accuracy +
                ", altitudeAccuracy=" + altitudeAccuracy +
                ", heading=" + heading +
                ", speed=" + speed +
                ", errorCode=" + errorCode +
                '}';
    }
}
