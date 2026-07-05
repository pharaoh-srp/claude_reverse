package com.sift.api.representations;

import defpackage.aof;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MobileEventJson {

    @aof("android_app_state")
    public AndroidAppStateJson androidAppState;

    @aof("android_device_properties")
    public AndroidDevicePropertiesJson androidDeviceProperties;

    @aof("device_properties")
    public Map<String, String> deviceProperties;

    @aof("fields")
    public Map<String, String> fields;

    @aof("installation_id")
    public String installationId;

    @aof("mobile_event_type")
    public String mobileEventType;

    @aof("path")
    public String path;

    @aof("time")
    public Long time;

    @aof("user_id")
    public String userId;

    public boolean equals(Object obj) {
        AndroidDevicePropertiesJson androidDevicePropertiesJson;
        AndroidDevicePropertiesJson androidDevicePropertiesJson2;
        String str;
        String str2;
        AndroidAppStateJson androidAppStateJson;
        AndroidAppStateJson androidAppStateJson2;
        Map<String, String> map;
        Map<String, String> map2;
        Long l;
        Long l2;
        String str3;
        String str4;
        Map<String, String> map3;
        Map<String, String> map4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MobileEventJson)) {
            return false;
        }
        MobileEventJson mobileEventJson = (MobileEventJson) obj;
        String str7 = this.mobileEventType;
        String str8 = mobileEventJson.mobileEventType;
        return (str7 == str8 || (str7 != null && str7.equals(str8))) && ((androidDevicePropertiesJson = this.androidDeviceProperties) == (androidDevicePropertiesJson2 = mobileEventJson.androidDeviceProperties) || (androidDevicePropertiesJson != null && androidDevicePropertiesJson.equals(androidDevicePropertiesJson2))) && (((str = this.path) == (str2 = mobileEventJson.path) || (str != null && str.equals(str2))) && (((androidAppStateJson = this.androidAppState) == (androidAppStateJson2 = mobileEventJson.androidAppState) || (androidAppStateJson != null && androidAppStateJson.equals(androidAppStateJson2))) && (((map = this.deviceProperties) == (map2 = mobileEventJson.deviceProperties) || (map != null && map.equals(map2))) && (((l = this.time) == (l2 = mobileEventJson.time) || (l != null && l.equals(l2))) && (((str3 = this.installationId) == (str4 = mobileEventJson.installationId) || (str3 != null && str3.equals(str4))) && (((map3 = this.fields) == (map4 = mobileEventJson.fields) || (map3 != null && map3.equals(map4))) && ((str5 = this.userId) == (str6 = mobileEventJson.userId) || (str5 != null && str5.equals(str6)))))))));
    }

    public int hashCode() {
        String str = this.mobileEventType;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        AndroidDevicePropertiesJson androidDevicePropertiesJson = this.androidDeviceProperties;
        int iHashCode2 = (iHashCode + (androidDevicePropertiesJson == null ? 0 : androidDevicePropertiesJson.hashCode())) * 31;
        String str2 = this.path;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AndroidAppStateJson androidAppStateJson = this.androidAppState;
        int iHashCode4 = (iHashCode3 + (androidAppStateJson == null ? 0 : androidAppStateJson.hashCode())) * 31;
        Map<String, String> map = this.deviceProperties;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.time;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.installationId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map2 = this.fields;
        int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str4 = this.userId;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MobileEventJson.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[time=");
        Object obj = this.time;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(",path=");
        String str = this.path;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(",mobileEventType=");
        String str2 = this.mobileEventType;
        if (str2 == null) {
            str2 = "<null>";
        }
        sb.append(str2);
        sb.append(",userId=");
        String str3 = this.userId;
        if (str3 == null) {
            str3 = "<null>";
        }
        sb.append(str3);
        sb.append(",installationId=");
        String str4 = this.installationId;
        if (str4 == null) {
            str4 = "<null>";
        }
        sb.append(str4);
        sb.append(",fields=");
        Object obj2 = this.fields;
        if (obj2 == null) {
            obj2 = "<null>";
        }
        sb.append(obj2);
        sb.append(",deviceProperties=");
        Object obj3 = this.deviceProperties;
        if (obj3 == null) {
            obj3 = "<null>";
        }
        sb.append(obj3);
        sb.append(",androidDeviceProperties=");
        Object obj4 = this.androidDeviceProperties;
        if (obj4 == null) {
            obj4 = "<null>";
        }
        sb.append(obj4);
        sb.append(",androidAppState=");
        AndroidAppStateJson androidAppStateJson = this.androidAppState;
        sb.append(androidAppStateJson != null ? androidAppStateJson : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public MobileEventJson withAndroidAppState(AndroidAppStateJson androidAppStateJson) {
        this.androidAppState = androidAppStateJson;
        return this;
    }

    public MobileEventJson withAndroidDeviceProperties(AndroidDevicePropertiesJson androidDevicePropertiesJson) {
        this.androidDeviceProperties = androidDevicePropertiesJson;
        return this;
    }

    public MobileEventJson withDeviceProperties(Map<String, String> map) {
        this.deviceProperties = map;
        return this;
    }

    public MobileEventJson withFields(Map<String, String> map) {
        this.fields = map;
        return this;
    }

    public MobileEventJson withInstallationId(String str) {
        this.installationId = str;
        return this;
    }

    public MobileEventJson withMobileEventType(String str) {
        this.mobileEventType = str;
        return this;
    }

    public MobileEventJson withPath(String str) {
        this.path = str;
        return this;
    }

    public MobileEventJson withTime(Long l) {
        this.time = l;
        return this;
    }

    public MobileEventJson withUserId(String str) {
        this.userId = str;
        return this;
    }
}
