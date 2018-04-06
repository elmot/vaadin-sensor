package org.vaadin.sensor;

import java.util.logging.Logger;

import org.vaadin.sensors.GeoLocation;
import org.vaadin.sensors.VaadinGeolocation;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {
    Logger LOG = Logger.getLogger(DemoView.class.getName());

    public DemoView() {
        VaadinGeolocation vaadinGeolocation = new VaadinGeolocation();
        add(vaadinGeolocation);
        Button getCoordinates = new Button("Get coordinates", event ->
                Notification.show("U R at:" + vaadinGeolocation.getLocation(), 1000, Notification.Position.MIDDLE)
        );
        add(getCoordinates);
    }
}
