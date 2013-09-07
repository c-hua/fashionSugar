
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
    "Small",
    "Medium",
    "Large",
    "Original",
    "IPhoneSmall",
    "IPhone"
})
public class Sizes {

    @JsonProperty("Small")
    private com.shopstyle.Small Small;
    @JsonProperty("Medium")
    private com.shopstyle.Medium Medium;
    @JsonProperty("Large")
    private com.shopstyle.Large Large;
    @JsonProperty("Original")
    private com.shopstyle.Original Original;
    @JsonProperty("IPhoneSmall")
    private com.shopstyle.IPhoneSmall IPhoneSmall;
    @JsonProperty("IPhone")
    private com.shopstyle.IPhone IPhone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Small")
    public com.shopstyle.Small getSmall() {
        return Small;
    }

    @JsonProperty("Small")
    public void setSmall(com.shopstyle.Small Small) {
        this.Small = Small;
    }

    public Sizes withSmall(com.shopstyle.Small Small) {
        this.Small = Small;
        return this;
    }

    @JsonProperty("Medium")
    public com.shopstyle.Medium getMedium() {
        return Medium;
    }

    @JsonProperty("Medium")
    public void setMedium(com.shopstyle.Medium Medium) {
        this.Medium = Medium;
    }

    public Sizes withMedium(com.shopstyle.Medium Medium) {
        this.Medium = Medium;
        return this;
    }

    @JsonProperty("Large")
    public com.shopstyle.Large getLarge() {
        return Large;
    }

    @JsonProperty("Large")
    public void setLarge(com.shopstyle.Large Large) {
        this.Large = Large;
    }

    public Sizes withLarge(com.shopstyle.Large Large) {
        this.Large = Large;
        return this;
    }

    @JsonProperty("Original")
    public com.shopstyle.Original getOriginal() {
        return Original;
    }

    @JsonProperty("Original")
    public void setOriginal(com.shopstyle.Original Original) {
        this.Original = Original;
    }

    public Sizes withOriginal(com.shopstyle.Original Original) {
        this.Original = Original;
        return this;
    }

    @JsonProperty("IPhoneSmall")
    public com.shopstyle.IPhoneSmall getIPhoneSmall() {
        return IPhoneSmall;
    }

    @JsonProperty("IPhoneSmall")
    public void setIPhoneSmall(com.shopstyle.IPhoneSmall IPhoneSmall) {
        this.IPhoneSmall = IPhoneSmall;
    }

    public Sizes withIPhoneSmall(com.shopstyle.IPhoneSmall IPhoneSmall) {
        this.IPhoneSmall = IPhoneSmall;
        return this;
    }

    @JsonProperty("IPhone")
    public com.shopstyle.IPhone getIPhone() {
        return IPhone;
    }

    @JsonProperty("IPhone")
    public void setIPhone(com.shopstyle.IPhone IPhone) {
        this.IPhone = IPhone;
    }

    public Sizes withIPhone(com.shopstyle.IPhone IPhone) {
        this.IPhone = IPhone;
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
