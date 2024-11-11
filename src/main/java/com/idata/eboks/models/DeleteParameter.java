package com.idata.eboks.models;

public class DeleteParameter {
    private String name;
    private String in;
    private String description;
    private boolean required;
    private LocationSchema schema;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String value) {
        this.in = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean value) {
        this.required = value;
    }

    public LocationSchema getSchema() {
        return schema;
    }

    public void setSchema(LocationSchema value) {
        this.schema = value;
    }
}