package com.sift.api.representations;

import defpackage.aof;

/* JADX INFO: loaded from: classes.dex */
public class AndroidInstalledAppJson {

    @aof("app_name")
    public String appName;

    @aof("package_name")
    public String packageName;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidInstalledAppJson)) {
            return false;
        }
        AndroidInstalledAppJson androidInstalledAppJson = (AndroidInstalledAppJson) obj;
        String str3 = this.appName;
        String str4 = androidInstalledAppJson.appName;
        return (str3 == str4 || (str3 != null && str3.equals(str4))) && ((str = this.packageName) == (str2 = androidInstalledAppJson.packageName) || (str != null && str.equals(str2)));
    }

    public int hashCode() {
        String str = this.appName;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.packageName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AndroidInstalledAppJson.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[packageName=");
        String str = this.packageName;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(",appName=");
        String str2 = this.appName;
        sb.append(str2 != null ? str2 : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public AndroidInstalledAppJson withAppName(String str) {
        this.appName = str;
        return this;
    }

    public AndroidInstalledAppJson withPackageName(String str) {
        this.packageName = str;
        return this;
    }
}
