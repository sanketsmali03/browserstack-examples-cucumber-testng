package browserstack.driverconfig;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SpecificCapabilities {

    private final Map<String, List<Capabilities>> specificCapabilitiesMap = new LinkedHashMap<>();

    @JsonAnySetter
    public void setSpecificCapabilities(String key, List<Capabilities> value) {
        this.specificCapabilitiesMap.put(key, value);
    }

    public List<Capabilities> getSpecificCapabilities(String key) {
        return this.specificCapabilitiesMap.get(key);
    }
}