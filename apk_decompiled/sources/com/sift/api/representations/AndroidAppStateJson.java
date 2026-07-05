package com.sift.api.representations;

import defpackage.aof;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AndroidAppStateJson {

    @aof("activity_class_name")
    public String activityClassName;

    @aof("battery_health")
    public Long batteryHealth;

    @aof("battery_level")
    public Double batteryLevel;

    @aof("battery_state")
    public Long batteryState;

    @aof("location")
    public AndroidDeviceLocationJson location;

    @aof("network_addresses")
    public List<String> networkAddresses = new ArrayList();

    @aof("plug_state")
    public Long plugState;

    @aof("sdk_version")
    public String sdkVersion;

    public boolean equals(Object obj) {
        Long l;
        Long l2;
        String str;
        String str2;
        AndroidDeviceLocationJson androidDeviceLocationJson;
        AndroidDeviceLocationJson androidDeviceLocationJson2;
        String str3;
        String str4;
        Long l3;
        Long l4;
        List<String> list;
        List<String> list2;
        Double d;
        Double d2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidAppStateJson)) {
            return false;
        }
        AndroidAppStateJson androidAppStateJson = (AndroidAppStateJson) obj;
        Long l5 = this.plugState;
        Long l6 = androidAppStateJson.plugState;
        return (l5 == l6 || (l5 != null && l5.equals(l6))) && ((l = this.batteryState) == (l2 = androidAppStateJson.batteryState) || (l != null && l.equals(l2))) && (((str = this.activityClassName) == (str2 = androidAppStateJson.activityClassName) || (str != null && str.equals(str2))) && (((androidDeviceLocationJson = this.location) == (androidDeviceLocationJson2 = androidAppStateJson.location) || (androidDeviceLocationJson != null && androidDeviceLocationJson.equals(androidDeviceLocationJson2))) && (((str3 = this.sdkVersion) == (str4 = androidAppStateJson.sdkVersion) || (str3 != null && str3.equals(str4))) && (((l3 = this.batteryHealth) == (l4 = androidAppStateJson.batteryHealth) || (l3 != null && l3.equals(l4))) && (((list = this.networkAddresses) == (list2 = androidAppStateJson.networkAddresses) || (list != null && list.equals(list2))) && ((d = this.batteryLevel) == (d2 = androidAppStateJson.batteryLevel) || (d != null && d.equals(d2))))))));
    }

    public int hashCode() {
        Long l = this.plugState;
        int iHashCode = ((l == null ? 0 : l.hashCode()) + 31) * 31;
        Long l2 = this.batteryState;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.activityClassName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AndroidDeviceLocationJson androidDeviceLocationJson = this.location;
        int iHashCode4 = (iHashCode3 + (androidDeviceLocationJson == null ? 0 : androidDeviceLocationJson.hashCode())) * 31;
        String str2 = this.sdkVersion;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.batteryHealth;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List<String> list = this.networkAddresses;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.batteryLevel;
        return iHashCode7 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AndroidAppStateJson.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[activityClassName=");
        String str = this.activityClassName;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(",location=");
        Object obj = this.location;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(",sdkVersion=");
        String str2 = this.sdkVersion;
        if (str2 == null) {
            str2 = "<null>";
        }
        sb.append(str2);
        sb.append(",batteryLevel=");
        Object obj2 = this.batteryLevel;
        if (obj2 == null) {
            obj2 = "<null>";
        }
        sb.append(obj2);
        sb.append(",batteryState=");
        Object obj3 = this.batteryState;
        if (obj3 == null) {
            obj3 = "<null>";
        }
        sb.append(obj3);
        sb.append(",batteryHealth=");
        Object obj4 = this.batteryHealth;
        if (obj4 == null) {
            obj4 = "<null>";
        }
        sb.append(obj4);
        sb.append(",plugState=");
        Object obj5 = this.plugState;
        if (obj5 == null) {
            obj5 = "<null>";
        }
        sb.append(obj5);
        sb.append(",networkAddresses=");
        List<String> list = this.networkAddresses;
        sb.append(list != null ? list : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public AndroidAppStateJson withActivityClassName(String str) {
        this.activityClassName = str;
        return this;
    }

    public AndroidAppStateJson withBatteryHealth(Long l) {
        this.batteryHealth = l;
        return this;
    }

    public AndroidAppStateJson withBatteryLevel(Double d) {
        this.batteryLevel = d;
        return this;
    }

    public AndroidAppStateJson withBatteryState(Long l) {
        this.batteryState = l;
        return this;
    }

    public AndroidAppStateJson withLocation(AndroidDeviceLocationJson androidDeviceLocationJson) {
        this.location = androidDeviceLocationJson;
        return this;
    }

    public AndroidAppStateJson withNetworkAddresses(List<String> list) {
        this.networkAddresses = list;
        return this;
    }

    public AndroidAppStateJson withPlugState(Long l) {
        this.plugState = l;
        return this;
    }

    public AndroidAppStateJson withSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }
}
