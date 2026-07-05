package com.sift.api.representations;

import defpackage.aof;

/* JADX INFO: loaded from: classes.dex */
public class AndroidDeviceLocationJson {

    @aof("latitude")
    public Double latitude;

    @aof("longitude")
    public Double longitude;

    public boolean equals(Object obj) {
        Double d;
        Double d2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidDeviceLocationJson)) {
            return false;
        }
        AndroidDeviceLocationJson androidDeviceLocationJson = (AndroidDeviceLocationJson) obj;
        Double d3 = this.latitude;
        Double d4 = androidDeviceLocationJson.latitude;
        return (d3 == d4 || (d3 != null && d3.equals(d4))) && ((d = this.longitude) == (d2 = androidDeviceLocationJson.longitude) || (d != null && d.equals(d2)));
    }

    public int hashCode() {
        Double d = this.latitude;
        int iHashCode = ((d == null ? 0 : d.hashCode()) + 31) * 31;
        Double d2 = this.longitude;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AndroidDeviceLocationJson.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[latitude=");
        Object obj = this.latitude;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(",longitude=");
        Double d = this.longitude;
        sb.append(d != null ? d : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public AndroidDeviceLocationJson withLatitude(Double d) {
        this.latitude = d;
        return this;
    }

    public AndroidDeviceLocationJson withLongitude(Double d) {
        this.longitude = d;
        return this;
    }
}
