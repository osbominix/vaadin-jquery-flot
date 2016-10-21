package org.test.jswrapper;

import com.vaadin.shared.ui.JavaScriptComponentState;

import java.util.ArrayList;
import java.util.List;

public class FlotState extends JavaScriptComponentState {
    public List<List<List<Double>>> series = new ArrayList<List<List<Double>>>();
}