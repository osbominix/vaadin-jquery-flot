package org.test.jswrapper;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JavaScript({"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js", "vaadin://js/jquery.flot.js", "vaadin://js/flot_connector.js"})
public class Flot extends AbstractJavaScriptComponent {

    public void addSeries(double[][] points) {
        List<List<Double>> pointList = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            pointList.add(Arrays.asList(Double.valueOf(points[i][0]), Double.valueOf(points[i][1])));
        }

        getState().series.add(pointList);
    }


    @Override
    public FlotState getState() {
        return (FlotState) super.getState();
    }
}