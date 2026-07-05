package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {
    public final Status E;

    public ApiException(Status status) {
        int i = status.E;
        String str = status.F;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.E = status;
    }
}
