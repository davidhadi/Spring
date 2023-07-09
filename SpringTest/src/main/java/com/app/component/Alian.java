package com.app.component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Alian {
    private List<String> alList;
    private Set<String> alSet;
    private Map<String, String> alMap;
    private Properties properties;

    public void setAlList(List<String> alList) {
        this.alList = alList;
    }

    public void setAlSet(Set<String> alSet) {
        this.alSet = alSet;
    }

    public void setAlMap(Map<String, String> alMap) {
        this.alMap = alMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Alian{" +
                "alList=" + alList +
                ", alSet=" + alSet +
                ", alMap=" + alMap +
                ", properties=" + properties +
                '}';
    }
}
