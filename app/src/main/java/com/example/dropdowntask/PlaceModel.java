package com.example.dropdowntask;

public class PlaceModel {
    String palcename;
    int downArrow,call,map,browser,image;
    Double lattitude,longitude;
    boolean expanded;

    public PlaceModel(String palcename, int downArrow, int call, int map, int browser, int image, Double lattitude, Double longitude) {
        this.palcename = palcename;
        this.downArrow = downArrow;
        this.call = call;
        this.map = map;
        this.browser = browser;
        this.image = image;
        this.lattitude = lattitude;
        this.longitude = longitude;
        this.expanded=false;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPalcename() {
        return palcename;
    }

    public void setPalcename(String palcename) {
        this.palcename = palcename;
    }

    public int getDownArrow() {
        return downArrow;
    }

    public void setDownArrow(int downArrow) {
        this.downArrow = downArrow;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public int getMap() {
        return map;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public int getBrowser() {
        return browser;
    }

    public void setBrowser(int browser) {
        this.browser = browser;
    }



    public Double getLattitude() {
        return lattitude;
    }

    public void setLattitude(Double lattitude) {
        this.lattitude = lattitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public boolean isExpanded() {
        return expanded;
    }
    public void setExpanded(boolean expanded){
        this.expanded=expanded;
    }
}
