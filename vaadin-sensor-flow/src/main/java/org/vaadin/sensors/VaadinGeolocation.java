package org.vaadin.sensors;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasClickListeners;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("vaadin-geolocation")
@HtmlImport("vaadin-sensors.html")
public class VaadinGeolocation extends Component implements HasClickListeners {

    public VaadinGeolocation() {
    }

    public GeoLocation getLocation() {
        return null;//todo
    }
}
