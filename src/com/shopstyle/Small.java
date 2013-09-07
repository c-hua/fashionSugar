
package com.shopstyle;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "sizeName",
    "width",
    "height",
    "url"
})
public class Small {

    @JsonProperty("sizeName")
    private String sizeName;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("url")
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sizeName")
    public String getSizeName() {
        return sizeName;
    }

    @JsonProperty("sizeName")
    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public Small withSizeName(String sizeName) {
        this.sizeName = sizeName;
        return this;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Small withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Small withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Small withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
