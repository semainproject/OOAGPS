package com.example.kittaporn.ooagps;

public class BusDataGetter {
    Double hour,minute,veloBus;
    String latBus,lngBus,dates;

    public BusDataGetter(Double hour, Double minute, Double veloBus, String latBus, String lngBus, String dates) {
        this.hour = hour;
        this.minute = minute;
        this.veloBus = veloBus;
        this.latBus = latBus;
        this.lngBus = lngBus;
        this.dates = dates;
    }

    public BusDataGetter() {
    }

    public Double getHour() {
        return hour;
    }

    public Double getMinute() {
        return minute;
    }

    public Double getVeloBus() {
        return veloBus;
    }

    public String getLatBus() {
        return latBus;
    }

    public String getLngBus() {
        return lngBus;
    }

    public String getDates() {
        return dates;
    }
}
