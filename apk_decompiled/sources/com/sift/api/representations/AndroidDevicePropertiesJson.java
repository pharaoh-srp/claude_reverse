package com.sift.api.representations;

import defpackage.aof;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AndroidDevicePropertiesJson {

    @aof("android_id")
    public String androidId;

    @aof("app_name")
    public String appName;

    @aof("app_version")
    public String appVersion;

    @aof("build_tags")
    public String buildTags;

    @aof("device_manufacturer")
    public String deviceManufacturer;

    @aof("device_model")
    public String deviceModel;

    @aof("device_system_version")
    public String deviceSystemVersion;

    @aof("mobile_carrier_name")
    public String mobileCarrierName;

    @aof("mobile_iso_country_code")
    public String mobileIsoCountryCode;

    @aof("sdk_version")
    public String sdkVersion;

    @aof("evidence_files_present")
    public List<String> evidenceFilesPresent = new ArrayList();

    @aof("evidence_packages_present")
    public List<String> evidencePackagesPresent = new ArrayList();

    @aof("evidence_properties")
    public List<String> evidenceProperties = new ArrayList();

    @aof("evidence_directories_writable")
    public List<String> evidenceDirectoriesWritable = new ArrayList();

    @aof("installed_apps")
    public List<AndroidInstalledAppJson> installedApps = new ArrayList();

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        List<String> list2;
        String str5;
        String str6;
        String str7;
        String str8;
        List<String> list3;
        List<String> list4;
        List<AndroidInstalledAppJson> list5;
        List<AndroidInstalledAppJson> list6;
        List<String> list7;
        List<String> list8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        List<String> list9;
        List<String> list10;
        String str15;
        String str16;
        String str17;
        String str18;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidDevicePropertiesJson)) {
            return false;
        }
        AndroidDevicePropertiesJson androidDevicePropertiesJson = (AndroidDevicePropertiesJson) obj;
        String str19 = this.appVersion;
        String str20 = androidDevicePropertiesJson.appVersion;
        return (str19 == str20 || (str19 != null && str19.equals(str20))) && ((str = this.appName) == (str2 = androidDevicePropertiesJson.appName) || (str != null && str.equals(str2))) && (((str3 = this.mobileCarrierName) == (str4 = androidDevicePropertiesJson.mobileCarrierName) || (str3 != null && str3.equals(str4))) && (((list = this.evidencePackagesPresent) == (list2 = androidDevicePropertiesJson.evidencePackagesPresent) || (list != null && list.equals(list2))) && (((str5 = this.mobileIsoCountryCode) == (str6 = androidDevicePropertiesJson.mobileIsoCountryCode) || (str5 != null && str5.equals(str6))) && (((str7 = this.deviceSystemVersion) == (str8 = androidDevicePropertiesJson.deviceSystemVersion) || (str7 != null && str7.equals(str8))) && (((list3 = this.evidenceDirectoriesWritable) == (list4 = androidDevicePropertiesJson.evidenceDirectoriesWritable) || (list3 != null && list3.equals(list4))) && (((list5 = this.installedApps) == (list6 = androidDevicePropertiesJson.installedApps) || (list5 != null && list5.equals(list6))) && (((list7 = this.evidenceProperties) == (list8 = androidDevicePropertiesJson.evidenceProperties) || (list7 != null && list7.equals(list8))) && (((str9 = this.buildTags) == (str10 = androidDevicePropertiesJson.buildTags) || (str9 != null && str9.equals(str10))) && (((str11 = this.sdkVersion) == (str12 = androidDevicePropertiesJson.sdkVersion) || (str11 != null && str11.equals(str12))) && (((str13 = this.deviceModel) == (str14 = androidDevicePropertiesJson.deviceModel) || (str13 != null && str13.equals(str14))) && (((list9 = this.evidenceFilesPresent) == (list10 = androidDevicePropertiesJson.evidenceFilesPresent) || (list9 != null && list9.equals(list10))) && (((str15 = this.deviceManufacturer) == (str16 = androidDevicePropertiesJson.deviceManufacturer) || (str15 != null && str15.equals(str16))) && ((str17 = this.androidId) == (str18 = androidDevicePropertiesJson.androidId) || (str17 != null && str17.equals(str18)))))))))))))));
    }

    public int hashCode() {
        String str = this.appVersion;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.appName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mobileCarrierName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.evidencePackagesPresent;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.mobileIsoCountryCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceSystemVersion;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.evidenceDirectoriesWritable;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AndroidInstalledAppJson> list3 = this.installedApps;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.evidenceProperties;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str6 = this.buildTags;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sdkVersion;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceModel;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list5 = this.evidenceFilesPresent;
        int iHashCode13 = (iHashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str9 = this.deviceManufacturer;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.androidId;
        return iHashCode14 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AndroidDevicePropertiesJson.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[appName=");
        String str = this.appName;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(",appVersion=");
        String str2 = this.appVersion;
        if (str2 == null) {
            str2 = "<null>";
        }
        sb.append(str2);
        sb.append(",sdkVersion=");
        String str3 = this.sdkVersion;
        if (str3 == null) {
            str3 = "<null>";
        }
        sb.append(str3);
        sb.append(",mobileCarrierName=");
        String str4 = this.mobileCarrierName;
        if (str4 == null) {
            str4 = "<null>";
        }
        sb.append(str4);
        sb.append(",mobileIsoCountryCode=");
        String str5 = this.mobileIsoCountryCode;
        if (str5 == null) {
            str5 = "<null>";
        }
        sb.append(str5);
        sb.append(",deviceManufacturer=");
        String str6 = this.deviceManufacturer;
        if (str6 == null) {
            str6 = "<null>";
        }
        sb.append(str6);
        sb.append(",deviceModel=");
        String str7 = this.deviceModel;
        if (str7 == null) {
            str7 = "<null>";
        }
        sb.append(str7);
        sb.append(",deviceSystemVersion=");
        String str8 = this.deviceSystemVersion;
        if (str8 == null) {
            str8 = "<null>";
        }
        sb.append(str8);
        sb.append(",androidId=");
        String str9 = this.androidId;
        if (str9 == null) {
            str9 = "<null>";
        }
        sb.append(str9);
        sb.append(",buildTags=");
        String str10 = this.buildTags;
        if (str10 == null) {
            str10 = "<null>";
        }
        sb.append(str10);
        sb.append(",evidenceFilesPresent=");
        Object obj = this.evidenceFilesPresent;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(",evidencePackagesPresent=");
        Object obj2 = this.evidencePackagesPresent;
        if (obj2 == null) {
            obj2 = "<null>";
        }
        sb.append(obj2);
        sb.append(",evidenceProperties=");
        Object obj3 = this.evidenceProperties;
        if (obj3 == null) {
            obj3 = "<null>";
        }
        sb.append(obj3);
        sb.append(",evidenceDirectoriesWritable=");
        Object obj4 = this.evidenceDirectoriesWritable;
        if (obj4 == null) {
            obj4 = "<null>";
        }
        sb.append(obj4);
        sb.append(",installedApps=");
        List<AndroidInstalledAppJson> list = this.installedApps;
        sb.append(list != null ? list : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public AndroidDevicePropertiesJson withAndroidId(String str) {
        this.androidId = str;
        return this;
    }

    public AndroidDevicePropertiesJson withAppName(String str) {
        this.appName = str;
        return this;
    }

    public AndroidDevicePropertiesJson withAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    public AndroidDevicePropertiesJson withBuildTags(String str) {
        this.buildTags = str;
        return this;
    }

    public AndroidDevicePropertiesJson withDeviceManufacturer(String str) {
        this.deviceManufacturer = str;
        return this;
    }

    public AndroidDevicePropertiesJson withDeviceModel(String str) {
        this.deviceModel = str;
        return this;
    }

    public AndroidDevicePropertiesJson withDeviceSystemVersion(String str) {
        this.deviceSystemVersion = str;
        return this;
    }

    public AndroidDevicePropertiesJson withEvidenceDirectoriesWritable(List<String> list) {
        this.evidenceDirectoriesWritable = list;
        return this;
    }

    public AndroidDevicePropertiesJson withEvidenceFilesPresent(List<String> list) {
        this.evidenceFilesPresent = list;
        return this;
    }

    public AndroidDevicePropertiesJson withEvidencePackagesPresent(List<String> list) {
        this.evidencePackagesPresent = list;
        return this;
    }

    public AndroidDevicePropertiesJson withEvidenceProperties(List<String> list) {
        this.evidenceProperties = list;
        return this;
    }

    public AndroidDevicePropertiesJson withInstalledApps(List<AndroidInstalledAppJson> list) {
        this.installedApps = list;
        return this;
    }

    public AndroidDevicePropertiesJson withMobileCarrierName(String str) {
        this.mobileCarrierName = str;
        return this;
    }

    public AndroidDevicePropertiesJson withMobileIsoCountryCode(String str) {
        this.mobileIsoCountryCode = str;
        return this;
    }

    public AndroidDevicePropertiesJson withSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }
}
