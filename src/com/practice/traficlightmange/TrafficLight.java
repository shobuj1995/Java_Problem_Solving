package com.practice.traficlightmange;

public class TrafficLight {
    private String lightColor;
    private int lightDuration;

    public TrafficLight(String lightColor, int lightDuration) {
        this.lightColor = lightColor;
        this.lightDuration = lightDuration;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }

    public int getLightDuration() {
        return lightDuration;
    }

    public void setLightDuration(int lightDuration) {
        this.lightDuration = lightDuration;
    }
    public boolean iscolorRed(){
        return lightColor.equals("Red");
    }
    public boolean iscolorGreen(){
        return lightColor.equals("Green");
    }

    public static void main(String[] args) {
        TrafficLight trafficLight =new TrafficLight("Red",30);
        System.out.println("Trafic light color is:"+trafficLight.getLightColor()+" Trafic Light duration is: "+trafficLight.getLightDuration());
        System.out.println("Change ligh color and duration");
        trafficLight.setLightColor("Green");
        trafficLight.setLightDuration(15);
        System.out.println("After Changin light color and duration");
        System.out.println("Trafic light color is:"+trafficLight.getLightColor()+" Trafic Light duration is: "+trafficLight.getLightDuration());
    }
}
