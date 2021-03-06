
package org.example.api.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for EditableArtifactMetaData
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "labels",
    "properties"
})
public class EditableMetaData {

    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("description")
    private java.lang.String description;
    /**
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("")
    private List<java.lang.String> labels = new ArrayList<java.lang.String>();
    /**
     * User-defined name-value pairs. Name and value must be strings.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("User-defined name-value pairs. Name and value must be strings.")
    private Map<String, String> properties;

    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public java.lang.String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * 
     */
    @JsonProperty("labels")
    public List<java.lang.String> getLabels() {
        return labels;
    }

    /**
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<java.lang.String> labels) {
        this.labels = labels;
    }

    /**
     * User-defined name-value pairs. Name and value must be strings.
     * 
     */
    @JsonProperty("properties")
    public Map<String, String> getProperties() {
        return properties;
    }

    /**
     * User-defined name-value pairs. Name and value must be strings.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

}
