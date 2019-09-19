package com.sportmonks.endpoints;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 28/05/2016.
 */
public abstract class AbstractEndPointParams {

    private String customIncludes;
    private final Map<String, Object> additionalParams = new HashMap<>();

    public String getCustomIncludes() {
        return customIncludes;
    }

    public void setCustomIncludes(String customIncludes) {
        this.customIncludes = customIncludes;
    }

    public Map<String, Object> getAdditionalParams() {
        return additionalParams;
    }
    
    public void addAdditionalParam(String name, Object value) {
        additionalParams.put(name, value);
    }
    
}
